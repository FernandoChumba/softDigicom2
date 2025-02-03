/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import modelo.Operario;
import modelo.dataBase;
import java.sql.*;
import modelo.Sesion;

/**
 *
 * @author ferna
 */
public class controladorOperario {
    /*
     public Operario obtenerOperarioPorUsuario(Sesion usuario) {
        String query = "SELECT * FROM operarios WHERE usuario_id = (SELECT id FROM usuarios WHERE username = ?)";
        try (Connection conn = dataBase.getInstance().getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, usuario.getUsuario());
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Operario(
                        rs.getString("dni"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        usuario
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; // Operario no encontrado
    }*/
    
}
