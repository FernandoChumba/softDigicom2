/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ferna
 */
public class Equipo {
    String nombre;
    String modelo;
    String marca;

    public Equipo(String nombre, String modelo, String marca) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    //Subclase
    public static class Reconectador extends Equipo{
        Double voltaje;
        String distrubuidor;
       

        public Reconectador(String nombre, String modelo, String marca,Double voltaje, String distribuidor) {
            super(nombre, modelo, marca);
            this.voltaje = voltaje;
            this.distrubuidor = distribuidor;
            
        }

        public Double getVoltaje() {
            return voltaje;
        }

        public void setVoltaje(Double voltaje) {
            this.voltaje = voltaje;
        }

        public String getDistrubuidor() {
            return distrubuidor;
        }

        public void setDistrubuidor(String distrubuidor) {
            this.distrubuidor = distrubuidor;
        }

        
    }
    
    asdsadasd
}
