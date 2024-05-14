/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author nicop
 */
public class Cliente {
    private String nombre;
    private int numero;

    public Cliente(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", numero=" + numero +
                '}';
    }
}

