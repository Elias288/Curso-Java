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

        Runnable r = () -> System.out.println("Hola mundo desde un lambda");
        r.run();

        /* ----------------------- Lambda con parametros ----------------------- */

        Consumer<String> imprimir = texto -> System.out.println("Mensaje: " + texto);
        imprimir.accept("Hola mundo");

        /* ----------------------- Lambda con retorno ----------------------- */

        Function<Integer, Integer> duplicar = x -> x * 2;
        System.out.println("El doble de 5 es: " + duplicar.apply(5));

        /* ----------------------- Lambda sin parámetros ----------------------- */

        Supplier<Double> numeroAleatorio = () -> Math.random();
        System.out.println("Número aleatorio: " + numeroAleatorio.get());

        /* ---------------- Lambda con parámetro retornando booleano ---------------- */

        Predicate<Integer> esPar = numero -> numero % 2 == 0;
        System.out.println("4 es par: " + esPar.test(4)); // true
        System.out.println("5 es par: " + esPar.test(5)); // false
    }

    public static void main(String[] args) {

        APIFuncionales();

        /* ----------------------- Recorrer listas con lambda ----------------------- */

        List<String> nombres = Arrays.asList("Ana", "Luis", "Marta", "Pedro");
        nombres.forEach(nombre -> System.out.println("Hola " + nombre));

        /* ----------------------- Filtrar con lambda ----------------------- */

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Números pares: " + pares);

        /* ----------------------- Mapear con lambda ----------------------- */

        List<String> enMayusculas = nombres.stream()
                .map(n -> n.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(enMayusculas);

        /* --------------------- Filtrar y mapear con lambda --------------------- */

        List<Integer> numeros2 = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> resultado = numeros2.stream()
                .filter(n -> n % 2 == 0) // me quedo con pares
                .map(n -> n * n) // los elevo al cuadrado
                .collect(Collectors.toList());

        System.out.println(resultado);

        /* ----------------------- Ordenar con labmda ----------------------- */
        nombres.sort((a, b) -> b.compareTo(a));
        System.out.println(nombres);
    }
}
