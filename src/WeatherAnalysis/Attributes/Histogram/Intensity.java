package WeatherAnalysis.Attributes.Histogram;

import WeatherAnalysis.Util.Image.Pixel;

import java.util.Vector;

/**
 * Created by PD-Gaming on 4/28/2016.
 */

/*
This class takes in a vector and analyzes the intensity vector and divides the different shades of blue into 10 bins
 */
public class Intensity {

    public Vector histogram_;

    public Intensity(){
        histogram_= new Vector(10);
    }

    public void generate_histogram_(Vector<Pixel> a) {
        Vector temp = new Vector(10);
        for (int i = 0; i < 10; i++) {
            temp.add(0);
        }

        for (int i = 0; i < a.size(); i++) {
            temp.set((a.get(i).intensity_/ 25), (int) temp.get(a.get(i).intensity_/ 25) + 1);
        }
        histogram_ = temp;
    }
}
