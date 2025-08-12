package Modulo_7_Busquedas.B_ejemploBinario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Ejemplo_binario {
    public static void main(String[] args) {
        TreeSet<Integer> lista = new TreeSet<Integer>(Arrays.asList(1, 2, 3, 5, 7, 9, 11, 18, 23));
        // valores: 01, 02, 03, 05, 07, 09, 11, 18, 23
        // indices: 00, 01, 02, 03, 04, 05, 06, 07, 08

        int resultado = busquedaBinaria(lista, 9);
        int resultado2 = busquedaBinaria(lista, 50);
        int resultado3 = busquedaBinaria(lista, 18);

        System.out.println("Resultados:");
        System.out.println("Valor buscado (9) está en la posición: " + resultado);
        System.out.println("Valor buscado (50) está en la posición: " + resultado2);
        System.out.println("Valor buscado (18) está en la posición: " + resultado3);
    }

    static int busquedaBinaria(TreeSet<Integer> lista, int valorBuscado) {
        List<Integer> listaOrdenada = new ArrayList<>(lista);
        int izquierda = 0;
        int derecha = lista.size() - 1;

        /*
         * Recorre la lista, comprobando si coincide con el valor
         * buscado
         */
        while (izquierda <= derecha) {
            // Obtiene el indice medio entre la izquierda y la derecha
            int indiceMedio = izquierda + (derecha - izquierda) / 2;
            // Obtiene el valor que corresponda al indice medio
            int valorMedio = listaOrdenada.get(indiceMedio);

            if (valorMedio == valorBuscado)
                // Si el valor del medio es igual al buscado finaliza
                return indiceMedio;
            else if (valorBuscado < valorMedio)
                /*
                 * Si el valor buscado es menor al valor del medio ignora todo lo que esté
                 * despues del medio
                 */
                derecha = indiceMedio - 1;
            else
                /*
                 * Si el valor buscado es mayor al valor del medio ignora todo lo anterior al
                 * medio
                 */
                izquierda = indiceMedio + 1;
        }

        // Si llaga acá no encontró el valor buscado y finaliza
        return -1;
    }
}
