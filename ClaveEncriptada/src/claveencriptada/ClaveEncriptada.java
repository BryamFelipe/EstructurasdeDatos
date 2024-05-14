/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package claveencriptada;

import controlador.EncriptadorControlador;
import modelo.EncriptadorModelo;
import vista.EncriptadorVista;

/**
 *
 * @author Bryam
 */
public class ClaveEncriptada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EncriptadorModelo modelo = new EncriptadorModelo();
        EncriptadorVista vista = new EncriptadorVista();
        EncriptadorControlador controlador = new EncriptadorControlador(modelo, vista);

        // Menú de opciones
        System.out.println("Seleccione una opción:");
        System.out.println("1. Encriptar contraseña");
        System.out.println("2. Desencriptar contraseña");
        System.out.println("3. Ingresar contraseña");
        System.out.print("Opción: ");

        // Leer la opción del usuario
        int opcion = vista.obtenerOpcion();

        // Realizar la acción correspondiente según la opción seleccionada
        switch (opcion) {
            case 1:
                controlador.encriptarContrasena();
                break;
            case 2:
                controlador.desencriptarContrasena();
                break;
            case 3:
                vista.obtenerContrasena();
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione 1 o 3.");
        }
    }
    
    
}
