package WeatherAnalysis.Util.Image;

import java.awt.image.BufferedImage;
import java.util.Vector;
import java.awt.Color;
import java.lang.Throwable;

/**
 * Created by PD-Gaming on 4/28/2016.
 */
public class VectorImage {

    //2d Image with Pixels values
    Vector<Vector<Pixel>> Image_;
    int width_;
    int height_;

    public VectorImage(){
        Image_ = new Vector<Vector<Pixel>>();
        width_ = 0;
        height_ = 0;
    }

    public VectorImage(BufferedImage img){
        Image_ = new Vector<Vector<Pixel>>();
        width_ = img.getWidth();
        height_ = img.getHeight();
        fillImage(img);
    }


    public Pixel getPixel(int x, int y){
        return Image_.get(x).get(y);
    }


    public void fillImage(BufferedImage img){
        Vector<Pixel> temp = new Vector<Pixel>();
        for(int i = 0 ; i < img.getWidth(); i++)
        {
            for(int j = 0 ; j < img.getHeight() ; j++)
            {
                Color c = new Color(img.getRGB(i,j));
                int r = c.getRed();
                int g = c.getGreen();
                int b = c.getBlue();
                Pixel myPixel = new Pixel(r,g,b);
                temp.addElement(myPixel);
            }
            Image_.addElement(temp);
        }
    }
}

