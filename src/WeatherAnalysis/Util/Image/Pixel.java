package WeatherAnalysis.Util.Image;

public class Pixel
{
  public int r_;
  public int g_;
  public int b_;
  public int intensity_;

  public Pixel()
  {
    r_ = 0;
    g_ = 0;
    b_ = 0;
    intensity_ = 0;
  }

  public Pixel(int r, int g, int b)
  {
    r_ = r;
    g_ = g;
    b_ = b;
    intensity_ = calcIntensity(r,g,b);
  }

  public void setRed(int r)
  {
    r_ = r;
  }
  public void setGreen(int g)
  {
    g_ = g;
  }
  public void setBlue(int b)
  {
    b_ = b;
  }
  public void setIntensity(int intensity){ intensity_ = intensity; }

  public int getRed()
  {
    return r_;
  }
  public int getBlue()
  {
    return b_;
  }
  public int getGreen()
  {
    return g_;
  }
  public int getIntensity()
  {
    return intensity_;
  }

  public int calcIntensity(int r, int g, int b) { return (r + g + b) / 3; }

}
