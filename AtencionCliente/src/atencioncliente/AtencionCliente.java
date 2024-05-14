/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atencioncliente;

import controlador.Controlador;
import vista.Vista;

/**
 *
 * @author nicop
 */
public class AtencionCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Controlador controlador = new Controlador();
       Vista vista = new Vista();
       controlador.Iniciar();
    }
}
   
    

