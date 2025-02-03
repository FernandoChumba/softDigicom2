/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlador;

import modelo.dataBase;
import controlador.*;
import java.awt.Color;
import java.util.Scanner;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import modelo.*;
import vista.*;

/**
 *
 * @author ferna
 */
public class Main {

    /**
     * @param args the command line arguments
     */
  
       public static void main(String[] args) {
           try {
            UIManager.put("OptionPane.background", new Color(255, 255, 255)); // Fondo blanco
            UIManager.put("Panel.background", new Color(255, 255, 255)); // Fondo panel
            UIManager.put("OptionPane.messageForeground", new Color(0, 0, 0)); // Texto negro
            UIManager.put("Button.background", new Color(0, 122, 204)); // Botón con color azul
            UIManager.put("Button.foreground", new Color(255, 255, 255)); // Texto de los botones en blanco
        } catch (Exception e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            // Crear la instancia de la vista y hacerla visible
            vista.vistaLogin vistaLog = new vista.vistaLogin();
            vistaLog.setVisible(true);
        }
    });
         
        /*Scanner scanner = new Scanner(System.in);
        controlador.controladorSesion sesionControlador = new controlador.controladorSesion();

        // Solicitar datos de inicio de sesión
        System.out.print("Ingrese el usuario: ");
        String username = scanner.nextLine();

        System.out.print("Ingrese la contraseña: ");
        String password = scanner.nextLine();

        try {
            // Autenticamos al usuario
            Sesion sesion = sesionControlador.autenticar(username, password);
            if (sesion != null) {
                System.out.println("Inicio de sesión exitoso: " + sesion.getUsuario());

            } else {
                System.out.println("Usuario o contraseña incorrectos.");
            }
        } catch (Exception e) {
            System.out.println("Error al autenticar: " + e.getMessage());
        } finally {
            scanner.close();
        }]*/
    }
       
}
