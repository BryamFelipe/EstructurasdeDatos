/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Bryam
 */
public class CircularLista {
    private Nodo cabeza;
    private int size;

    public CircularLista() {
        cabeza = null;
        size = 0;
    }

    public void agregarNodo(String Nombre, String Tratamiento) {
        Nodo nuevoNodo = new Nodo(Nombre, Tratamiento);

    if (cabeza != null) {
            nuevoNodo.siguiente = cabeza.siguiente;
            cabeza.siguiente = nuevoNodo;
            cabeza = nuevoNodo;
        } else {
            nuevoNodo.siguiente = nuevoNodo;
            cabeza = nuevoNodo;
        }

        size++;
    }

    public boolean contenerNodo(String Nombre, String Tratamiento) {
        Nodo actual = cabeza;

        if (cabeza == null) {
            return false;
        } else {
            do {
                if (actual.Nombre.equals(Nombre) && actual.Tratamiento.equals(Tratamiento)) {
                return true;
            }
                actual = actual.siguiente;
            } while (actual != cabeza);
            return false;
        }
    }

    public void atravesarLista() {
       if (cabeza == null) {
            System.out.println("Lista vacía");
            return;
        }

        Nodo actual = cabeza.siguiente;

        for (int i = 0; i < size; i++) {
            System.out.println("Nombre: " + actual.Nombre + ", Tratamiento: " + actual.Tratamiento + " ,con el turno: " +i);
            actual = actual.siguiente;
        }
    }
    
    public int getSize() {
        return size;
    }

}
