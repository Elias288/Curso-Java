package Practica.Ejercico_lambda.src;

import java.util.*;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        // utilizando una expresion lambda filtrar un lista de nombres los nombres que
        // empiezen por una letra especifica
        // string.startwith("m")
        // .stream() .filter()

        List<String> nombres = Arrays.asList("Ana", "Luis", "Marta", "Pedro", "homero", "micael", "juan", "daniel",
                "sebastian", "santiago", "valentin", "camilo", "allan", "lucas");
        nombres.stream()
                .filter(nombre -> nombre.startsWith("s"))
                .forEach(nombre -> System.out.println("nombre que empieza por s " + nombre));

        /*
         * DONE: Ejercicio consumer
         * 1. modifica la lambda `imprimir` para mostrar el texto recibido en
         * mayusculas.
         * 2. Crea otra expresion lambda que imprima la longitud del texto recibido
         */
        Consumer<String> imprimir = texto -> System.out.println("Hola " + texto);
        imprimir.accept("Mundo");

        Consumer<String> imprimirEnMayusculas = texto -> System.out.println("Hola " + texto.toUpperCase());
        imprimirEnMayusculas.accept("otro texto");

        Consumer<String> longitudTexto = texto -> System.out.println("La longitud del texto '" + texto + "' es " + texto.length());
        longitudTexto.accept("texto");

        /*
         * TODO: Ejercicio Function
         * 3. Crea un Function<String, Integer> que devuelva la longitud de un texto
         * 4. Crea un Functio<Double, Double> que convierta grados Celsius a Fahrenheit
         * TIP: Fahrenheit = (Celsius × 1.8) + 32
         */

        /*
         * TODO: Ejercicio Predicate + listas
         * 5. Filtrar los números mayores a 3
         * 6. De la lista de nombres filtra solo los que empiecen con "A"
         */
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        /*
         * TODO: Ejercicio encadenamiento de funciones
         * 7. De la lista de numeros filtra los pares y multiplicalos por 2
         * 8. De la lista de nombres filtra los que tengan una longitud menor a 5
         * letras, y conviertelos a mayusculas
         */

        /*
         * TODO: Tarea final
         * 9. Recrea el ejercicio práctico de colecciones usando lambda.
         */
    }
}