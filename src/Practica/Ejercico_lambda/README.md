# Ejercicios Lambda

[Main.java](./src/Main.java)

## Ejercicio consumer

1. modifica la lambda `imprimir` para mostrar el texto recibido en * mayusculas.
2. Crea otra expresion lambda que imprima la longitud del texto recibido

```java
Consumer<String> imprimir = texto -> System.out.println("Hola " + texto);
imprimir.accept("Mundo");
```

## Ejercicio Function

3. Crea un `Function<String, Integer>` que devuelva la longitud de un texto
4. Crea un `Functio<Double, Double>` que convierta grados Celsius a Fahrenheit

> TIP: Fahrenheit = (Celsius × 1.8) + 32

## Ejercicio Predicate + listas

5. Filtrar los números mayores a 3
6. De la lista de nombres filtra solo los que empiecen con "A"

```java
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
```

## Ejercicio encadenamiento de funciones

7. De la lista de numeros filtra los pares y multiplicalos por 2
8. De la lista de nombres filtra los que tengan una longitud menor a 5 letras, y conviertelos a mayusculas

## Tarea final

9. Recrea el ejercicio práctico de colecciones usando lambda.
