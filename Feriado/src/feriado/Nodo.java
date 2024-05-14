/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feriado;

/**
 *
 * @author Bryam
 */
public class Nodo {
    String nombre;
    String descripcion;
    int capacidad;
    Nodo siguiente;

    public Nodo(String nombre, String descripcion, int capacidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.capacidad = capacidad;
        this.siguiente = null;
    }
}
