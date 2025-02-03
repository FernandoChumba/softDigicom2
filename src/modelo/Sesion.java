/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ferna
 */
public class Sesion {
    String usuario;
    String clave;
    
 // Instancia estática de la clase, inicialmente es null
    private static Sesion instancia;

    // Constructor privado para evitar la creación de instancias fuera de la clase
    public Sesion(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    // Método estático para obtener la única instancia de la clase Sesion
    public static Sesion getInstance(String usuario, String clave) {
        if (instancia == null) {
            // Si no existe una instancia, se crea una nueva
            instancia = new Sesion(usuario, clave);
        }
        return instancia;
    }

    // Método para obtener la instancia sin necesidad de pasar usuario y clave
    public static Sesion getInstance() {
        return instancia;
    }



    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }
    
    public static void logout() {
        instancia = null;
    }
    
}
