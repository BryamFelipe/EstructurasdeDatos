/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myBank.controlador;

import myBank.modelo.Cuenta;
import myBank.vista.BancoVista;

/**
 *
 * @author Bryam
 */
public class BancoControlador {
    private BancoVista vista;
    private Cuenta cuenta;
    
    public BancoControlador(BancoVista vista){
        this.vista = vista;
    }
    
    public void iniciar(){
        boolean salir = false;
        while(!salir){
            int opcion = vista.mostrarMenuYObtenerOpcion();
            switch (opcion){
                case 1:
                    this.cuenta = vista.ObtenerDatosBancarios();
                    vista.mostrarMensaje("Cuenta creada exitosamente.");
                    break;
                case 2:
                    vista.mostrarCuenta(cuenta);
                    break;
                case 3:
                    salir = true;
                    vista.mostrarMensaje("Saliendo...");
                    break;
                default:
                    vista.mostrarMensaje("Opcion no valida. Por favor intente de nuevo.");
            }
        }
    }
}
