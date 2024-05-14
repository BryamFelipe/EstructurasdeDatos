/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package feriaciencia;

import java.util.Scanner;

/**
 *
 * @author Bryam
 */
public class FeriaCiencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SistemaTurnos sistema = new SistemaTurnos();
        sistema.agregarActividad(new Actividad("Experimentos de Química", "Realiza emocionantes experimentos químicos.", 10));
        sistema.agregarActividad(new Actividad("Robótica Creativa", "Construye y programa robots.", 8));
        sistema.agregarActividad(new Actividad("Astronomía en Vivo", "Observa el cielo a través de telescopios.", 15));

        Scanner scanner = new Scanner(System.in);
        String nombreVisitante;
        int opcionActividad;

        while (true) {
            sistema.mostrarActividades();
            System.out.println("Seleccione el número de la actividad en la que desea participar (o escriba 'salir' para terminar): ");
            String opcion = scanner.nextLine();
            if (opcion.equalsIgnoreCase("salir")) {
                break;
            }
            opcionActividad = Integer.parseInt(opcion);
            if (opcionActividad < 1 || opcionActividad > 3) {
                System.out.println("Opción inválida. Por favor, seleccione un número válido.");
                continue;
            }
            System.out.print("Ingrese su nombre para obtener un turno: ");
            nombreVisitante = scanner.nextLine();
            sistema.asignarTurno(nombreVisitante, opcionActividad);
        }
    }
    
}
