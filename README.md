# Curso Java
Ejemplos y ejercicios prácticos de java

- Prácticas
  - [Biblioteca](./src/Practica/ejercicio_final_colecciones/Readme.md)
  - [Ejercicio de Colecciones](./src/Practica/Ejercicio_practico_colecciones/README.md)
- [Módulo extra - Git/Github](https://docs.google.com/presentation/d/1DqdbNjNjkL9wKToBH1xh6Dyu0GY6jptj3OxJCCpiMsY/edit?usp=sharing)
- Módulo 5 - Programación orientada a objetos en Java
  - [Ejercicio de Animales](./src/Modulo_5_OOP/Animales/EjercicioAnimales.java)
  - [Ejercicio Calculadora](./src/Modulo_5_OOP/Calculadora/Calculadora.java)
- [Módulo 6 - Colecciones](https://docs.google.com/presentation/d/1pZ9S404tYY_pRcLW1E9jR-Og8yTd7ljYmge0Dt_zZDA/edit?usp=sharing)
  - [Ejercicio de ArrayList](./src/Modulo_6_Colecciones/EjercicioArrayList/Ejercicio_ArrayList.java)
  - [Ejercicio de HashMap/HashTree](./src/Modulo_6_Colecciones/EjercicioHashMap/Ejercicio_HashMap.java)
  - [Ejercicio de Iteradores y recorrido](./src/Modulo_6_Colecciones/EjercicioIteradoresYRecorrido/IteradoresYRecorridos.java)
- [Módulo 7 - Búsquedas](https://docs.google.com/presentation/d/1mzrwg0wu2sRdQLI068M6qc6vpk8m5ucGJqZ0bBUzbSY/edit?usp=sharing)
  - [Ejercicio búsqueda secuencial](./src/Modulo_7_Busquedas/A_ejemploSecuencial/Ejemplo_secuencial.java)
  - [Ejercicio búsqueda binaria](./src/Modulo_7_Busquedas/B_ejemploBinario/Ejemplo_binario.java)

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
