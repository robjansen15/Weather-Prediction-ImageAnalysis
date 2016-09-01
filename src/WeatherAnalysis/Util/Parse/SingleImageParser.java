package WeatherAnalysis.Util.Parse;

import WeatherAnalysis.Attributes.AttributeHandler;
import WeatherAnalysis.Util.Image.VectorImage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Scanner;


/**
 * Created by PD-Gaming on 4/28/2016.
 */
public class SingleImageParser {

    public SingleImageParser(){
        classify();
    }

    public void classify() {
        String input = ParseConfig.demo;
        Scanner reader = new Scanner(System.in);  // Reading from System.in

        try {
            File file = new File(input);
            BufferedImage bufImg = ImageIO.read(file);
            VectorImage myImage = new VectorImage(bufImg);
            AttributeHandler attributes = new AttributeHandler(myImage);
            attributes.saveAttributes(ParseConfig.Type.NONE);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
