/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.MusicalSillaGameController;

/**
 *
 * @author Bryam
 */
public class MusicalSillaGameView {
    public MusicalSillaGameView(MusicalSillaGameController controller) {
        this.controller = controller;
    }

    public void printState(int numJugadores, boolean[] state) {
        System.out.println("Quedan " + numJugadores + " sillas y " + (numJugadores ) + " jugadores");
        System.out.println("Silla:  Ocupada");
        for (int i = 0; i < state.length; i++) {
            System.out.println("" + (i + 1) + ": " + (state[i] ? "Si" : "No"));
        }
        System.out.println("Silla:  Ocupada");
    }

    private MusicalSillaGameController controller;
}
