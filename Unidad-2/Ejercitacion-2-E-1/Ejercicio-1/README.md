# Ejercicio 1 - Configuración inicial

`ConfigurationManager` implementa un Singleton de inicialización diferida,
carga las propiedades desde `src/config.properties` una sola vez y permite
consultarlas por clave.

```bash
javac -d out src/*.java
java -cp out Main
```
