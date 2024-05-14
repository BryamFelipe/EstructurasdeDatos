/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Pila;
import vista.Vista;

/**
 *
 * @author Bryam
 */
public class Controlador {
    private final Pila modelo;
    private final Vista vista;

    public Controlador(Pila modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    
    public void verificarBalanceo(String cadena){
        boolean resultado = modelo.Balancear(cadena);
        vista.mostrarResultado(resultado);
    }
}
