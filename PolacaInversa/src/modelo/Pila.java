/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Bryam
 */
public class Pila {
    Nodo top;
    int size;

    public Pila(){
        top = null;
        size = 0;
    }
    
    public boolean estaVacia(){
        return top == null;
    }
    
    public int obtenerTamaño(){
        return size;
    }
    
    public void push(int dato){
        Nodo nuevoNodo = new Nodo(dato);
        if(top == null){
            top = nuevoNodo;
        }else{
        nuevoNodo.siguiente = top;
        top = nuevoNodo;
        }
        size++;
    }
    
    public int pop(){
        if(estaVacia()){
            System.out.print("La pila esta vacia");
        }
        int dato = top.dato;
        top = top.siguiente;
        size--;
        return dato;
    }
}
