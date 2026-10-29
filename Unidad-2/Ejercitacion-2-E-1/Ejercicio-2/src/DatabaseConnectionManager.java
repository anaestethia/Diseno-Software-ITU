public final class DatabaseConnectionManager {
    private boolean connected;

    private DatabaseConnectionManager() {
        connected = true;
        System.out.println("Conexión física simulada establecida.");
    }

    private static class Holder {
        private static final DatabaseConnectionManager INSTANCE =
                new DatabaseConnectionManager();
    }

    public static DatabaseConnectionManager getInstance() {
        return Holder.INSTANCE;
    }

    public synchronized String executeQuery(String query) {
        ensureConnected();
        return "Consulta ejecutada: " + query;
    }

    public synchronized int executeUpdate(String statement) {
        ensureConnected();
        System.out.println("Actualización ejecutada: " + statement);
        return 1;
    }

    public synchronized boolean isConnected() {
        return connected;
    }

    private void ensureConnected() {
        if (!connected) {
            throw new IllegalStateException("La conexión no está activa.");
        }
    }
}
