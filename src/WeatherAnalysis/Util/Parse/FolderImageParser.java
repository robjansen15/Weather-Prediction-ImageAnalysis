package WeatherAnalysis.Util.Parse;

import WeatherAnalysis.Attributes.AttributeHandler;
import WeatherAnalysis.Util.Image.VectorImage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * Created by PD-Gaming on 4/28/2016.
 */
public class FolderImageParser {
    public FolderImageParser(){
        classify();
    }

    public void classify(){

        //finish this, I got the directories, now I ahve to get each image in directory
        ImageType type = new ImageType();

        //get each directory
        for(int i = 1; i < ParseConfig.FolderNames.length; ++i){
            //sets the type based on the name and is used for the label
            type.typeOfDay(ParseConfig.FolderNames[i]);

            //gets the directory and lists the files in an array
            File folder = new File(ParseConfig.directory + "/" + ParseConfig.FolderNames[i]);
            File[] listOfFiles = folder.listFiles();

            //add attributes
            for (int x = 0; x < listOfFiles.length; x++) {
                if (listOfFiles[x].isFile()) {
                    String fileName = listOfFiles[x].getName();

                    try {
                    	System.out.println(ParseConfig.directory + "/" + ParseConfig.FolderNames[i]+"/"+fileName);
                        File file = new File(ParseConfig.directory + "/" + ParseConfig.FolderNames[i]+"/"+fileName);
                        BufferedImage bufImg = ImageIO.read(file);
                        VectorImage myImage = new VectorImage(bufImg);
                        AttributeHandler attributes = new AttributeHandler(myImage);
                        attributes.saveAttributes(type.getType());

                    } catch (Exception e) {
                        System.out.println(e);
                    }

                }
            }
        }



    }
}
