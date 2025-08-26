package Modulo_8_Programacion_Funcional.A_ejemplo_inmutabilidad_duplicarContenido;

import java.util.*;

public class ejemplo_inmutabilidad {

    /* Recibe como parámetro la lista inmutable */
    public static List<Integer> duplicarContenido(List<Integer> listaInmutable) {
        // Crea una copia vacia
        List<Integer> copia = new ArrayList<>();

        // Recorre la lista inmutable y va cargando los valores duplicados a la copia
        for (int n : listaInmutable)
            copia.add(n * 2);

        // Retorna la copia
        return copia;
    }

    public static void main(String[] args) {
        List<Integer> listaInmutable = List.of(4, 5, 2, 8, 10, 15);

        List<Integer> nuevaLista = duplicarContenido(listaInmutable);

        System.out.println("Origianal " + listaInmutable);
        System.out.println("Copia Duplicada " + nuevaLista);

    }
}