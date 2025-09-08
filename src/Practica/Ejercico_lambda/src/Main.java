package Practica.Ejercico_lambda.src;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // utilizando una expresion lambda filtrar un lista de nombres los nombres que
        // empiezen por una letra especifica
        // string.startwith("m")
        // .stream() .filter()

        List<String> nombres = Arrays.asList("Ana", "Luis", "Marta", "Pedro", "homero", "micael", "juan", "daniel",
                "sebastian", "Santiago", "valentin", "camilo", "allan", "lucas");
        nombres.stream()
                .filter(nombre -> nombre.startsWith("s"))
                .forEach(nombre -> System.out.println("nombre que empieza por s " + nombre));

        /*
         * DONE: Ejercicio consumer
         * 1. modifica la lambda `imprimir` para mostrar el texto recibido en
         * mayusculas.
         * 2. Crea otra expresion lambda que imprima la longitud del texto recibido
         */
        System.out.println("\nEjercico 1");
        Consumer<String> imprimir = texto -> System.out.println("Hola " + texto);
        imprimir.accept("Mundo");

        Consumer<String> imprimirEnMayusculas = texto -> System.out.println("Hola " + texto.toUpperCase());
        imprimirEnMayusculas.accept("otro texto");

        System.out.println("\nEjercico 2");
        Consumer<String> longitudTexto = texto -> System.out.println("La longitud del texto '" + texto + "' es " + texto.length());
        longitudTexto.accept("texto");

        /*
         * DONE: Ejercicio Function
         * 3. Crea un Function<String, Integer> que devuelva la longitud de un texto
         * 4. Crea un Functio<Double, Double> que convierta grados Celsius a Fahrenheit
         * TIP: Fahrenheit = (Celsius × 1.8) + 32
         */

        System.out.println("\nEjercico 3");
        Function<String , Integer> longitudTextoenfuncion = texto -> texto.length();
        int longitud = longitudTextoenfuncion.apply("elefante");
        System.out.println("la longitud del texto es de " + longitud);

        System.out.println("\nEjercico 4");
        Function<Double , Double> conversorTemperatura = celcius -> (celcius * 1.8) + 32;
        Double celcius = 30.0;
        System.out.println("Temperatura en celcius " + celcius + "  la temperatura en fahrenheit " + conversorTemperatura.apply(celcius));



        /*
         * DONE: Ejercicio Predicate + listas
         * 5. Filtrar los números mayores a 3
         * 6. De la lista de nombres filtra solo los que empiecen con "A"
         */
        System.out.println("\nEjercico 5");
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        numeros.stream()
                .filter(filtro -> filtro > 3)
                .forEach(System.out::println);

        System.out.println("\nEjercico 6");


        List<String> nombresL = nombres.stream()
                               .filter(nombre -> nombre.toLowerCase()    .startsWith("l"))
                                .collect(Collectors.toList());
        System.out.println(nombresL);

        /*
         * DONE: Ejercicio encadenamiento de funciones
         * 7. De la lista de numeros filtra los pares y multiplicalos por 2
         * 8. De la lista de nombres filtra los que tengan una longitud menor a 5
         * letras, y conviertelos a mayusculas
         */

        System.out.println("\nEjercico 7");
        List<Integer> numerosFiltrado = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .map(numero -> numero * 2 )
                .collect(Collectors.toList());
        System.out.println(numerosFiltrado);


        System.out.println("\nEjercico 8");

        nombresL.stream()
                .filter(nombre -> nombre.length() <= 5)
                .map(nombre -> nombre.toUpperCase())
                .forEach(System.out::println);









        /*
         * TODO: Tarea final
         * 9. Recrea el ejercicio práctico de colecciones usando lambda.
         */
    }
}