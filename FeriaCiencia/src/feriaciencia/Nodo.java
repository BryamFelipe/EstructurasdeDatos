/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feriaciencia;

/**
 *
 * @author Bryam
 */
public class Nodo {
    Actividad actividad;
    Nodo siguiente;

    public Nodo(Actividad actividad) {
        this.actividad = actividad;
        this.siguiente = null;
    }
}
