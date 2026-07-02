package ExercícioProva2.DataBase;

public class ConfigurationManager {
    private static ConfigurationManager instance;

    private ConfigurationManager() {
        
    }

    public static ConfigurationManager getInstance(){
        if(instance == null){
            instance = new ConfigurationManager();
        }

        return instance;
    }


    public String getConfiguration() {
        return "Config Data";
    }
}