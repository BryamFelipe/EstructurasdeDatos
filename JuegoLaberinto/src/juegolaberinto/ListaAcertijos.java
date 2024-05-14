/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegolaberinto;

import java.util.Scanner;

/**
 *
 * @author Bryam
 */

public class ListaAcertijos {
    private Nodo actual;
    private int keyCount;

    public ListaAcertijos() {
        keyCount = 0;

        // Create the riddles and link them together
        Nodo Nodo1 = new Nodo("¿Qué tiene cuatro patas pero no puede caminar?", "una mesa");
        Nodo Nodo2 = new Nodo("¿Qué tiene dos caras pero no puede hablar?", "una moneda");
        Nodo Nodo3 = new Nodo("¿Qué tiene un cuello pero no cabeza?", "una botella");

        Nodo1.setSiguiente(Nodo2);
        Nodo2.setSiguiente(Nodo3);

        // Set the first riddle as the current one
        actual = Nodo1;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        while (actual != null) {
            System.out.println(actual.getPregunta());
            System.out.print("Ingresa tu respuesta: ");
            String respuesta = scanner.nextLine();

            if (actual.checkRespuesta(respuesta)) {
                System.out.println("¡Correcto! ¡Has ganado una llave!");
                keyCount++;

                actual = actual.getSiguiente();
                
            }else{
                System.out.println("Lo siento, esa no es la respuesta correcta.");
                System.out.print("Intenta de nuevo: ");
                respuesta = scanner.nextLine();
                if (actual.checkRespuesta(respuesta)) {
                System.out.println("¡Correcto! ¡Has ganado una llave!");
                keyCount++;

                actual = actual.getSiguiente();
                
                }
            }

            
        }

        System.out.println("¡Has completado todas las adivinanzas! ¡Felicidades!");
    }

}

