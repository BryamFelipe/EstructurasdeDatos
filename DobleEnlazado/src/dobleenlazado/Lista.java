/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dobleenlazado;

/**
 *
 * @author Bryam
 */
public class Lista {
    Nodo primerNodo;
    Nodo ultimoNodo;
    
    public Lista(){
        primerNodo = null;
        ultimoNodo = null;
    }
    
    public void agregarAlInicio(Estudiante estudiante){
        Nodo nuevoNodo = new Nodo(estudiante);
        if(primerNodo == null){
            primerNodo = nuevoNodo;
            ultimoNodo = nuevoNodo;
        }else{
            nuevoNodo.setSiguiente(primerNodo);
            primerNodo.setAnterior(nuevoNodo);
            primerNodo = nuevoNodo;
        }
    }
    
    public void agregarAlFinal(Estudiante estudiante){
        Nodo nuevoNodo = new Nodo(estudiante);
        if(primerNodo == null){
            primerNodo = nuevoNodo;
            ultimoNodo = nuevoNodo;
        }else{
            ultimoNodo.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(ultimoNodo);
            ultimoNodo = nuevoNodo;
        }
    }
    
    public void eliminarAlFinal(){
       if (ultimoNodo != null) {
            ultimoNodo = ultimoNodo.anterior;
            if (ultimoNodo != null) {
                ultimoNodo.siguiente = null;
            } else{
                primerNodo= null;
            }
       }    
    }
    
    public void eliminarAlInicio() {
        if (primerNodo != null) {
            primerNodo = primerNodo.siguiente;
            if (primerNodo != null) {
                primerNodo.anterior = null;
            } else {
                primerNodo = null;
            }
        }
    }
    
    public void mostrarEstudiantes() {
        Nodo actual = primerNodo;
        while (actual != null) {
            System.out.println(actual.getEstudiante());
            actual = actual.siguiente;
        }
    }
}
