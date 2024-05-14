/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Cliente;
import modelo.Cola;
import vista.Vista;

/**
 *
 * @author nicop
 */
public class Controlador {
    private Cola cola;
    private Vista vista;

    public Controlador() {
        cola = new Cola();
        vista = new Vista();
    }

    public void Iniciar() {
        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            int opcion = vista.leerOpcion();

            switch (opcion) {
                case 1:
                    agregarCliente();
                    break;
                case 2:
                    atenderCliente();
                    break;
                case 3:
                    vista.mostrarCola(cola.getClientes());
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    vista.mostrarMensaje("Opcion no valida, intente nuevamente.");
                    break;
            }
        }
    }

    private void mostrarMenu() {
        vista.mostrarMensaje("\nOpciones:");
        vista.mostrarMensaje("1. Añadir cliente");
        vista.mostrarMensaje("2. Atender cliente");
        vista.mostrarMensaje("3. Mostrar cola");
        vista.mostrarMensaje("4. Salir");
        vista.mostrarMensaje("Seleccione una opcion: ");
    }

    private void agregarCliente() {
        String nombre = vista.solicitarNombreCliente();
        int numero = cola.getContador() + 1;
        Cliente cliente = new Cliente(nombre, numero);
        cola.agregar(cliente);
        vista.mostrarMensaje("Cliente añadido: " + cliente);
    }

    private void atenderCliente() {
        if (cola.isEmpty()) {
            vista.mostrarMensaje("No hay clientes para atender.");
        } else {
            Cliente cliente = cola.atender();
            vista.mostrarMensaje("Atendiendo al cliente: " + cliente);
        }
    }
}

