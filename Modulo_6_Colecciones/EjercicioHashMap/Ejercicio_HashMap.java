package Modulo_6_Colecciones.EjercicioHashMap;

import java.util.HashMap;
import java.util.Map;
// import java.util.TreeMap;

public class Ejercicio_HashMap {
    public static void main(String[] args) {
        Map<String, String> agenda = new HashMap<>();
        // Con TreeMap el contenido se lista ordenadamente
        // Map<String, String> agenda = new TreeMap<>();

        /* Agregar elementos al mapa */
        System.out.println("Contenido del HashMap");
        agenda.put("Carlos", "123456");
        agenda.put("Esteban", "123456");
        agenda.put("Juan", "123456");
        agenda.put("Marcelo", "123456");
        agenda.put("Carlos", "567890"); // Reemplaza el primer valor
        listarContenido(agenda);

        /* Buscar elemento */
        System.out.println("\nBuscar Elemento");
        if (agenda.containsKey("Juan"))
            System.out.println("- Elemento Juan encontrado: " + agenda.get("Juan"));
        else
            System.out.println("- Elemento Juan no encontrado");

        if (agenda.containsKey("Pedro"))
            System.out.println("- Elemento Pedro encontrado: " + agenda.get("Juan"));
        else
            System.out.println("- Elemento Pedro no encontrado");

        /* Actualizar valor */
        System.out.println("\nActualizar valor de Juan");
        agenda.put("Juan", "5435345");
        listarContenido(agenda);
    }

    static void listarContenido(Map<String, String> lista) {
        for (Map.Entry<String, String> entry : lista.entrySet()) {
            System.out.println("- " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
