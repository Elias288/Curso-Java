import java.util.*;

public class Main {
    //TODO agregar mensajes de confirmacion y cambiar los nombre de las variable por nombres mas especificos
    static Libros  buscarLibros (TreeSet<Libros> listadelibros,String libroBusc) {

        for (Libros libron : listadelibros) {

            if (libron.getTitulos().equals(libroBusc)) {
                return libron;

            }

        }




        return null;
    }


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
        Libros libro1 = new Libros("Don Quijote", "Miguel de Cervantes", UUID.randomUUID().toString());
        listaDeLibros.add(libro1);
        Libros libro2 = new Libros("La Casa Usher", "Juan", UUID.randomUUID().toString());
        listaDeLibros.add(libro2);
        Libros libro3 = new Libros("El angel planeador", "pedro", UUID.randomUUID().toString());
        listaDeLibros.add(libro3);

        HashSet<String> listaDeUsuarios = new HashSet<>();
        listaDeUsuarios.add("Santiago");
        listaDeUsuarios.add("Monica");
        listaDeUsuarios.add("Ramiro");

        Map<String, LinkedList<Libros>> listaDePrestamos = new HashMap<>();
        LinkedList<Libros> librosPrestados = new LinkedList<Libros>();
        librosPrestados.add(libro1);
        listaDePrestamos.put("Santiago", librosPrestados);


        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el titulo del libro");
                    String titulo = scanner.nextLine();
                    System.out.println("Ingresa el autor del libro");
                    String autor = scanner.nextLine();
                    Libros libroX = new Libros(titulo, autor, UUID.randomUUID().toString());
                    listaDeLibros.add(libroX);
                    break;

                case 2:
                    System.out.println("Ingresa el nombre del usuario");
                    String nombreUsuario = scanner.nextLine();
                    listaDeUsuarios.add(nombreUsuario);
break;

                case 3:
                    //TODO: Prestar libro/terminar
                    //el "t0do" es un marcador

                    /*
                    se ingresa el nombre del usuario y el titulo del libro qeu se quiere prestar
                    se busca qeu el libro exista y si existe se va a agrega a la lista de lo libros prestados al usuario
                    si es la primera vez qeu el usuario pide prestado un libro se tiene que crear una lista de libros prestados y agregar el usuario a la
                    lista de prestamos.
                    si no es la primera vez que el usuario pide prestado un libro simplemente se agrega el libro a la lista que ya tiene
                     */
                    System.out.println("Ingresa el usuario para prestar el libro");
                    String usuarioPrest = scanner.nextLine();
                    if (!listaDeUsuarios.contains(usuarioPrest)) {
                        System.out.println("El usuario ingresado no existe o no esta registrado");
                        break;
                    }

                    System.out.println("Ingresa el titulo del libro para prestar a " + usuarioPrest);
                    String libroPrest = scanner.nextLine();
                    Libros libron = buscarLibros(listaDeLibros, libroPrest);
                    if (libron == null) {
                        System.out.println("no se encontro el libro buscado");
                        break;
                    }

                    if (!listaDeLibros.contains(libron)) {
                        System.out.println("El libro ingresado no existe o no esta registrado");
                        break;
                    }



                    if (!listaDePrestamos.containsKey(usuarioPrest)) {
                        LinkedList<Libros> nuevaListaDeLibros = new LinkedList<Libros>();
                        nuevaListaDeLibros.add(libron);
                        listaDePrestamos.put(usuarioPrest, nuevaListaDeLibros);
                        break;
                    } else {
                        //crear una variable auxiliar donde se guardara la lista de ibros qeu se le presto al usuario y luego poner la lista actualizada en la lista original
                        LinkedList<Libros> librosprestados1 = listaDePrestamos.get(usuarioPrest);
                        librosprestados1.add(libron);
                        listaDePrestamos.put(usuarioPrest,librosprestados1);

                    }

                    break;


                case 4:
                    //iterador
                    System.out.println("Lista de Libros:\n");
                    Iterator<Libros> iterator = listaDeLibros.iterator();
                    while (iterator.hasNext()) {
                        Libros libro = iterator.next();
                        System.out.println("- " + libro.getTitulos());

                    }
break;
                case 5:
                    System.out.println("\n lista de usuarios:");
                    //recorrer on for each (sintaxis simplificada)
                    for (String usuarioX : listaDeUsuarios) {
                        System.out.println("- " + usuarioX);

                    }

                    





                    break;


                case 6:


                    for (Map.Entry<String, LinkedList<Libros>> prestamos : listaDePrestamos.entrySet()) {
                        System.out.println(prestamos.getKey());
                        LinkedList<Libros> librosPrestadosAlUsuario = prestamos.getValue();

                        Iterator<Libros> libroiterator = librosPrestadosAlUsuario.iterator();
                        while (libroiterator.hasNext()) {
                            String titulo2 = libroiterator.next().getTitulos();
                            System.out.print("- " + titulo2);

                        }

                        System.out.println("\n");
                    }

                    break;
            }

        } while (opcion != 0);


    }
}