/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.EncriptadorModelo;
import vista.EncriptadorVista;

/**
 *
 * @author Bryam
 */
public class EncriptadorControlador {
    private EncriptadorModelo modelo;
    private EncriptadorVista vista;

    public EncriptadorControlador(EncriptadorModelo modelo, EncriptadorVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void encriptarContrasena() {
        String contrasena = vista.obtenerContrasena();
        String contrasenaEncriptada = modelo.encriptarContrasena(contrasena);
        vista.mostrarResultadoEncriptacion(contrasenaEncriptada);
    }

    public void desencriptarContrasena() {
        String contrasenaEncriptada = vista.obtenerContrasena();
        String contrasenaDesencriptada = modelo.desencriptarContrasena(contrasenaEncriptada);
        vista.mostrarResultadoDesencriptacion(contrasenaDesencriptada);
    }
}
