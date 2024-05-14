/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareasprioridad;

import controlador.Controlador;
import modelo.ListaSimple;
import vista.Vista;

/**
 *
 * @author Bryam
 */
public class TareasPrioridad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaSimple model = new ListaSimple();
        Vista view = new Vista();
        Controlador cont = new Controlador(model, view);
        cont.mostrarMenu();
    }
    
}
