/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ferna
 */
// Clase Hija: Seccionador
public class Seccionador extends Equipo {

    private double voltaje;
    private String numeroDistribuidor;

    // Constructor
    public Seccionador(int id, String nombre, String marca, String modelo, double voltaje, String numeroDistribuidor) {
        super(id, nombre, marca, modelo);
        this.voltaje = voltaje;
        this.numeroDistribuidor = numeroDistribuidor;
    }

    // Getters y Setters
    public double getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(double voltaje) {
        this.voltaje = voltaje;
    }

    public String getNumeroDistribuidor() {
        return numeroDistribuidor;
    }

    public void setNumeroDistribuidor(String numeroDistribuidor) {
        this.numeroDistribuidor = numeroDistribuidor;
    }
}