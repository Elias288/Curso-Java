package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String url = "jdbc:mariadb://localhost:3306/mi_base";
    private static final String usuario = "root";
    private static final String contraseña = "pass123";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(url, usuario, contraseña);
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
            return null;
        }
    }
}
