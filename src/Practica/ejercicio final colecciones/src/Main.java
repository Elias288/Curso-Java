import java.util.*;

public class Main {

    public static void mostrarMenu() {
        System.out.println();
        System.out.println("---- Bilbioteca ----");
        System.out.println("1. agregar un libro");
        System.out.println("2. agregar un usuario");
        System.out.println("3. prestar un libro");
        System.out.println("4. mostrar los libros");
        System.out.println("5. mostrar los usuario registrados");
        System.out.println("6. mostrar los prestamos realizados");
        System.out.print("----Selecciona una opción: ----\n");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        Comparator<Libros> portitulo = Comparator.comparing(Libros::getTitulos, String.CASE_INSENSITIVE_ORDER);
        TreeSet<Libros> listaDeLibros = new TreeSet<>(portitulo);
        Libros libro1 = new Libros("Don Quijote","Miguel de Cervantes", UUID.randomUUID().toString());
        listaDeLibros.add(libro1);
        Libros libro2 = new Libros("La Casa Usher","Juan", UUID.randomUUID().toString());
        listaDeLibros.add(libro2);
        Libros libro3 = new Libros("El angel planeador","pedro", UUID.randomUUID().toString());
        listaDeLibros.add(libro3);

        HashSet<String> listaDeUsuarios = new HashSet<>();
        listaDeUsuarios.add("Santiago");
        listaDeUsuarios.add("Monica");
        listaDeUsuarios.add("Ramiro");

        Map<String, LinkedList<Libros>> listaDePrestamos = new HashMap<>();
        LinkedList<Libros> librosPrestados = new LinkedList<Libros>();
        librosPrestados.add(libro1);
        listaDePrestamos.put("Santiago",librosPrestados);



        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingresa el titulo del libro");
                    String titulo = scanner.nextLine();
                    System.out.println("Ingresa el autor del libro");
                    String autor = scanner.nextLine();
                    Libros libroX = new Libros(titulo,autor, UUID.randomUUID().toString());
                    listaDeLibros.add(libroX);
                    break;

                case 2:





                        //terminar


                case 3:
                case 4:
                    //iterador
                    System.out.println("Lista de Libros:\n");
                    Iterator<Libros> iterator = listaDeLibros.iterator();
                    while (iterator.hasNext()) {
                        Libros libro = iterator.next();
                        System.out.println("- " + libro.getTitulos());

                    }


                case 5:




                case 6:















            }

        }while (opcion != 0);



    }
}