/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feriado;

/**
 *
 * @author Bryam
 */
public class ListaCircular {
    Nodo primero;
    Nodo ultimo;
    Nodo ultimoTurnoAsignado = null;

    public ListaCircular() {
        primero = null;
        ultimo = null;
    }

    public void agregarActividad(String nombre, String descripcion, int capacidad) {
        Nodo nuevaActividad = new Nodo(nombre, descripcion, capacidad);
        if (primero == null) {
            primero = nuevaActividad;
            ultimo = nuevaActividad;
            nuevaActividad.siguiente = primero;
        } else {
            ultimo.siguiente = nuevaActividad;
            nuevaActividad.siguiente = primero;
            ultimo = nuevaActividad;
        }
    }

    public void mostrarActividades() {
        if (primero == null) {
            System.out.println("No hay actividades disponibles.");
            return;
        }
        Nodo actual = primero;
        do {
            System.out.println("Nombre: " + actual.nombre);
            System.out.println("Descripción: " + actual.descripcion);
            System.out.println("Capacidad: " + actual.capacidad);
            System.out.println("-------------------------");
            actual = actual.siguiente;
        } while (actual != primero);
    }

    public Nodo asignarTurno() {
        if (primero == null) {
        System.out.println("No hay actividades disponibles.");
        return null;
    }
    if (ultimoTurnoAsignado == null) {
        ultimoTurnoAsignado = primero;
    } else {
        ultimoTurnoAsignado = ultimoTurnoAsignado.siguiente;
    }
    return ultimoTurnoAsignado;
    }
    
    public void mostrarActividadesRestantes(int desdeTurno, int hastaTurno) {
    if (primero == null) {
        System.out.println("No hay actividades disponibles.");
        return;
    }
    
    Nodo actual = primero;
    int contador = 0;
    
    // Avanzamos al nodo correspondiente al turno "desdeTurno"
    while (contador < desdeTurno) {
        actual = actual.siguiente;
        contador++;
    }

    System.out.println("\nActividades restantes:");
    contador = desdeTurno;
    
    // Recorremos la lista hasta el turno "hastaTurno" mostrando las actividades restantes
    while (contador < hastaTurno) {
        System.out.println("Nombre: " + actual.nombre);
        System.out.println("Descripción: " + actual.descripcion);
        System.out.println("Capacidad: " + actual.capacidad);
        System.out.println("-------------------------");
        
        actual = actual.siguiente;
        contador++;
        
        // Si llegamos al final de la lista, volvemos al principio
        if (actual == primero) {
            break;
        }
    }
}
}
