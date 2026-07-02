package ExercícioProva2.DataBase;

public class Principal {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        ConfigurationManager connectionManager = ConfigurationManager.getInstance();
        System.out.println(configManager.getConfiguration());
        System.out.println(configManager == connectionManager);
    }
}