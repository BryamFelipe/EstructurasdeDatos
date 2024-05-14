/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reservacionspa;

import controlador.ReservacionSpaController;
import modelo.CircularLista;
import vista.ReservacionSpaView;

/**
 *
 * @author Bryam
 */
public class ReservacionSpa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CircularLista model = new CircularLista();
        ReservacionSpaView view = new ReservacionSpaView(model);
        ReservacionSpaController cont = new ReservacionSpaController(view, model);
        cont.start();
    }
    
}
