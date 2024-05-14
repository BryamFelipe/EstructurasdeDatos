/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestiontareas;

import java.util.Scanner;

/**
 *
 * @author Bryam
 */
public class GestionTareas {
    public static void main(String[] args) {
        Scanner leer  = new Scanner (System.in);
        Lista lista = new Lista();
        
        int opcion;
        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Completar tarea");
            System.out.println("3. Listar tareas");
            System.out.println("4. Eliminar tarea");
            System.out.println("5. Contar tareas pendientes");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();
            leer.nextLine(); // Consumir el salto de línea después de nextInt()

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la tarea a agregar: ");
                    String tareaAgregar = leer.nextLine();
                    lista.agregarTarea(tareaAgregar);
                    break;
                case 2:
                    System.out.print("Ingrese la tarea a completar: ");
                    String tareaCompletar = leer.nextLine();
                    lista.completarTarea(tareaCompletar);
                    break;
                case 3:
                    lista.listarTareas();
                    break;
                case 4:
                    System.out.print("Ingrese la tarea a eliminar: ");
                    String tareaEliminar = leer.nextLine();
                    lista.eliminarTarea(tareaEliminar);
                    break;
                case 5:
                    int tareasPendientes = lista.contarTareasPendientes();
                    System.out.println("Número de tareas pendientes: " + tareasPendientes);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no valida. Inténtelo de nuevo.");
                    break;
            }
        } while (opcion != 6);

        leer.close();
    
    }
    
}
