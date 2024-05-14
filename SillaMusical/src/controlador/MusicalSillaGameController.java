/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.Scanner;
import modelo.MusicalSillaGameModel;
import vista.MusicalSillaGameView;

/**
 *
 * @author Bryam
 */
public class MusicalSillaGameController {
    private int numJugadores;
    private MusicalSillaGameModel model;
    private MusicalSillaGameView view;
    
    public MusicalSillaGameController(int numJugadores) {
        this.numJugadores = numJugadores;
        this.model = new MusicalSillaGameModel(numJugadores, this);
        this.view = new MusicalSillaGameView(this);
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de jugadores (2-10):");
        int numJugadores = scanner.nextInt();
        while (numJugadores < 2 || numJugadores > 10) {
            System.out.println("Numero de jugadores invalido. Ingrese un numero entre 2 y 10.");
            numJugadores = scanner.nextInt();
        }
        model.numJugadores = numJugadores;
        playGame();
    }

    public void playGame() {
        model.playGame();
    }

    public void updateState(int numPlayers, boolean[] state) {
        view.printState(numPlayers, state);
    }

    public void announceWinner(int winnerIndex) {
        System.out.println("El ganador es el jugador " + (winnerIndex + 1) + ".");
    }

}
