/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myEstudiante.Controlador;

import myEstudiante.Modelo.DetallesEstudiantes;
import myEstudiante.vista.EstudianteVista;

/**
 *
 * @author Bryam
 */
public class EstudianteControlador {
    private EstudianteVista vista;
    private DetallesEstudiantes modelo;

    
    public EstudianteControlador(EstudianteVista vista){
        this.vista = vista;
    }
    
    public void iniciar(){
        boolean salir = false;
        while(!salir){
            int opcion = vista.mostrarMenuPrincipal();
            switch (opcion){
                case 1:
                    this.modelo = vista.AñadirEstudiantes();
                    vista.mostrarMensaje("Estudiante agregado");
                    break;
                case 2:
                    vista.buscarEstudiante(modelo);
                    vista.mostrarMensaje("Estudiate encontrado");
                    break;
                case 3:
                    vista.modificarEstudiante(modelo);
                    vista.mostrarMensaje("Modificacion Exitosa");
                    break;
                case 4:
                    vista.eliminarDato(modelo);
                    vista.mostrarMensaje("Estudiante eliminado");
                    break;
                case 5:
                    vista.insertar(modelo);
                    vista.mostrarMensaje("Posicion cambiada");
                    break;       
                case 6:
                    vista.mostrar(modelo);
                    vista.mostrarMensaje("Estudiante revelados");
                    break;
                case 7:
                    salir = true;
                    vista.mostrarMensaje("Saliendo...");
                    break;       
                default:
                    vista.mostrarMensaje("Opcion no valida. Por favor intente de nuevo.");
            }
        }
    }
}
