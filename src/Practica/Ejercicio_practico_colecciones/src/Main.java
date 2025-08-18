package Practica.Ejercicio_practico_colecciones.src;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Estudiante> alumnos = new ArrayList<>();
        // Agregar (al final de la lista)
        alumnos.add(new Estudiante(101, "Ana", 8.5));
        alumnos.add(new Estudiante(102, "Bruno", 6.9));
        alumnos.add(new Estudiante(103, "Carla", 9.1));
        alumnos.add(new Estudiante(104, "Diego", 5.8));
        alumnos.add(new Estudiante(105, "Elena", 7.4));
        alumnos.add(new Estudiante(106, "Fabián", 8.0));
        alumnos.add(new Estudiante(107, "Gabriela", 6.5));
        alumnos.add(new Estudiante(108, "Héctor", 7.9));
        alumnos.add(new Estudiante(109, "Inés", 9.3));
        alumnos.add(new Estudiante(110, "Javier", 5.5));

        /*
         * TODO: Listado simple
         * - Recorrer la lista e imprimir los datos de cada estudiante
         * - Usar un for para recorrer la lista
         * - Usar la función toString() de la clase Estudiante
         */

        /*
         * TODO: Función de búsqueda
         * - Buscar un estudiante por su ID de manera secuencial
         * - Si se encuentra, imprimir sus datos
         * - Si no se encuentra, imprimir un mensaje indicando que no existe
         */

        /*
         * TODO: Actualización de datos
         * - Buscar un estudiante por su ID
         * - Si se encuentra, actualizar su promedio
         * - Imprimir los datos del estudiante actualizado
         * - Si no se encuentra, imprimir un mensaje indicando que no existe
         */

        /*
         * TODO: Eliminación de un estudiante
         * - Buscar un estudiante por su ID
         * - Si se encuentra, eliminarlo de la lista
         */

        /*
         * TODO: Nueva lista evitando duplicados y ordenada por propmedio
         * - Crear una nueva lista de estudiantes sin duplicados copiando la lista ya
         * existente
         * - Usar HashSet para evitar duplicados
         * - Ordenar la nueva lista por promedio de mayor a menor
         * - Imprimir la nueva lista
         */

        /*
         * TODO: Materias
         * - Crear una lista (hashMap) de materias en la que estarán listados todos los
         * estudiantes que cursan dicha materia
         * - Cada materia se identifica por un nombre (String)
         * - Cada estudiante puede cursar varias materias
         * - Imprimir la lista de materias con sus estudiantes
         */

        /*
         * TODO: Listar estudantes de una materia
         * - Dada una materia, listar todos los estudiantes que la cursan
         */

        /*
         * TODO: Función para eliminar estudiantes de una materia
         * - Dada una materia y un ID de estudiante, eliminar al estudiante de la
         * materia
         */
    }
}