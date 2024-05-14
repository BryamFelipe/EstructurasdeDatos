/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duplicados;

import java.util.Scanner;

/**
 *
 * @author Bryam
 */
public class Duplicados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer  = new Scanner (System.in);
        Lista lista = new Lista();
        
        int opcion;
        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Mostrar Lista");
            System.out.println("3. Eliminar duplicados");
            System.out.println("4. Salir");            
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();
            leer.nextLine(); // Consumir el salto de línea después de nextInt()

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la valor a agregar: ");
                    String Valor = leer.nextLine();
                    lista.agregarValor(Valor);
                    break;
                case 2:
                    System.out.print("Mostrando lista....");
                    lista.MostrarDatos();
                    break;
                case 3:
                    lista.removerDuplicados();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no valida. Inténtelo de nuevo.");
                    break;
            }
        } while (opcion != 4);

        leer.close();
    }
    
}
