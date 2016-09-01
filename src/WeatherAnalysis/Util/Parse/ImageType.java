package WeatherAnalysis.Util.Parse;

/**
 * Created by PD-Gaming on 4/28/2016.
 */

public class ImageType {

    ParseConfig.Type type_;
    int string_loc_;


    public ImageType(){
        type_ = ParseConfig.Type.NONE;
        string_loc_ = 0;
    }

    public ImageType(ParseConfig.Type type){
        setType(type);
    }

    public void setType(ParseConfig.Type type){
        type_ = type;
    }

    ParseConfig.Type getType(){
        return type_;
    }

    public void typeOfDay(String dirName){
        ImageType type;
        switch(dirName){
            case "Cloudy":
                setType(ParseConfig.Type.CLOUDY);
                string_loc_ = 1;
                break;
            case "Dark":
                setType(ParseConfig.Type.DARK);
                string_loc_ = 2;
                break;
            case "Rainy":
                setType(ParseConfig.Type.RAINY);
                string_loc_ = 3;
                break;
            case "Snowing":
                setType(ParseConfig.Type.SNOWING);
                string_loc_ = 4;
                break;
            case "Sunny - Behind":
                setType(ParseConfig.Type.SUNNY_BEHIND);
                string_loc_ = 5;
                break;
            case "Sunny - Facing":
                setType(ParseConfig.Type.SUNNY_FACING);
                string_loc_ = 6;
                break;
            default:
                setType(ParseConfig.Type.NONE);
                string_loc_ = 0;
                break;

        }
    }


}
