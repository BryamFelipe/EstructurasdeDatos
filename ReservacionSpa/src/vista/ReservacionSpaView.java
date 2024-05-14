/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.CircularLista;

/**
 *
 * @author Bryam
 */
public class ReservacionSpaView {
    private CircularLista model;

    public ReservacionSpaView(CircularLista model) {
        this.model = model;
    }

    public void printNodes() {
        model.atravesarLista();
    }

    public void agregarNodo(String Nombre, String Tratamiento) {
        model.agregarNodo(Nombre, Tratamiento);
        System.out.println("Reserva hecha correctamente a nombre de :" +Nombre+ " con Tratamiento: " +Tratamiento);
    }


    public void checkNodo(String Nombre, String Tratamiento) {
        if (model.contenerNodo(Nombre, Tratamiento)) {
            System.out.println("Reserva encontrada a nombre de :" +Nombre+ " con Tratamiento: " +Tratamiento);
        } else {
            System.out.println("Reserva no encontrada a nombre de :" +Nombre+ " con Tratamiento: " +Tratamiento);
        }
    }
}
