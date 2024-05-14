/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author FAMILIA
 */
public class Modelo {
    private int segundos = 12;
    private int correctas = 0;
    private int index;
    private int resultado;

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    private int total_Preguntas;

    public int getTotal_Preguntas() {
        return total_Preguntas;
    }

    public void setTotal_Preguntas(int total_Preguntas) {
        this.total_Preguntas = total_Preguntas;
    }
    private char respuesta;
    String[]preguntas = {
        "¿Como se dice manzana?",
        "¿Como se dice balon?",
        "¿Como se dice niño?",
        "¿Como se dice agua?",
        "¿Como se dice cielo?",
    };
    
    String[][]opciones = {
        {"Apple", "Pineapple", "Strawberry", "Orange"},
        {"Balloon", "Ball", "Globe", "Sphere"},
        {"She", "Children", "Kid", "Guy"},
        {"Sea", "Rain", "Cold", "Water"},
        {"Sky", "Heaven", "Puta", "Water"},
    };
    
    char[]respuestas = {
        'A',
        'B',
        'C',
        'D',
        'A',
    };

    public String[] getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(String[] preguntas) {
        this.preguntas = preguntas;
    }

    public String[][] getOpciones() {
        return opciones;
    }

    public void setOpciones(String[][] opciones) {
        this.opciones = opciones;
    }

    public char[] getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(char[] respuestas) {
        this.respuestas = respuestas;
    }

    public char getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(char respuesta) {
        this.respuesta = respuesta;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getCorrectas() {
        return correctas;
    }

    public void setCorrectas(int correctas) {
        this.correctas = correctas;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    public void CorrectasAcu(){
        this.correctas++;
    }
    
    public void IndexAcu(){
        this.index++;
    }
    
    public int TotalPreguntas(){
        this.total_Preguntas = this.preguntas.length;
        return this.total_Preguntas;
    }
}
