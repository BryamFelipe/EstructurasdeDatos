/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegolaberinto;

/**
 *
 * @author Bryam
 */
public class Nodo {
    private String pregunta;
    private String respuesta;
    private Nodo siguiente;

    public Nodo(String pregunta, String respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.siguiente = null;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public String getPregunta() {
        return pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }
    
    public boolean checkRespuesta(String guess) {
        return respuesta.equalsIgnoreCase(guess);
    }

}
