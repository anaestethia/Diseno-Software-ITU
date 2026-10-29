import java.time.Instant;

public final class Logger {
    public enum Level {
        INFO,
        WARNING,
        ERROR
    }

    private Logger() {
    }

    private static class Holder {
        private static final Logger INSTANCE = new Logger();
    }

    public static Logger getInstance() {
        return Holder.INSTANCE;
    }

    public synchronized void log(Level level, String message) {
        if (level == null || message == null) {
            throw new IllegalArgumentException("El nivel y el mensaje son obligatorios.");
        }
        System.out.printf("%s [%s] %s%n", Instant.now(), level, message);
    }
}
