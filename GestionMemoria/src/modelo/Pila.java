/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Bryam
 */
public class Pila {
    private Nodo top;

    public Pila() {
        this.top = null;
    }

    public void push(String nombre) {
        Nodo nuevoNodo = new Nodo(nombre);
        if (top == null) {
            top = nuevoNodo;
        } else {
            nuevoNodo.siguiente = top;
            top = nuevoNodo;
        }
    }

    public Nodo pop() {
        if (top == null) {
            return null;
        }
        Nodo nodoEliminado = top;
        top = top.siguiente;
        nodoEliminado.siguiente = null;
        return nodoEliminado;
    }
}
