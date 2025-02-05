/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ferna
 */

// Clase Hija: Reconectador
public class Reconectador extends Equipo {

    private double voltaje;
    private Seccionador seccionadorAsociado; // Relación opcional con Seccionador

    // Constructor
    public Reconectador(int id, String nombre, String marca, String modelo, double voltaje, Seccionador seccionadorAsociado) {
        super(id, nombre, marca, modelo);
        this.voltaje = voltaje;
        this.seccionadorAsociado = seccionadorAsociado;
    }

    // Getters y Setters
    public double getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(double voltaje) {
        this.voltaje = voltaje;
    }

    public Seccionador getSeccionadorAsociado() {
        return seccionadorAsociado;
    }

    public void setSeccionadorAsociado(Seccionador seccionadorAsociado) {
        this.seccionadorAsociado = seccionadorAsociado;
    }
}