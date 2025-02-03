/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import vista.*;
import modelo.Sesion;
import modelo.dataBase;
import java.sql.*;

/**
 *
 * @author ferna
 */
public class controladorSesion {
    public static Sesion autenticar(String username, String password) {
    String query = "SELECT * FROM usuarios WHERE username = ? AND password = ?";
    
    try (Connection conn = dataBase.getConnection();
         PreparedStatement stmt = conn.prepareStatement(query)) {

        stmt.setString(1, username);
        stmt.setString(2, password);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            System.out.println("Autenticación exitosa para: " + username);
            return new Sesion(rs.getString("username"), rs.getString("password"));
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return null;
}
}
