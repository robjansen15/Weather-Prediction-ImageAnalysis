package Classifier.SVM;

import weka.core.Instances;
import weka.core.Instance;
import weka.core.converters.ConverterUtils.DataSource;
import weka.classifiers.functions.SMO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class SVM {

	public static void main(String args[]) throws Exception
	{
		DataSource source = new DataSource("/Users/nickhubbard/Desktop/iris.arff");
		Instances ds = source.getDataSet();
		
		ds.setClassIndex(ds.numAttributes()-1);
		int numClasses = ds.numClasses();
		
		System.out.println(numClasses);
		
		for(int i = 0; i < numClasses; i++)
		{
			String classValue = ds.classAttribute().value(i);
			System.out.println("Class Value " + i + " is " + classValue);
		}
		
		SMO net = new SMO();
		net.buildClassifier(ds);
		
		DataSource source1 = new DataSource("/Users/nickhubbard/Desktop/unknown.arff");
		Instances test = source1.getDataSet();
		
		test.setClassIndex(test.numAttributes()-1);
		
		System.out.println("===================");
		System.out.println("Actual Class, Class Pred");
		
		int correct = 0;
		
		for(int i  = 0; i < test.numInstances(); i++)
		{
			double actClass = test.instance(i).classValue();
			String act = test.classAttribute().value((int) actClass);
			
			Instance newInst = test.instance(i);
			double pred = net.classifyInstance(newInst);
			
			String predString = test.classAttribute().value((int) pred);
			System.out.println(act + " , " + predString);
			
			if(act.equals(predString))
			{
				correct++;
			}
		}
			
		System.out.println(correct);
		System.out.println(test.numInstances());
		
	}
	
}
