# Curso Java
Ejemplos y ejercicios prácticos de java

- Modulo 5 - Programación orientada a objetos en Java
  - [Ejercicio de Animales](./src/Modulo_5_OOP/Animales/EjercicioAnimales.java)
  - [Ejercicio Calculadora](./src/Modulo_5_OOP/Calculadora/Calculadora.java)
- [Modulo 6 - Colecciones](https://docs.google.com/presentation/d/1pZ9S404tYY_pRcLW1E9jR-Og8yTd7ljYmge0Dt_zZDA/edit?usp=sharing)
  - [Ejercicio de ArrayList](./src/Modulo_6_Colecciones/EjercicioArrayList/Ejercicio_ArrayList.java)
  - [Ejercicio de HashMap/HashTree](./src/Modulo_6_Colecciones/EjercicioHashMap/Ejercicio_HashMap.java)

## Compilación sin IDE

Si el IDE no tiene compilación, desde la consola para hacer la compilación de todos los archivos `.java` en el directorio `build/`

```sh
mkdir -p build
javac -d build/ ./*.java
```

Ejecutar
```sh
cd build/
java <main> # sin extensión
```
