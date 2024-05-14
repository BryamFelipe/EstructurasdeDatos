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
    PilaNodo top;
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
    
    public void push(char dato){
        PilaNodo nuevoNodo = new PilaNodo(dato);
        if(top == null){
            top = nuevoNodo;
        }else{
        nuevoNodo.siguiente = top;
        top = nuevoNodo;
        }
        size++;
    }
    
    public char pop(){
        if(estaVacia()){
            System.out.print("La pila esta vacia");
        }
        char dato = top.dato;
        top = top.siguiente;
        size--;
        return dato;
    }
    
    public static boolean Balancear(String cadena){
        Pila pila = new Pila();
        for(char caracter : cadena.toCharArray()){
            if(caracter == '('){
                pila.push(caracter);
            }else if(caracter == ')'){
                if(pila.estaVacia()){
                    return false;
                }
                pila.pop();
            }
        }
        return pila.estaVacia();
    }
}
