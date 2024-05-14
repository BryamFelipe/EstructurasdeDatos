/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duplicados;

/**
 *
 * @author Bryam
 */
public class Nodo {
    String Valor;
    Nodo siguiente;

    public Nodo(String Valor) {
        this.Valor = Valor;
        this.siguiente = null;
    }
    
    public String getValor() {
        return Valor;
    }

    public void setValor(String Valor) {
        this.Valor = Valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
