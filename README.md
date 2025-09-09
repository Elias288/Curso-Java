# Curso Java
Ejemplos y ejercicios prácticos de java

- Prácticas
  - [Biblioteca](./src/Practica/ejercicio_final_colecciones/README.md)
  - [Ejercicio de Colecciones](./src/Practica/Ejercicio_practico_colecciones/README.md)
  - [Ejercicio Final de Colecciones](./src/Practica/ejercicio_final_colecciones/README.md)
  - [Ejercicio Lambdas](./src/Practica/Ejercico_lambda/README.md)
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
- [Módulo 8 - Programación Funcional y Expresiones Labmda](./src/Modulo_8_Programacion_Funcional/Readme.md)
  - [Ejemplo de Inmutabilidad](./src/Modulo_8_Programacion_Funcional/A_ejemplo_inmutabilidad_duplicarContenido/ejemplo_inmutabilidad.java)
  - [Ejemplo de expresión lambda](./src/Modulo_8_Programacion_Funcional/B_ejemplo_lambda/ejemplo_lambda.java)
- [Módulo 9 - Concurrencia y programación multihilo](./src/Modulo_9_Concurrencia_y_multihilo/README.md)
  - [Ejemplo extención Thread](./src/Modulo_9_Concurrencia_y_multihilo/A_ejemplo_thread.java)
  - [Ejemplo implementación Runnable](./src/Modulo_9_Concurrencia_y_multihilo/B_ejemplo_Runnable.java)
  - [Ejemplo concurrencia](./src/Modulo_9_Concurrencia_y_multihilo/C_ejemplo_concurrencia_multihilo.java)
  - [Ejemplo Sincronización y comunicación](./src/Modulo_9_Concurrencia_y_multihilo/D_ejemplo_Sincronizacion_y_Comunicacion.java)
  - [Ejemplo Sincronización con wait y notify](./src/Modulo_9_Concurrencia_y_multihilo/E_ejemplo_semaforo.java)

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
