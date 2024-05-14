/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import controlador.MusicalSillaGameController;
import java.util.Random;

/**
 *
 * @author Bryam
 */
public class MusicalSillaGameModel {

    
    private static class Nodo {
        boolean estaOcupado;
        Nodo next;

        public Nodo(boolean estaOcupado) {
            this.estaOcupado = estaOcupado;
        }
    }
    
    private Nodo cabeza;
    public int numJugadores;
    private Random random;
    private MusicalSillaGameController controller;

    public MusicalSillaGameModel(int numJugadores, MusicalSillaGameController controller) {
        this.numJugadores = numJugadores;
        this.random = new Random();
        cabeza = new Nodo(false);
        cabeza.next = cabeza;
        this.controller = controller;
        // Crear la lista circular
        Nodo lastNode = null;
        for (int i = 1; i < numJugadores; i++) {
            Nodo newNode = new Nodo(false);
            lastNode.next = newNode;
            newNode.next = cabeza;
            lastNode = newNode;
        }

    }

    public void playGame() {
        Nodo currentPlayer = cabeza;
        while (numJugadores > 1) {
        // Simular la música
        System.out.println("Sonando musica");
            int numSteps = random.nextInt(numJugadores) + 1;
            for (int i = 0; i < numSteps; i++) {
                currentPlayer = currentPlayer.next;
            }

        // Ocupar sillas
        currentPlayer.estaOcupado = true;
        currentPlayer = currentPlayer.next;
        numJugadores--;

        // Eliminar el jugador eliminado de la lista circular
        Nodo prevPlayer = cabeza;
        while (prevPlayer.next != currentPlayer) {
            prevPlayer = prevPlayer.next;
        }
        prevPlayer.next = currentPlayer.next;
        currentPlayer = currentPlayer.next;

        // Notificar al controlador que cambió el estado del juego
        System.out.println("Musica pausada");
        controller.updateState(numJugadores, getState());

        // Verificar si queda un solo jugador en el juego
        if (numJugadores == 1) {
            break;
        }
    }

        // El único jugador restante es el ganador
        Nodo winner = cabeza;
        while (winner.next != cabeza) {
            winner = winner.next;
        }
        controller.announceWinner(winner.estaOcupado ? 1 : 0);
    }

    public boolean[] getState() {
        boolean[] state = new boolean[numJugadores];
        Nodo node = cabeza;
        for (int i = 0; i < numJugadores; i++) {
            state[i] = node.estaOcupado;
            node = node.next;
        }
        return state;
    }
}
