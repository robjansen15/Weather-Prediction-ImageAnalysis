package WeatherAnalysis.Attributes;

import javax.management.Attribute;

/**
 * Created by PD-Gaming on 5/1/2016.
 */
public class Attributes {

    public int x1_;
    public int x2_;
    public int y1_;
    public int y2_;

    public int getx1(){
        return x1_;
    }
    public int getx2(){
        return x2_;
    }
    public int gety1(){
        return y1_;
    }
    public int gety2(){ return y2_; }


    public void set(int x1, int x2, int y1, int y2){
        x1_ = x1;
        x2_ = x2;
        y1_ = y1;
        y2_ = y2;
    }

    public Attributes(int x1, int x2, int y1, int y2){
        x1_ = x1;
        x2_ = x2;
        y1_ = y1;
        y2_ = y2;
    }

    public Attributes(){
        x1_ = 0;
        x2_ = 0;
        y1_ = 0;
        y2_ = 0;
    }
}
