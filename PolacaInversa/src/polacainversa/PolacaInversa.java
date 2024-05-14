/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polacainversa;

import controlador.Controlador;
import modelo.Pila;
import vista.Vista;

/**
 *
 * @author Bryam
 */
public class PolacaInversa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vista view = new Vista();
        Pila model = new Pila();
        Controlador cont = new Controlador(model, view);
        cont.manejarEventos();
    }
    
}
