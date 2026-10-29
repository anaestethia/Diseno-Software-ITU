public class Main {
    public static void main(String[] args) {
        DatabaseConnectionManager database = DatabaseConnectionManager.getInstance();
        System.out.println(database.executeQuery("SELECT * FROM usuarios"));
        System.out.println("Filas modificadas: "
                + database.executeUpdate("UPDATE usuarios SET activo = true"));
        System.out.println("Conexión activa: " + database.isConnected());
    }
}
