package Practica.Ejercicio_practico_colecciones.src;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void mostrarLista (List<Estudiante> alumnos) {
        for (int i = 0;i < alumnos.size() ;i ++) {
            System.out.println(alumnos.get(i).toString());
        }

    }

    static Estudiante buscarAlumno (List<Estudiante> alumnos,int id) {
        for (int i = 0; i < alumnos.size(); i++) {
            if (id == alumnos.get(i).getId()) {
                return alumnos.get(i);
            }

        }


        return null;//si no entro nunca al if no encontro el numero buscado y retorna -1
    }
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
        System.out.println("---Listado simple ---- ej:1 \n");
        for (int i = 0;i < alumnos.size() ;i ++) {
            System.out.println(alumnos.get(i).toString());
        }

        /*for (Estudiante alumnox : alumnos) {                  //otra forma mas sencilla de hacerlo
            System.out.println("- " + alumnox.toString());
        }
        */




        /*
         * TODO: Función de búsqueda
         * - Buscar un estudiante por su ID de manera secuencial
         * - Si se encuentra, imprimir sus datos
         * - Si no se encuentra, imprimir un mensaje indicando que no existe
         */
        System.out.println("\n ---Busqueda ---- ej:2 ");
        Estudiante alumnox = buscarAlumno(alumnos,105);
        if (alumnox == null) {
            System.out.println("el alumno buscado no existe");
        } else
            System.out.println(alumnox.toString());




        /*
         * TODO: Actualización de datos
         * - Buscar un estudiante por su ID
         * - Si se encuentra, actualizar su promedio
         * - Imprimir los datos del estudiante actualizado
         * - Si no se encuentra, imprimir un mensaje indicando que no existe
         */

        System.out.println("\n ---actualizacion de datos ---- ej:3 ");
        Estudiante alumnoy = buscarAlumno(alumnos,107);
        if (alumnoy == null) {
            System.out.println("el alumno buscado no existe");
        } else{

            System.out.println("datos nose \t\t\t" + alumnoy.toString());
            alumnoy.setPromedio(4);

            for (int i = 0; i < alumnos.size(); i++) {
                if (alumnoy.equals(alumnos.get(i))) {
                    alumnos.set(i,alumnoy);
                }
            }
            System.out.println("datos actualizados \t" + alumnoy.toString());

        }





        /*
         * TODO: Eliminación de un estudiante
         * - Buscar un estudiante por su ID
         * - Si se encuentra, eliminarlo de la lista
         */


        System.out.println("\n ---eliminacion ---- ej:4 ");
        Estudiante alumnoz = buscarAlumno(alumnos,107);
        if (alumnoz == null) {
            System.out.println("el alumno buscado no existe");
        } else{

            alumnos.remove(alumnoz);

            System.out.println("datos actualizados");
            mostrarLista(alumnos);

        }







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