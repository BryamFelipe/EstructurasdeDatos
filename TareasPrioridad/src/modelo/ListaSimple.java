/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Bryam
 */
public class ListaSimple {
    Nodo inicio;

    public ListaSimple() {
        this.inicio = null;
    }

    public void agregarTarea(Tarea tarea) {
        Nodo nuevoNodo = new Nodo(tarea);
        if (inicio == null || tarea.prioridad < inicio.tarea.prioridad) {
            nuevoNodo.siguiente = inicio;
            inicio = nuevoNodo;
        } else {
            Nodo actual = inicio;
            while (actual.siguiente != null && actual.siguiente.tarea.prioridad <= tarea.prioridad) {
                actual = actual.siguiente;
            }
            nuevoNodo.siguiente = actual.siguiente;
            actual.siguiente = nuevoNodo;
        }
    }

    public void eliminarTarea(String descripcion) {
        if (inicio != null) {
            if (inicio.tarea.descripcion.equals(descripcion)) {
                inicio = inicio.siguiente;
                return;
            }
            Nodo actual = inicio;
            while (actual.siguiente != null && !actual.siguiente.tarea.descripcion.equals(descripcion)) {
                actual = actual.siguiente;
            }
            if (actual.siguiente != null) {
                actual.siguiente = actual.siguiente.siguiente;
            }
        }
    }

    public void mostrarTareas() {
        Nodo actual = inicio;
        while (actual != null) {
            System.out.println(actual.tarea);
            actual = actual.siguiente;
        }
    }
}
