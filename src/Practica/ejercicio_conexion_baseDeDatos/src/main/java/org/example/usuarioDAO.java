package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class usuarioDAO {

    public static void insertarUsuario(String nombrex1, String contraseña1) {
        try (Connection con = Conexion.getConnection()) {
            String sql = "insert into usuarios (nombre,contrasenia) values (?,?);";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, nombrex1);
            stmt.setString(2, contraseña1);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Integer id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String contraseña = rs.getString("contrasenia");
                String rol = rs.getString("rol");

            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            System.out.println(" error al conectar " + e.getMessage());

        }


    }

    public static Usuario getUsuario(String nombrex) {
        try (Connection con = Conexion.getConnection()) {
            String sql = "select * from usuarios where nombre = ?;";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, nombrex);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Integer id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String contraseña = rs.getString("contrasenia");
                String rol = rs.getString("rol");

                return new Usuario(nombre, contraseña, rol, id);
            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            System.out.println(" error al conectar " + e.getMessage());

        }
        return null;

    }

    public static Usuario login(String user, String pass) {
        Usuario usuariox = usuarioDAO.getUsuario(user);
        if (usuariox == null || !usuariox.validarUsuario(pass)) {
            System.out.println("usuario o contraseña incorrectos");
            return null;
        }

        return usuariox;
    }

    ;


}
