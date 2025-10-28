package org.example;

import java.lang.invoke.VarHandle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Connection con = Conexion.getConnection()) {
            Integer opcion = 0;
            Scanner scanner = new Scanner(System.in);
            Usuario usuarioLogeado = null;
            do {

                System.out.println("---conexion a la base de datos---");
                System.out.println("1.iniciar sesion");
                System.out.println("2.registrar nuevo usuario");
                System.out.println("3.salir");
                opcion = scanner.nextInt();
                scanner.nextLine();
                switch (opcion) {

                    default:
                        System.out.println("opcion no existente");
                        break;

                    case 1:
                       /* "Solicitar nombre de usuario y contraseña.\n" +
                          "Verificar si existe en la base de datos.\n" +
                           "Si la credenciales son válidas, mostrar un mensaje de bienvenida indicando el rol del usuario.\n" +
                           "Si no, mostrar un mensaje de error  */
                        System.out.println("Para iniciar secion ingrese su nombre de usuario");
                        String nombre = scanner.nextLine();
                        System.out.println("ahora ingrese su contraseña");
                        String contraseña = scanner.nextLine();
                        usuarioLogeado = usuarioDAO.login(nombre, contraseña);

                        if (usuarioLogeado != null) {


                            System.out.println("Bienvenido " + usuarioLogeado.getNombre() + " tu rol es " + usuarioLogeado.getRol());

                            Integer opcion2 = 0;
                            do {

                                System.out.println("---Menu De Tareas---");
                                System.out.println("1. Ver tareas");
                                System.out.println("2.Registrar una tarea");
                                System.out.println("3.cambiar estado de una tarea");
                                System.out.println("4.lista de tareas por hacer");
                                System.out.println("5.listar tarea listar haciendo");
                                System.out.println("6.listar tareas hechas");
                                System.out.println("7.cerrar sesion");

                                opcion2 = scanner.nextInt();
                                scanner.nextLine();
                                switch (opcion2) {

                                    default:
                                        System.out.println("opcion no existente");
                                        break;
                                    case 1:
                                        TareasDAO.mostrarTareas(usuarioLogeado.getId());
                                        break;

                                    case 2:
                                        System.out.println("Para registrar una tarea ingrese el titulo de la tarea");
                                        String titulo = scanner.nextLine();
                                        System.out.println("ahora ingrese la descripcion de la tarea");
                                        String descripcion = scanner.nextLine();
                                        TareasDAO.registrarTarea(titulo, descripcion, usuarioLogeado.getId());
                                        break;
                                    case 3:
                                        System.out.println("Para cambiar el estado de una tarea ingrese el id de la tarea que quiere cambiar");
                                        Integer idTarea = scanner.nextInt();
                                        System.out.println("seleccione el estado de la tarea");
                                        System.out.println("1.Done");
                                        System.out.println("2.In process");
                                        System.out.println("3.Todo");
                                        Integer opcion873654 = scanner.nextInt();
                                        /*String statusx;
                                        if (opcion873654 == 1) {
                                            statusx = "done";
                                        }else if (opcion873654 == 2)
                                            statusx = "in process";
                                        else
                                            statusx = "todo";
                                            es lo mismo que lo de abajo en lambda
                                       */

                                        String statusx = opcion873654 == 1 ? "Done" : opcion873654 == 2 ? "In process" : opcion873654 == 3 ? "Todo" : null;

                                        TareasDAO.cambiarEstadoTarea(statusx, idTarea);

                                        break;

                                    case 4:
                                        TareasDAO.mostrarTareasConOpciones(usuarioLogeado.getId(), "Todo");
                                        break;
                                    case 5:
                                        TareasDAO.mostrarTareasConOpciones(usuarioLogeado.getId(), "In process");
                                        break;
                                    case 6:
                                        TareasDAO.mostrarTareasConOpciones(usuarioLogeado.getId(), "Done");
                                        break;

                                }


                            }
                            while (opcion2 != 7);
                        }
                        break;
                    case 2:
                        /*Solicitar nombre de usuario y contraseña
                        Verificar si existe en la base de datos.
                        Insertar el nuevo registro en la base de datos.
                        Confirmar que el usuario fue creado correctamente.*/

                        System.out.println("Para registrar un usuario ingrese el nombre de usuario");
                        String nombre1 = scanner.nextLine();
                        System.out.println("ahora ingrese su contraseña");
                        String contraseña1 = scanner.nextLine();

                        Usuario usuariox2 = usuarioDAO.getUsuario(nombre1);
                        if (usuariox2 != null) {
                            System.out.println("usuario ya existente");
                            break;
                        }
                        usuarioDAO.insertarUsuario(nombre1, contraseña1);
                        usuariox2 = usuarioDAO.getUsuario(nombre1);
                        System.out.println(usuariox2.toString());

                        break;

                    case 3:


                        break;


                }


            } while (opcion != 3);


        } catch (SQLException e) {
            System.out.println(" error al conectar " + e.getMessage());
        }

    }
}