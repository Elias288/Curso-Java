package org.example;

import java.sql.*;

public class TareasDAO {

    public static void cambiarEstadoTarea(String status, Integer id) {
        try (Connection con = Conexion.getConnection()) {
            String sql = "UPDATE Tareas SET status = ? where id = ?;";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, status);
            stmt.setInt(2, id);
            ResultSet rs = stmt.executeQuery();

            System.out.println("Tarea registrada con exito");

            rs.close();
            stmt.close();


        } catch (SQLException e) {
            System.out.println(" error al conectar " + e.getMessage());

        }



    }

    public static void registrarTarea(String titulo, String descripcion, Integer id_user) {
        try (Connection con = Conexion.getConnection()) {
            String sql = "insert into Tareas (Status,Tittle,Description,id_user) values (?,?,?,?);";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, "Todo");
            stmt.setString(2, titulo);
            stmt.setString(3, descripcion);
            stmt.setInt(4, id_user);
            ResultSet rs = stmt.executeQuery();

            System.out.println("Tarea registrada con exito");

            rs.close();
            stmt.close();


        } catch (SQLException e) {
            System.out.println(" error al conectar " + e.getMessage());

        }


    }

    public static void mostrarTareas(Integer id_user) {
        try (Connection con = Conexion.getConnection()) {
            String sql = "select * from Tareas where id_user = ?;";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, id_user);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Integer id = rs.getInt("id");
                String Status = rs.getString("Status");
                String Tittle = rs.getString("Tittle");
                String Description = rs.getString("Description");


                System.out.println("la id de tarea es " + id + ", el estado de la tarea es " + Status + ", el titulo es " + Tittle + ", la descripcion es " + Description);
            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            System.out.println(" error al conectar " + e.getMessage());

        }



    }

    public static void mostrarTareasConOpciones(Integer id_user,String status) {
        try (Connection con = Conexion.getConnection()) {
            String sql = "select * from Tareas where id_user = ? and status = ?;";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, id_user);
            stmt.setString(2, status);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Integer id = rs.getInt("id");
                String Status = rs.getString("Status");
                String Tittle = rs.getString("Tittle");
                String Description = rs.getString("Description");


                System.out.println("la id de tarea es " + id + ", el estado de la tarea es " + Status + ", el titulo es " + Tittle + ", la descripcion es " + Description);
            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            System.out.println(" error al conectar " + e.getMessage());

        }
    }
}
