package Modulo_6_Colecciones.EjercicioIteradoresYRecorrido;

import java.util.Iterator;
import java.util.LinkedList;

public class IteradoresYRecorridos {
    public static void main(String[] args) {
        // Crear una lista de tareas
        LinkedList<String> tareas = new LinkedList<>();
        tareas.add("Comprar leche");
        tareas.add("Estudiar para el examen");
        tareas.add("Pagar facturas");
        tareas.add("Hacer ejercicio");

        // Recorrer con un Iterator
        System.out.println("Recorrido con Iterator:");
        Iterator<String> iterador = tareas.iterator();
        while (iterador.hasNext()) {
            String tarea = iterador.next();
            System.out.println("- " + tarea);
        }

        System.out.println("\nRecorrido con for-each:");
        // Recorrer con for-each (sintaxis simplificada)
        for (String tarea : tareas) {
            System.out.println("- " + tarea);
        }
    }
}