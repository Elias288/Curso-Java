package Modulo_6_Colecciones.EjercicioArrayList;

import java.util.ArrayList;

public class Ejercicio_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();

        /* Agregar elementos a la lista */
        System.out.println("Lista completa");
        nombres.add("Rodrigo");
        nombres.add("Esteban");
        nombres.add("Diego");
        nombres.add("Ramiro");
        nombres.add("Julián");
        nombres.add("Marta");
        listarContenido(nombres);

        /* Eliminar elementos de la lista */
        System.out.println("\nEliminar");
        // Eliminar por nombre
        nombres.remove("Esteban");
        // Eliminar por indice
        nombres.remove(1);
        listarContenido(nombres);

        /* Buscar nombre en la lista */
        System.out.println("\nBuscar");
        if (nombres.contains("Ramiro"))
            System.out.println("- Ramiro existe en la lista");
        else
            System.out.println("- Ramiro no existe en la lista");

        if (nombres.contains("Esteban"))
            System.out.println("- Esteban existe en la lista");
        else
            System.out.println("- Esteban no existe en la lista");
    }

    static void listarContenido(ArrayList<String> lista) {
        for (String nombre : lista) {
            System.out.println("- " + nombre);
        }
    }
}
