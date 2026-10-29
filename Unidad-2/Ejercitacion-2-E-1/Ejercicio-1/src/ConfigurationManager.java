import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

public final class ConfigurationManager {
    private Properties properties;

    private ConfigurationManager() {
    }

    private static class Holder {
        private static final ConfigurationManager INSTANCE = new ConfigurationManager();
    }

    public static ConfigurationManager getInstance() {
        return Holder.INSTANCE;
    }

    public synchronized void load(Path file) throws IOException {
        if (properties != null) {
            throw new IllegalStateException("La configuración ya fue cargada.");
        }

        Properties loaded = new Properties();
        try (InputStream input = Files.newInputStream(file)) {
            loaded.load(input);
        }
        properties = loaded;
    }

    public synchronized String get(String key) {
        if (properties == null) {
            throw new IllegalStateException("La configuración todavía no fue cargada.");
        }
        String value = properties.getProperty(key);
        if (value == null) {
            throw new IllegalArgumentException("No existe la clave de configuración: " + key);
        }
        return value;
    }
}
