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
public class Vista {
    public String ingresarCadena(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la expresion: ");
        return scanner.nextLine();
    }
    
    public void mostrarResultado(int resultado){
        System.out.print("Resultado: " +resultado);
    }
}
