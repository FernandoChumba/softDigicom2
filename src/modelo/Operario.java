/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ferna
 */
public class Operario {
    private String dni;
    private String apellido;
    private String nombre;
    private Sesion sesion;
    private final Sesion Sesion;
    
    
     public Operario(String dni, String nombre, String apellido, Sesion usuario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.Sesion = usuario;
    }

    public String getDni() {
        return dni;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public Sesion getSesion() {
        return sesion;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSesion(Sesion sesion) {
        this.sesion = sesion;
    }
    
    
    
}
