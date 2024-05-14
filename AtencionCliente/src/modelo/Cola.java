/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author nicop
 */
public class Cola {
    private Queue<Cliente> clientes;
    private int contador;

    public Cola() {
        clientes = new LinkedList<>();
        contador = 0;
    }

    public void agregar(Cliente cliente) {
        clientes.add(cliente);
        contador++;
    }

    public Cliente atender() {
        return clientes.poll();
    }

    public boolean isEmpty() {
        return clientes.isEmpty();
    }

    public Queue<Cliente> getClientes() {
        return clientes;
    }

    public int getContador() {
        return contador;
    }
}

