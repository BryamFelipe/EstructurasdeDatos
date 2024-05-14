/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myBank.vista;

import java.util.Scanner;
import myBank.modelo.Cuenta;

/**
 *
 * @author Bryam
 */
public class BancoVista {
    private Scanner leer;
    
    public BancoVista(){
        this.leer = new Scanner(System.in);
    }
    
    public int mostrarMenuYObtenerOpcion(){
        System.out.println("\n Gestion Banco La Moneda");
        System.out.println("1. Crear cuenta");
        System.out.println("2. Ingresar a su cuenta");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opcion: ");
        int opcion = leer.nextInt();
        leer.nextLine();
        return opcion;
    }
    
    public Cuenta ObtenerDatosBancarios(){
        System.out.print("Ingrese su nombre completo: ");
        String nombre = leer.nextLine();
        System.out.print("Ingrese su documento de identidad: ");
        String docuIden = leer.nextLine();
        System.out.print("Ingrese el monto con el que desea iniciar: ");
        int monto = leer.nextInt();
        leer.nextLine();
        return new Cuenta(nombre, docuIden, monto);
    }
    
    public void mostrarCuenta(Cuenta Cuenta){
        if (Cuenta == null){
            System.out.println("No hay ninguna cuenta guardada.");
        } else{
            System.out.println("\n Informacion de usuario:");
            System.out.println("Nombre: " + Cuenta.getNombre());
            System.out.println("D.I: " + Cuenta.getDocuIden());
            System.out.println("Su Monto es: " + Cuenta.getMonto());
            System.out.println("¿Que desea?");
            System.out.println("1. Retirar");
            System.out.println("2. Depositar");
            int opcion = leer.nextInt();
            if(opcion == 1){
            System.out.println("Cuanto desea retirar");
            int cantidadRetiro = leer.nextInt();
            Cuenta.retirarDinero(cantidadRetiro);
            } else {
                System.out.println("Cuanto desea depositar: ");
                int cantidadDeposito = leer.nextInt();
                Cuenta.depositarDinero(cantidadDeposito);
            }
        }
    }
    
    public void mostrarMensaje(String mensaje){
        System.out.print(mensaje);
    }
}
