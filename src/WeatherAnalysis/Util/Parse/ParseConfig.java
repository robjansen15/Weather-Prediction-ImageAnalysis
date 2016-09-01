package WeatherAnalysis.Util.Parse;

/**
 * Created by PD-Gaming on 4/28/2016.
 */
public class ParseConfig {

    public static final String directory = "/Users/nickhubbard/Desktop/Pictures";
    public static final String demo = "/Users/nickhubbard/Desktop/demo.png";

    //need to change in image types if you want to add a type
    public enum Type{
        CLOUDY,DARK,RAINY,SNOWING,SUNNY_BEHIND,SUNNY_FACING,NONE
    }

    //must match the enum
    public static final String[] FolderNames = {
            "NONE",
            "Cloudy",
            "Dark",
            "Rainy",
            "Snowing",
            "Snowing",
            "Sunny - Behind",
            "Sunny - Facing"
    };




}
