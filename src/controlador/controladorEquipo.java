/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.sql.*;
import modelo.Equipo;
import modelo.Equipo.Reconectador;

/**
 *
 * @author ferna
 */
public class controladorEquipo {
    
    private static final String URL = "jdbc:mysql://localhost:3306/tu_base_de_datos";
    private static final String USER = "tu_usuario";
    private static final String PASSWORD = "tu_contraseña";

    // Método para guardar un equipo genérico en la base de datos
    public void guardarEquipo(Equipo equipo) {
        String sql = "INSERT INTO equipos (nombre, modelo, marca) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, equipo.getNombre());
            stmt.setString(2, equipo.getModelo());
            stmt.setString(3, equipo.getMarca());

            stmt.executeUpdate();
            System.out.println("Equipo genérico guardado correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para guardar un reconectador en la base de datos
    public void guardarReconectador(Reconectador reconectador) {
        String sql = "INSERT INTO reconectadores (nombre, modelo, marca, voltaje, distribuidor) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, reconectador.getNombre());
            stmt.setString(2, reconectador.getModelo());
            stmt.setString(3, reconectador.getMarca());
            stmt.setDouble(4, reconectador.getVoltaje());
            stmt.setString(5, reconectador.getDistrubuidor());

            stmt.executeUpdate();
            System.out.println("Reconectador guardado correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
}
