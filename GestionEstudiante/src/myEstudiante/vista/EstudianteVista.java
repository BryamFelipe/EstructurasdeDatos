/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myEstudiante.vista;

import java.util.ArrayList;
import java.util.Scanner;
import myEstudiante.Modelo.DetallesEstudiantes;

/**
 *
 * @author Bryam
 */
public class EstudianteVista {
    private Scanner leer;
    private ArrayList<String>Lista;

    public EstudianteVista(){
        this.leer = new Scanner(System.in);
        this.Lista = new ArrayList<>();
    }
    
    public int mostrarMenuPrincipal(){
        System.out.println("\nGestion de Estudiantes");
        System.out.println("Universidad JDC");
        System.out.println("Oprima la opcion que desea realizar");
        System.out.println("1. Agregar estudiante");
        System.out.println("2. Buscar");
        System.out.println("3. Modificar");
        System.out.println("4. Eliminar");
        System.out.println("5. Insertar");
        System.out.println("6. Mostrar");
        System.out.println("7. Salir");
        System.out.println("Seleccione la opcion que desea realizar: ");
        int opcion = leer.nextInt();
        leer.nextLine();
        return opcion;
    }
    
    
    
    public DetallesEstudiantes AñadirEstudiantes(){
        System.out.println("\nIngrese el nombre del estudiante");
        String nombre = leer.nextLine();
        
        Lista.add(nombre);
        return new DetallesEstudiantes(nombre);
    }
    
    public void buscarEstudiante(DetallesEstudiantes DetallesEstudiantes){
        if (DetallesEstudiantes == null){
            System.out.println("No hay ninguna cuenta guardada.");
        } else{
            System.out.println("\n Informacion de Estudiante:");
            String busNom ="";
            int indice = 0;
            System.out.println("Ingrese el nombre a buscar");
            busNom = leer.nextLine();
            indice = Lista.indexOf(busNom);
            if(indice != -1){
                System.out.println("Dato se encuentra en la posicion: "+ indice);
            }else{
                System.out.println("Dato no se encuentra");
            }
           
        }
    }
    
    public void modificarEstudiante(DetallesEstudiantes DetallesEstudiantes){
        String  busNom = "";
        int indice;
        System.out.println("\nIngrese el nombre del estudiante que desea modificar");
        busNom = leer.nextLine();
        indice = Lista.indexOf(busNom);
        if(indice != -1){
        System.out.println("Nuevo nombre");
        String nuevoNom = leer.nextLine();
        Lista.set(indice, nuevoNom);
        }else{
            System.out.println("Nombre no se encuentra");
        }
    }
    
    public void eliminarDato(DetallesEstudiantes DetallesEstudiantes){
        String busNom;
        int indice;
        System.out.println("\nEstudiante a eliminar: ");
        busNom = leer.nextLine();
        indice = Lista.indexOf(busNom);
        if(indice != -1){
            Lista.remove(indice);
            System.out.println("Dato eliminado");
        }else{
            System.out.println("Estudiante no encontrado");
        }
    }
    
    public void insertar(DetallesEstudiantes DetallesEstudiantes){
        String busNom;
        int indice;
        System.out.println("\nValor a insertar: ");
        busNom = leer.nextLine();
        System.out.println("Posicion donde desea insertar: ");
        indice = leer.nextInt();
        Lista.add(indice, busNom);
    }
    
    public void mostrar(DetallesEstudiantes DetallesEstudiantes){
        if(!Lista.isEmpty()){
            System.out.println("\nElementos de la lista: ");
            for(int i = 0; i<Lista.size(); i++){
                System.out.println(Lista.get(i));
            }
        }else{
            System.out.println("No existen datos en la lista");
        }
    }
    
    public void mostrarMensaje(String mensaje){
        System.out.print(mensaje);
    }
}
