/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.Scanner;
import modelo.ListaSimple;
import modelo.Tarea;
import vista.Vista;

/**
 *
 * @author Bryam
 */
public class Controlador {
    private ListaSimple model;
    private Vista view;

    public Controlador(ListaSimple model, Vista view) {
        this.model = model;
        this.view = view;
    }
    
    
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            view.displayMessage("Bienvenido al gestor de tareas:");
            view.displayMessage("1. Agregar tarea");
            view.displayMessage("2. Eliminar tarea");
            view.displayMessage("3. Mostrar tareas");
            view.displayMessage("4. Salir");
            
            int option = scanner.nextInt();
            
            if(option == 1){
                System.out.println("Ingrese la descripcion de la tarea:");
                    String descripcion = scanner.next();
                    System.out.println("Ingrese la prioridad de la tarea:");
                    int prioridad = scanner.nextInt();
                    model.agregarTarea(new Tarea(descripcion, prioridad));
            }
            else if (option == 2) {
                System.out.println("Ingrese la descripcion de la tarea a eliminar:");
                    String tareaEliminar = scanner.next();
                    model.eliminarTarea(tareaEliminar);
            }
            else if (option == 3) {
                model.mostrarTareas();
            }
            else if (option == 4) {
                view.displayMessage("Saliendo...");
                break;
            }
            else {
                view.displayMessage("Opcion invalida.");
            }
        }

        scanner.close();    
    }

}
