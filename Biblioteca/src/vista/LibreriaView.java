/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.ListaEnlazada;

/**
 *
 * @author Bryam
 */
public class LibreriaView {
    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void mostrarLibros(ListaEnlazada list) {
        System.out.println("Lista de libros:");
        list.mostrarLibros();
    }
}
