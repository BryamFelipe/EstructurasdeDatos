/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionmemoria;

import controlador.Controlador;
import vista.Vista;

/**
 *
 * @author Bryam
 */
public class GestionMemoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vista vista = new Vista();
        Controlador controlador = new Controlador(vista);
        vista.setVisible(true);
    }
    
}
