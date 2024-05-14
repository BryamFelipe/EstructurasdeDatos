/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package feriado;

import java.util.Scanner;

/**
 *
 * @author Bryam
 */
public class Feriado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaCircular listaActividades = new ListaCircular();
        listaActividades.agregarActividad("Experimento de química", "Demostración de reacciones químicas", 20);
        listaActividades.agregarActividad("Robotics Challenge", "Construcción y programación de robots", 15);
        listaActividades.agregarActividad("Explorando el universo", "Observación de cuerpos celestes", 25);

        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Actividades disponibles:");
        listaActividades.mostrarActividades();
        System.out.println("Seleccione el número de turnos que desea para las actividades: ");
        int numeroTurnos = scanner.nextInt();
        System.out.println("\nAsignando turnos:");
        
        for (int i = 0; i < numeroTurnos; i++) {
            Nodo turno = listaActividades.asignarTurno();
            System.out.println("Turno " + (i + 1) + " - Actividad: " + turno.nombre);
        }

        // Mostrar la actividad restante después de asignar los turnos
        System.out.println("\nActividad restante después de asignar " + numeroTurnos + " turnos:");
        listaActividades.mostrarActividadesRestantes(numeroTurnos, numeroTurnos + 3);
        }
    
}
