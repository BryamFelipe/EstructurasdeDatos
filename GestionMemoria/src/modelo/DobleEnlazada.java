/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Bryam
 */
public class DobleEnlazada {
    private Nodo cabeza;
    private Nodo cola;

    public DobleEnlazada() {
        this.cabeza = null;
        this.cola = null;
    }

    public void insertarAlFinal(String nombre) {
        Nodo nuevoNodo = new Nodo(nombre);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            cola = nuevoNodo;
        }
    }

    public String mostrar() {
        StringBuilder resultado = new StringBuilder();
        Nodo actual = cabeza;
        while (actual != null) {
            resultado.append(actual.getNombre()).append("\n");
            actual = actual.siguiente;
        }
        return resultado.toString();
    }
}
