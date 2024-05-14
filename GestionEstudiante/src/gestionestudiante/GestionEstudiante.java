/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionestudiante;

import myEstudiante.Controlador.EstudianteControlador;
import myEstudiante.vista.EstudianteVista;

/**
 *
 * @author Bryam
 */
public class GestionEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EstudianteVista vista = new EstudianteVista();
        EstudianteControlador cont = new EstudianteControlador(vista);
        cont.iniciar();
    }
    
}
