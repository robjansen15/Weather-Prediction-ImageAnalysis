package WeatherAnalysis.Save;

import WeatherAnalysis.Attributes.AttributeHandler;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

/**
 * Created by PD-Gaming on 4/28/2016.
 */
public class WriteFile {

    AttributeHandler attributes_;
    String type_;

    public WriteFile(AttributeHandler attributes, String type){
        attributes_ = attributes;
        type_ = type;
    }
    
    public void labelFile()
    {
    	try{
	    	 FileWriter writer = new FileWriter(OutputConfig.file, true); 
	    	 for(int i = 1 ; i <= 10 ; i++)
	         {
	         	for(int j = 1 ; j <= 10; j++)
	         	{
	         		writer.append("blue_hist_"+i+"_"+j+",");
	         	}
	         }
	         
	         for(int i = 1 ; i <= 10 ; i++)
	         {
	         	for(int j = 1 ; j <= 10; j++)
	         	{
	         		writer.append("red_hist_"+i+"_"+j+",");
	         	}
	         }
	         
	         for(int i = 1 ; i <= 10 ; i++)
	         {
	         	for(int j = 1 ; j <= 10; j++)
	         	{
	         		writer.append("green_hist_"+i+"_"+j+",");
	         	}
	         }
	         writer.append("\n");
    	}catch(Exception e)
    	{
    		System.out.println(e);
    	}
    }

    public void write(){
        try
        {
<<<<<<< HEAD
            FileWriter writer = new FileWriter(OutputConfig.file);

            
            // writer label
            writer.append(type_);
            
            //get blue hist and write
            for(int i = 0; i < 10; ++i) {
                //String piece = attributes_.blue_sky_.histogram_.get(i).toString();
                //writer.append(',');
                //writer.append(piece);
            }
            
            //get green hist and write
            for(int i = 0; i < 10; ++i) {
                //String piece = attributes_.temp_green_.histogram_.get(i).toString();
                writer.append(',');
               // writer.append(piece);
            }
            
            //get red hist and write
            for(int i = 0; i < 10; ++i) {
                //String piece = attributes_.temp_red_.histogram_.get(i).toString();
                writer.append(',');
                //writer.append(piece);
            }
            for(int i = 0 ; i < 10 ; i++)
            {
                //String piece = attributes_.temp_intensity_.histogram_.get(i).toString();
                writer.append(',');
                //writer.append(piece);
            }
=======
            FileWriter writer = new FileWriter(OutputConfig.file, true); 
            for(int i = 0 ; i < attributes_.blue_.size() ; i++)
            {
            	for(int j = 0 ; j < attributes_.blue_.get(i).size() ; j++)
            	{
            		writer.append(attributes_.blue_.get(i).get(j).toString());
            		writer.append(',');
            	}
            }
            
            for(int i = 0 ; i < attributes_.red_.size() ; i++)
            {
            	for(int j = 0 ; j < attributes_.red_.get(i).size() ; j++)
            	{
            		writer.append(attributes_.red_.get(i).get(j).toString());
            		writer.append(',');
            	}
            }
            
            for(int i = 0 ; i < attributes_.green_.size() ; i++)
            {
            	for(int j = 0 ; j < attributes_.green_.get(i).size() ; j++)
            	{
            		writer.append(attributes_.green_.get(i).get(j).toString());
            		writer.append(',');
            	}
            }
            writer.append(type_);
>>>>>>> be683736373b506cb4ee76f262a5cc8cf948d6da
            writer.append('\n');

//            //get the histograms
//            writer.append(type_);
//            for(int i = 0; i < 10; ++i) {
//                //String piece = attributes_.blue_sky_.histogram_.get(i).toString();
//                //writer.append(',');
//                //writer.append(piece);
//            }
//            writer.append('\n');
//
//            //generate whatever data you want
            writer.flush();
            writer.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
