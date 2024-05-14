/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feriaciencia;

/**
 *
 * @author Bryam
 */
public class SistemaTurnos {
    Nodo primero;

    public SistemaTurnos() {
        this.primero = null;
    }

    public void agregarActividad(Actividad actividad) {
        Nodo nuevo = new Nodo(actividad);
        if (primero == null) {
            nuevo.siguiente = nuevo;
            primero = nuevo;
        } else {
            nuevo.siguiente = primero.siguiente;
            primero.siguiente = nuevo;
        }
    }

    public void asignarTurno(String nombreVisitante, int opcionActividad) {
        if (primero == null) {
            System.out.println("No hay actividades registradas en la feria de ciencia.");
            return;
        }
        Nodo actual = primero.siguiente;
        int contador = 1;
        do {
            if (contador == opcionActividad) {
                if (actual.actividad.capacidad > 0) {
                    System.out.println(nombreVisitante + ", su turno es para la actividad: " + actual.actividad.nombre);
                    actual.actividad.capacidad--;
                    return;
                } else {
                    System.out.println("Lo siento, la actividad " + actual.actividad.nombre + " está completa en este momento.");
                    return;
                }
            }
            actual = actual.siguiente;
            contador++;
        } while (actual != primero.siguiente);
        System.out.println("Opción de actividad inválida.");
    }
    
    public void mostrarActividades() {
        if (primero == null) {
            System.out.println("No hay actividades registradas en la feria de ciencia.");
            return;
        }
        Nodo actual = primero.siguiente;
        int i = 1;
        do {
            System.out.println(i + ". " + actual.actividad.nombre + " - Cupos disponibles: " + actual.actividad.capacidad);
            actual = actual.siguiente;
            i++;
        } while (actual != primero.siguiente);
    }
}
