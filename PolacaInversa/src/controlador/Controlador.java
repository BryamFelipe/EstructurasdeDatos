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
    public int evaluar(String expresion) {
        String[] tokens = expresion.split(" ");

        for (String token : tokens) {
            if (esOperando(token)) {
                modelo.push(Integer.parseInt(token));
            } else {
                if (modelo.obtenerTamaño()< 2) {
                    throw new IllegalArgumentException("Expresión inválida");
                }
                int operando2 = modelo.pop();
                int operando1 = modelo.pop();
                int resultado = realizarOperacion(token, operando1, operando2);
                modelo.push(resultado);
            }
        }

        if (modelo.obtenerTamaño()!= 1) {
            throw new IllegalArgumentException("Expresión inválida");
        }

        return modelo.pop();
    }
    
    private boolean esOperando(String token) {
        return token.matches("\\d+(\\.\\d+)?");
    }
    
     private int realizarOperacion(String operador, int operando1, int operando2) {
        switch (operador) {
            case "+":
                return operando1 + operando2;
            case "-":
                return operando1 - operando2;
            case "*":
                return operando1 * operando2;
            case "/":
                return operando1 / operando2;
            default:
                throw new IllegalArgumentException("Operador inválido: " + operador);
        }
    }
     
    public void manejarEventos(){
        String expresion = vista.ingresarCadena();
        int resultado = evaluar();
        vista.mostrarResultado(resultado);
    }

    private int evaluar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
