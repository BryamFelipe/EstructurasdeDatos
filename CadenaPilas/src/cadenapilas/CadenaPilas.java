/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadenapilas;

import controlador.Controlador;
import modelo.Pila;
import vista.Vista;

/**
 *
 * @author Bryam
 */
public class CadenaPilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila modelo = new Pila();
        Vista vista = new Vista();
        Controlador cont = new Controlador(modelo, vista);
        String cadena = vista.ingresarCadena();
        cont.verificarBalanceo(cadena);
    }
    
}
