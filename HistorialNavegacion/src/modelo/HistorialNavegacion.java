/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


/**
 *
 * @author Bryam
 */
public class HistorialNavegacion {
     PaginaWeb top;
     PaginaWeb temporal;
     int size;

    public HistorialNavegacion() {
        top = null;
        size = 0;
    }
    
    public boolean estaVacia(){
        return top == null;
    }
    
    public int obtenerTamaño(){
        return size;
    }
    
    public void visitarPagina(String pagina){
        PaginaWeb nuevoNodo = new PaginaWeb(pagina);
        if(top == null){
            top = nuevoNodo;
        }else{
            nuevoNodo.siguiente = top;
            top = nuevoNodo;
        }
        size++;
    }
    
    public void atras(){
        if(estaVacia()){
            System.out.println("La lista esta vacia");
        }else if(temporal.atras != null){
            temporal = temporal.atras;
        }
    }
    
    public void adelante(){
        if(estaVacia()){
            System.out.println("La lista esta vacia");
        }else if(temporal.siguiente != null){
            temporal = temporal.siguiente;
        }
    }
    
    public String mostrar() {
        return temporal.pagina;
    }
    
    public void actualizarPagina(String pagina){
        temporal.setPagina(pagina);
    }
}
