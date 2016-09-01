package WeatherAnalysis.Attributes;

import WeatherAnalysis.Attributes.Histogram.BlueHistogram;
import WeatherAnalysis.Attributes.Histogram.GreenHistogram;
import WeatherAnalysis.Attributes.Histogram.Intensity;
import WeatherAnalysis.Attributes.Histogram.RedHistogram;
import WeatherAnalysis.Save.WriteFile;
import WeatherAnalysis.Util.Image.Pixel;
import WeatherAnalysis.Util.Image.VectorImage;
import WeatherAnalysis.Util.Parse.ParseConfig;

import javax.management.Attribute;
import java.util.Vector;


public class AttributeHandler
{

  //these are the attributes ***NOTE*** you must also write the attributes in the WriteFile.java
  public Vector<Vector> blue_ = new Vector<Vector>();
  public Vector<Vector> green_  = new Vector<Vector>();
  public Vector<Vector> red_  = new Vector<Vector>();
  public Vector<Pixel> myVector = new Vector<Pixel>();

  public BlueHistogram blue_hist_ = new BlueHistogram();
  public RedHistogram red_hist_ = new RedHistogram();
  public GreenHistogram green_hist_ = new GreenHistogram();
  public AttributeHandler(){

  }

  public AttributeHandler(VectorImage myImage){
    //this is where you decide what images should be in each histogram
    Attributes myAttribute = new Attributes();
   
    //genHist
    genHistogram(myImage,262,6,943,66);
    genHistogram(myImage,650,76,941,174);
    genHistogram(myImage,291,197,931,258);
    genHistogram(myImage,306,20,434,55);
    genHistogram(myImage,514,25,660,48);
    genHistogram(myImage,705,21,868,52);
    
    //middle
    genHistogram(myImage,572,311,767,660);
    genHistogram(myImage,1013,193,1243,651);

    //left
    genHistogram(myImage,188,13,663,228);
    genHistogram(myImage,0,0,1280,720);
  }  
    public void genHistogram(VectorImage myImage,int x, int x2, int y, int y2)
    {
	    Vector p = new Vector();
	    
	    for(int i = (x-x2) ; i <= x ; i++)
	    {
	    	for(int j = (y-y2) ; j <= y ; j++)
	    	{
	    		p.addElement(myImage.getPixel(i, j));
	    	}
	    }
	  
	    blue_hist_.generate_histogram_(p);
	    blue_.addElement(blue_hist_.histogram_);
	    
	    red_hist_.generate_histogram_(p);
	    red_.addElement(red_hist_.histogram_);
	    
	    green_hist_.generate_histogram_(p);
	    green_.addElement(green_hist_.histogram_);
    }
//    inputVector.addElement(myAttribute);
//    myAttribute.set(650,76,941,174);
//    inputVector.addElement(myAttribute);
//    myAttribute.set(291,197,931,258);
//    inputVector.addElement(myAttribute);
//    myAttribute.set(306,20,434,55);
//    inputVector.addElement(myAttribute);
//    myAttribute.set(514,25,660,48);
//    inputVector.addElement(myAttribute);
//    myAttribute.set(705,21,868,52);
//    inputVector.addElement(myAttribute);
//    //middle
//    myAttribute.set(572,311,767,660);
//    inputVector.addElement(myAttribute);
//    //right
//    myAttribute.set(1013,193,1243,651);
//    inputVector.addElement(myAttribute);
//    //left
//    myAttribute.set(13,188,228,663);
//    inputVector.addElement(myAttribute);
//    //whole image
//    myAttribute.set(0,0,1280,720);
//    inputVector.addElement(myAttribute);
//
//    //histograms
//    int numberOfAttributes = inputVector.size();
//    blue_ = new Vector<BlueHistogram>();
//    green_ = new Vector<GreenHistogram>();
//    red_ = new Vector<RedHistogram>();
//
//    blue_.setSize(numberOfAttributes);
//    green_.setSize(numberOfAttributes);
//    red_.setSize(numberOfAttributes);
//
//    for(int i = 0; i < numberOfAttributes; ++i){
//      getPixels(inputVector.get(i),myImage);
//      blue_.get(i).generate_histogram_(myVector);
//      green_.get(i).generate_histogram_(myVector);
//      red_.get(i).generate_histogram_(myVector);
//    }
//
//  }
//
//  void getPixels(Attributes myA, VectorImage img){
//    Pixel p = new Pixel();
//    for(int i = myA.getx1(); i < myA.getx2(); ++i){
//      for(int j = myA.gety1(); j < myA.gety2(); ++j){
//        p = img.getPixel(i,j);
//        myVector.addElement(p);
//      }
//    }
//  }

  public void saveAttributes(ParseConfig.Type type){
    WriteFile save = new WriteFile(this,type.toString());
    save.write();
  }

}


