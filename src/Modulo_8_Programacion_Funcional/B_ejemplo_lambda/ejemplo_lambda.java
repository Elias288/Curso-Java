package Modulo_8_Programacion_Funcional.B_ejemplo_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ejemplo_lambda {

    public static void APIFuncionales() {
        /* ----------------------- Lambda base ----------------------- */
        // no recibe parámetros, no retorna nada
        Runnable r = () -> System.out.println("Hola mundo desde un lambda");
        r.run();

        /* ----------------------- Lambda con parametros ----------------------- */
        // recibe un parámetro, no retorna nada
        Consumer<String> imprimir = texto -> System.out.println("Mensaje: " + texto);

        imprimir.accept("Hola mundo, hola Agustin");

        /* ----------------------- Lambda con retorno ----------------------- */
        // recibe un parámetro, retorna un valor
        Function<Integer, Integer> duplicar = x -> x * 2;

        System.out.println("El doble de 5 es: " + duplicar.apply(5));

        /* ----------------------- Lambda sin parámetros ----------------------- */
        // no recibe parámetros, retorna un valor
        Supplier<Double> numeroAleatorio = () -> Math.random();
        System.out.println("Número aleatorio: " + numeroAleatorio.get());

        /* ---------------- Lambda con parámetro retornando booleano ---------------- */
        // recibe un parámetro, retorna un booleano
        Predicate<Integer> esPar = numero -> numero % 2 == 0;
        System.out.println("4 es par: " + esPar.test(4)); // true
        System.out.println("5 es par: " + esPar.test(5)); // false
    }

    public static void main(String[] args) {

        APIFuncionales();

        /* ----------------------- Recorrer listas con lambda ----------------------- */

        List<String> nombres = Arrays.asList("Ana", "Luis", "Marta", "Pedro");

        // ForEach ejecuta la accion por cada elemento de la lista
        nombres.stream().forEach(nombre -> System.out.println("Hola " + nombre));

        /* ----------------------- Filtrar con lambda ----------------------- */

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        // filter filtra segun la expresion labmda (Predicate) recibido
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(numero -> System.out.println("Número par: " + numero));

        /* ----------------------- Mapear con lambda ----------------------- */

        // Map crea una lista nueva con los valores modificados
        List<String> enMayusculas = nombres.stream()
                .map(n -> n.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(enMayusculas);

        /* --------------------- Filtrar y mapear con lambda --------------------- */

        List<Integer> numeros2 = Arrays.asList(1, 2, 3, 4, 5, 6);

        // filter filtra los numeros pares y el map multiplica cada uno por si mismo
        numeros2.stream()
                .filter(n -> n % 2 == 0) // me quedo con pares
                .map(n -> n * n) // los elevo al cuadrado
                .forEach(n -> System.out.println(n));

        /* ----------------------- Ordenar con labmda ----------------------- */

        // Sort dependiendo si el resultado es true o false reorgnaiza el contenido
        // CompareTo devuelve un booleano comparando 2 string devolviendo true o false
        // si estan ordenandos alfabeticamente
        nombres.sort((a, b) -> b.compareTo(a));
        System.out.println(nombres);
    }
}
