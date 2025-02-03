/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.sql.*;

/**
 *
 * @author ferna
 */
public class dataBase {
    private static final String URL = "jdbc:mysql://localhost:3306/testUser";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    private dataBase() {
        // Constructor privado para evitar instancias
    }

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD); // Retorna una nueva conexión
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al conectar a la base de datos.");
        }
    }
}


    
    
    
 
