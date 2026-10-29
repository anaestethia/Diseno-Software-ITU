import java.io.IOException;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        ConfigurationManager configuration = ConfigurationManager.getInstance();
        configuration.load(Paths.get("src", "config.properties"));
        System.out.println("Aplicación: " + configuration.get("app.name"));
        System.out.println("Modo: " + configuration.get("app.mode"));
    }
}
