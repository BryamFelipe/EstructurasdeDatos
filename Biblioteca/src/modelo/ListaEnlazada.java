/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Bryam
 */
public class ListaEnlazada {
    public Nodo cabeza;
    public Nodo cola;

    public ListaEnlazada() {
        cabeza = null;
        cola = null;
    }

    public void agregarLibro(Libro libro) {
        Nodo newNodo = new Nodo(libro);

        if (cabeza == null) {
            cabeza = newNodo;
            cola = newNodo;
        } else {
            newNodo.anterior = cola;
            cola.siguiente = newNodo;
            cola = newNodo;
        }
    }

    public void removerLibro(Libro libro) {
        Nodo actual = cabeza;
        
        Libro libroBus = null;
        while (actual != null) {
            if (actual.libro.getTitulo().equals(libro.getTitulo()) && actual.libro.getAutor().equals(libro.getAutor())) {
                libroBus = actual.libro;
                break;
            }

            actual = actual.siguiente;
        }

        // Si el libro fue encontrado en la lista, procedemos a borrarlo
        if (libroBus != null) {
            while (actual != null) {
                if (actual.libro.equals(libroBus)) {
                    if (actual.anterior != null) {
                        actual.anterior.siguiente = actual.siguiente;
                    } else {
                        cabeza = actual.siguiente;
                    }

                    if (actual.siguiente != null) {
                        actual.siguiente.anterior = actual.anterior;
                    } else {
                        cola = actual.anterior;
                    }

                    return;
                }

                actual = actual.siguiente;
            }
        }
    }

    public void updateLibro(Libro oldLibro,Libro newLibro) {
        Nodo actual = cabeza;

        Libro libroBus = null;
        while (actual != null) {
            if (actual.libro.getTitulo().equals(oldLibro.getTitulo()) && actual.libro.getAutor().equals(oldLibro.getAutor())) {
                libroBus = actual.libro;
                break;
            }

            actual = actual.siguiente;
        }

        if (libroBus != null) {
            while (actual != null) {
                if (actual.libro.equals(libroBus)) {
                    actual.libro = newLibro;
                    return;
                }

                actual = actual.siguiente;
            }
        }
    }

    public void mostrarLibros() {
        Nodo actual = cabeza;

        while (actual != null) {
            System.out.println(actual.libro);
            actual = actual.siguiente;
        }
    }
}
