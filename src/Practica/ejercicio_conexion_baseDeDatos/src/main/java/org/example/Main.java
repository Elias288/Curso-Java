package org.example;

import java.lang.invoke.VarHandle;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Connection con = Conexion.getConnection()) {
            Integer opcion = 0;
            Scanner scanner = new Scanner(System.in);
            do {

                System.out.println("---conexion a la base de datos---");
                System.out.println("1.iniciar secion");
                System.out.println("2.registrar nuevo usuario");
                System.out.println("3.salir");
                opcion = scanner.nextInt();
                scanner.nextLine();
                switch (opcion) {

                    case 1:
                       /* "Solicitar nombre de usuario y contraseña.\n" +
                          "Verificar si existe en la base de datos.\n" +
                           "Si la credenciales son válidas, mostrar un mensaje de bienvenida indicando el rol del usuario.\n" +
                           "Si no, mostrar un mensaje de error  */
                        System.out.println("Para iniciar secion ingrese su nombre de usuario");
                        String nombre = scanner.nextLine();
                        System.out.println("ahora ingrese su contraseña");
                        String contraseña = scanner.nextLine();
                        Usuario usuariox = usuarioDAO.getUsuario(nombre);
                        if (usuariox == null || !usuariox.validarUsuario(contraseña)) {
                            System.out.println("usuario o contraseña incorrectos");
                            break;
                        }
                        System.out.println("Bienvenido " + usuariox.getNombre() + " tu rol es " + usuariox.getRol());

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
                        usuarioDAO.insertarUsuario(nombre1,contraseña1);
                        usuariox2 = usuarioDAO.getUsuario(nombre1);
                        System.out.println(usuariox2.toString());

                        break;


                }


            } while (opcion != 3);


        } catch (SQLException e) {
            System.out.println(" error al conectar " + e.getMessage());
        }

    }
}