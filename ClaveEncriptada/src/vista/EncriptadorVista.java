/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author Bryam
 */
public class EncriptadorVista {
    private Scanner scanner;

    public EncriptadorVista() {
        scanner = new Scanner(System.in);
    }

    public String obtenerContrasena() {
        System.out.print("Ingrese la contraseña: ");
        return scanner.nextLine();
    }

    public void mostrarResultadoEncriptacion(String contrasenaEncriptada) {
        System.out.println("Contraseña encriptada: " + contrasenaEncriptada);
    }

    public void mostrarResultadoDesencriptacion(String contrasenaDesencriptada) {
        System.out.println("Contraseña desencriptada: " + contrasenaDesencriptada);
    }
    
    public int obtenerOpcion() {
        return scanner.nextInt();
    }
}
