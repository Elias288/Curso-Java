package Modulo_7_Busquedas.A_ejemploSecuencial;

public class Ejemplo_secuencial {
    public static void main(String[] args) {
        int[] lista = { 1, 5, 18, 3, 7, 9, 23, 5, 11, 2 };

        int resultado = busquedaSecuencial(lista, 9);
        int resultado2 = busquedaSecuencial(lista, 50);

        System.out.println("Resultados:");
        System.out.println("Valor buscado (9) está en la posición: " + resultado);
        System.out.println("Valor buscado (50) está en la posición: " + resultado2);
    }

    static int busquedaSecuencial(int[] lista, int busqueda) {
        /*
         * Si encuentra la posición, la variable cambiará de valor por la posición del
         * valor buscado, en caso contrario mantiene su valor de -1
         */
        int posicion = -1;

        /*
         * Recorre secuencialmente la lista, comprobando si coincide con el valor
         * buscado
         */
        for (int i = 0; i < lista.length; i++) {
            // Si lo encuentra cambia el valor de la posición
            if (lista[i] == busqueda)
                posicion = i;
        }

        return posicion;
    }
}
