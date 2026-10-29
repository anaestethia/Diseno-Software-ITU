# Ejercicio 2 - Gestor de conexiones a base de datos

`DatabaseConnectionManager` mantiene una única conexión simulada. Las
operaciones de consulta y actualización comparten y verifican el estado de esa
conexión.

```bash
javac -d out src/*.java
java -cp out Main
```
