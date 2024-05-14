/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionbanco;

import myBank.controlador.BancoControlador;
import myBank.vista.BancoVista;

/**
 *
 * @author Bryam
 */
public class GestionBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BancoVista vista = new BancoVista();
        BancoControlador cont = new BancoControlador(vista);
        cont.iniciar();
    }
    
}
