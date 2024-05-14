/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.Scanner;
import modelo.CircularLista;
import vista.ReservacionSpaView;

/**
 *
 * @author Bryam
 */
public class ReservacionSpaController {
    private ReservacionSpaView view;
    private CircularLista cLista;

    public ReservacionSpaController(ReservacionSpaView view, CircularLista cLista) {
        this.view = view;
        this.cLista = cLista;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

         boolean repetir = true;

        while (repetir) {
            System.out.println("\nBienvenido a Spa K-Beauty");
            System.out.println("1. Agregar reserva");
            System.out.println("2. Buscar reserva");
            System.out.println("3. Mostrar reservas");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese su nombre:");
                    String name = scanner.next();
                    System.out.println("Ingrese el tratamiento:");
                    String treatment = scanner.next();

                    cLista.agregarNodo(name, treatment);

                    break;

                case 2:
                    System.out.println("Ingrese su nombre:");
                    name = scanner.next();
                    System.out.println("Ingrese el tratamiento:");
                    treatment = scanner.next();

                    if (cLista.contenerNodo(name, treatment)) {
                        System.out.println("Reserva encontrada");
                    } else {
                        System.out.println("Reserva no encontrada");
                    }

                    break;

                case 3:
                    cLista.atravesarLista();

                    break;

                case 4:
                    repetir = false;

                    break;

                default:
                    System.out.println("Opción inválida");

            }

        }
    }
}
