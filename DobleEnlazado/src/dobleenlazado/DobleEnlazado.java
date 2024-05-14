/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dobleenlazado;

import java.util.Scanner;

/**
 *
 * @author Bryam
 */
public class DobleEnlazado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Lista listado = new Lista();

        int opcion;
        
        do {
            System.out.println("\nBienvenido a la JDC");
            System.out.println("1. Desea agregar un estudiante al inicio");
            System.out.println("2. Desea agregar un estudiante al final");
            System.out.println("3. Desea eliminar el estudiante del final de la lista");
            System.out.println("4. Desea eliminar el estudante al inicio de la lista");
            System.out.println("5. Mostrar la lista");
            System.out.println("6. Salir");
            System.out.println("Por favor seleccione una opcion: ");
            opcion = leer.nextInt();
            leer.nextLine();
            
            switch(opcion){
                case 1:
                    System.out.println("Escriba el nombre del estudiante: ");
                    String nombre=leer.nextLine();
                    System.out.println("Escriba la edad del estudiante: ");
                    String edad=leer.nextLine();
                    listado.agregarAlInicio(new Estudiante(nombre, edad));
                    break;
                case 2:
                    System.out.println("Escriba el nombre del estudiante: ");
                    String nombreFi=leer.nextLine();
                    System.out.println("Escriba la edad del estudiante: ");
                    String edadFi=leer.nextLine();
                    listado.agregarAlFinal(new Estudiante(nombreFi, edadFi));
                    break;
                case 3:
                    
                    listado.eliminarAlFinal();
                    break;
                case 4:
                    listado.eliminarAlInicio();
                    break;
                case 5:
                    System.out.println("Mostrando..........");
                    listado.mostrarEstudiantes();
                    break;
                case 6:
                    System.out.println("Saliendo........");
                default:
                    System.out.println("Opción no valida. Inténtelo de nuevo.");
                    break;    
            }
        }while(opcion !=6);
         leer.close();

    }   
    
    
}
