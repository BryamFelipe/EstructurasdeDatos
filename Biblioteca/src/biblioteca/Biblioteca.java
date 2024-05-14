/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

import controlador.LibreriaController;
import modelo.ListaEnlazada;
import vista.LibreriaView;

/**
 *
 * @author Bryam
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaEnlazada model = new ListaEnlazada();
        LibreriaView view = new LibreriaView();

        LibreriaController controller = new LibreriaController(model, view);
        controller.start();
    }
    
}
