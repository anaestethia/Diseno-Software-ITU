public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log(Logger.Level.INFO, "Aplicación iniciada.");
        logger.log(Logger.Level.WARNING, "Espacio de almacenamiento bajo.");
        logger.log(Logger.Level.ERROR, "No se pudo completar la operación.");
    }
}
