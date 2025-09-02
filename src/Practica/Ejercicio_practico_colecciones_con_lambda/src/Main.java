package Practica.Ejercicio_practico_colecciones.src;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static List<Estudiante> ordenarlista (List<Estudiante> alumnos) {

        return alumnos.stream()
                .sorted((a , b) -> b.getPromedio().compareTo(a.getPromedio()) )
                .collect(Collectors.toList());



    }

    static void mostrarLista (List<Estudiante> alumnos) {
        alumnos.stream()
                .forEach(alumno -> System.out.println(alumno.toString()));




    }

    static void mostrarListaTree (TreeSet<Estudiante> alumnos) {
        alumnos.stream()
                .forEach(alumno -> System.out.println(alumno.toString()));

    }


    static List<Estudiante> buscarMateria (HashMap<String,List<Estudiante>> Materias,String nomMateria) {

        Map.Entry<String,List<Estudiante>> Materia = Materias.entrySet()
                .stream()
                //busco el primer nombre de la materia que coinicda con la condicion (comparo con la key del has)
                .filter(materia -> nomMateria == materia.getKey())
                .findFirst()
                .orElse(null);

        if(Materia== null)
            return null;
        else
            return Materia.getValue();

    }

    static void EliminarAlumnoDeMateria (HashMap<String,List<Estudiante>> Materias,String nomMateria, String nomAlumno) {
        //ej: de la materia matematica eliminar de su lista de alumnos a pepito


        List<Estudiante> alumnosc = buscarMateria(Materias,nomMateria);
        Estudiante alumnoj = buscarAlumnoPnombre(alumnosc,nomAlumno);
        alumnosc.remove(alumnoj);


    }


    static Estudiante buscarAlumnoPnombre (List<Estudiante> alumnos,String nombre) {
       return alumnos.stream()
                .filter(alumno -> alumno.getNombre() == nombre)
                .findFirst().orElse(null);


    }

    static Estudiante buscarAlumno (List<Estudiante> alumnos,int id) {

        return alumnos.stream()
                .filter(alumno -> alumno.getId() == id)
                .findFirst().orElse(null);



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
         *  Listado simple
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
         *  Función de búsqueda
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
         *  Actualización de datos
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
         *  Eliminación de un estudiante
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
         *  Nueva lista evitando duplicados y ordenada por propmedio
         * - Crear una nueva lista de estudiantes sin duplicados copiando la lista ya
         * existente
         * - Usar HashSet para evitar duplicados
         * - Ordenar la nueva lista por promedio de mayor a menor
         * - Imprimir la nueva lista
         */
        System.out.println("\n ---ordenar ---- ej:5 ");

        List<Estudiante> listaordenada = ordenarlista(alumnos);
        listaordenada.stream().forEach(System.out::println);
        System.out.println("\n");

        TreeSet <Estudiante> alumnoscopia = new TreeSet<>(new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante a, Estudiante b) {
                // Si los promedios son iguales, compara por ID para evitar que se eliminen duplicados
                int cmp = Double.compare(b.getPromedio(), a.getPromedio());
                if (cmp == 0) {
                    return Integer.compare(a.getId(), b.getId());
                }
                return cmp;
            }
        });
        alumnoscopia.addAll(listaordenada);
        mostrarListaTree(alumnoscopia);







        /*
         *  Materias
         * - Crear una lista (hashMap) de materias en la que estarán listados todos los
         * estudiantes que cursan dicha materia
         * - Cada materia se identifica por un nombre (String)
         * - Cada estudiante puede cursar varias materias
         * - Imprimir la lista de materias con sus estudiantes
         */

              // nombre de las materias y cada materia compuesta por la lista de estudiantes
        HashMap<String,List<Estudiante>> Materias = new HashMap();

        List<Estudiante> alumnosDeMate = new ArrayList<>();
        // Agregar (al final de la lista)
        alumnosDeMate.add(new Estudiante(101, "Ana", 8.5));
        alumnosDeMate.add(new Estudiante(102, "Bruno", 6.9));
        alumnosDeMate.add(new Estudiante(103, "Carla", 9.1));

        List<Estudiante> alumnosDeHistoria = new ArrayList<>();
        // Agregar (al final de la lista)
        alumnosDeHistoria.add(new Estudiante(105, "Elena", 7.4));
        alumnosDeHistoria.add(new Estudiante(106, "Fabián", 8.0));
        alumnosDeHistoria.add(new Estudiante(107, "Gabriela", 6.5));

        Materias.put("Matematicas",alumnosDeMate);
        Materias.put("Historia",alumnosDeHistoria);
                                                                //le paso la cosa
        for (Map.Entry<String, List<Estudiante>> prestamos : Materias.entrySet()) {
            System.out.println(prestamos.getKey());   //saco la key del mapa
            List<Estudiante> alumnosDeLaMateria = prestamos.getValue();    // saco el valor de la key del mapa

            mostrarLista(alumnosDeLaMateria);
            
            System.out.println("\n");
        }




        /*
         *  Listar estudantes de una materia
         * - Dada una materia, listar todos los estudiantes que la cursan
         */
        System.out.println("Busqueda de alumnos de historia");
        System.out.println(buscarMateria(Materias,"Historia"));





        /*
         *  Función para eliminar estudiantes de una materia
         * - Dada una materia y un ID de estudiante, eliminar al estudiante de la
         * materia
         */
        EliminarAlumnoDeMateria(Materias,"Historia","Elena");
        
        System.out.println("Datos actualizado de la materia historia");
        System.out.println(buscarMateria(Materias,"Historia"));



    }
}