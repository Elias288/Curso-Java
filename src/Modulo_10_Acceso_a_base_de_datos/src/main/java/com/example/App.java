package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {
    public static void getAllEmpleados(Connection conn) {
        try {
            String sql = "Select * from Empleado";

            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            System.out.println("Listar todos los usuarios");
            while (rs.next()) {
                Integer id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String telefono = rs.getString("telefono");

                Empleado em = new Empleado(id, nombre, apellido, telefono);
                System.out.println(em.toString());
            }

            System.out.println("\n");

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("\n❌ Error al consultar: " + e.getMessage());
        }
    }

    public static Empleado getEmpleadoByName(Connection conn, String name) {
        try {
            String sql = "SELECT * FROM Empleado where nombre = ?;";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();

            System.out.println("Listando el usuario: " + name);
            if (rs.next()) {
                Integer id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String telefono = rs.getString("telefono");

                return new Empleado(id, nombre, apellido, telefono);
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("\n❌ Error al consultar: " + e.getMessage());
        }
        return null;
    }

    public static void insertEmpleado(Connection conn, Empleado empleado) {
        try {
            System.out.println("Insertando usuario");
            String sql = "INSERT INTO Empleado (id, nombre, apellido, telefono) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, empleado.id);
            stmt.setString(2, empleado.nombre);
            stmt.setString(3, empleado.apellido);
            stmt.setString(4, empleado.telefono);

            ResultSet rs = stmt.executeQuery();

            System.out.println("Usuario agregado\n- Id: " + empleado.id + "\n- Nombre: " + empleado.nombre
                    + "\n- Apellido: " + empleado.apellido + "\n- Telefono: " + empleado.telefono + "\n");

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("\n❌ Error al insertar: " + e.getMessage());
        }
    }

    public static void deleteEmpleado(Connection conn, Empleado empleado) {
        try {
            System.out.println("Eliminando usuario");
            String sql = "DELETE FROM Empleado WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, empleado.id);

            ResultSet rs = stmt.executeQuery();

            System.out.println("Usuario Eliminado\n- Id: " + empleado.id + "\n- Nombre: " + empleado.nombre
                    + "\n- Apellido: " + empleado.apellido + "\n- Telefono: " + empleado.telefono + "\n");

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("\n❌ Error al insertar: " + e.getMessage());
        }
    }

    public static void updateEmpleado(Connection conn, Empleado empleado) {
        try {
            System.out.println("Insertando usuario");
            String sql = "UPDATE Empleado SET nombre = ?, apellido = ?, telefono = ? WHERE id = ?;";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, empleado.nombre);
            stmt.setString(2, empleado.apellido);
            stmt.setString(3, empleado.telefono);
            stmt.setInt(4, empleado.id);

            ResultSet rs = stmt.executeQuery();

            System.out.println("Usuario actualizado\n- Id: " + empleado.id + "\n- Nombre: " + empleado.nombre
                    + "\n- Apellido: " + empleado.apellido + "\n- Telefono: " + empleado.telefono + "\n");

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("\n❌ Error al insertar: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // System.out.println( "Hello World!" );
        String url = "jdbc:mariadb://localhost:3306/mi_base";
        String usuario = "root";
        String contraseña = "pass123";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña)) {
            System.out.println("\n✅ Conexión exitosa a MariaDB!\n");

            getAllEmpleados(conexion);
            Empleado camila = getEmpleadoByName(conexion, "Camila");
            System.out.println(camila.toString() + "\n");

            Empleado em1 = new Empleado(4325, "Nicolas", "Moreno", "094352345");
            Empleado em2 = new Empleado(4326, "Elias", "Bianchi", "099044224");
            insertEmpleado(conexion, em1);
            insertEmpleado(conexion, em2);

            getAllEmpleados(conexion);

            em1.apellido = "Morenos";
            em1.telefono = "094355345";
            updateEmpleado(conexion, em1);

            deleteEmpleado(conexion, em2);

            getAllEmpleados(conexion);
            deleteEmpleado(conexion, em1);

        } catch (SQLException e) {
            System.out.println("❌ Error al conectar: " + e.getMessage());
        }
    }
}
