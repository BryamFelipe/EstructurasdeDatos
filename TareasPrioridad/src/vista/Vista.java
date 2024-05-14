/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.ListaSimple;

/**
 *
 * @author Bryam
 */
public class Vista {
    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void mostrarLibros(ListaSimple list) {
        System.out.println("Lista de Tareas:");
        list.mostrarTareas();
    }
}
