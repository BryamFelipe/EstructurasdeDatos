/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package navegador;

import controlador.Controlador;
import modelo.HistorialNavegacion;

import vista.Vista;

/**
 *
 * @author Bryam
 */
public class Navegador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HistorialNavegacion  modelo = new HistorialNavegacion();
        Vista vista = new Vista();
        Controlador cont = new Controlador(modelo, vista);
        cont.iniciar();
        vista.setVisible(true);
    }
    
}
