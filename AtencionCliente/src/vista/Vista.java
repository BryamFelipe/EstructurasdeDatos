/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Queue;
import java.util.Scanner;
import modelo.Cliente;

/**
 *
 * @author nicop
 */
public class Vista {
    private Scanner scanner;

    public Vista() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public String leerEntrada() {
        return scanner.nextLine();
    }

    public int leerOpcion() {
        return Integer.parseInt(scanner.nextLine());
    }

    public String solicitarNombreCliente() {
        System.out.print("Ingrese el nombre del cliente: ");
        return leerEntrada();
    }

    public void mostrarCola(Queue<Cliente> clientes) {
        System.out.println("Cola actual:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}
