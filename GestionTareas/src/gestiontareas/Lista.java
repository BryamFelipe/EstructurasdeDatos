/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiontareas;

/**
 *
 * @author Bryam
 */
public class Lista {
    public Nodo inicio;
    
    public Lista(){
        inicio=null;
    }
    
    public void agregarTarea(String Tarea) {
        if (inicio == null) {
            inicio = new Nodo(Tarea);
        } else {
            Nodo temp = inicio;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(new Nodo(Tarea));
        }
        System.out.println("Tarea agregada correctamente.");
    }
    
    public void completarTarea(String Tarea) {
        Nodo temp = inicio;
        while (temp != null) {
            if (temp.getTarea().equals(Tarea)) {
                temp.setCompletada(true);
                System.out.println("Tarea completada correctamente.");
                return;
            }
            temp = temp.getSiguiente();
        }
        System.out.println("La tarea especificada no se encontró en la lista.");
    }
    
    public void listarTareas() {
        Nodo temp = inicio;
        System.out.println("----- Lista de tareas -----");
        while (temp != null) {
            System.out.println(temp.getTarea() + (temp.isCompletada() ? " - Completada" : " - Pendiente"));
            temp = temp.getSiguiente();
        }
    }

    public void eliminarTarea(String Tarea) {
        if (inicio == null) {
            System.out.println("La lista de tareas está vacía.");
            return;
        }

        if (inicio.getTarea().equals(Tarea)) {
            inicio = inicio.getSiguiente();
            System.out.println("Tarea eliminada correctamente.");
            return;
        }

        Nodo anterior = inicio;
        Nodo actual = inicio.getSiguiente();
        while (actual != null) {
            if (actual.getTarea().equals(Tarea)) {
                anterior.setSiguiente(actual.getSiguiente());
                System.out.println("Tarea eliminada correctamente.");
                return;
            }
            anterior = actual;
            actual = actual.getSiguiente();
        }

        System.out.println("La tarea especificada no se encontró en la lista.");
    }

    public int contarTareasPendientes() {
        int contador = 0;
        Nodo temp = inicio;
        while (temp != null) {
            if (!temp.isCompletada()) {
                contador++;
            }
            temp = temp.getSiguiente();
        }
        return contador;
    }
}
