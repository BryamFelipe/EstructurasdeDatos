/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Bryam
 */
public class Libro {
    String Titulo;
    String autor;
    int disCopias;

    public Libro(String Titulo, String autor, int disCopias) {
        this.Titulo = Titulo;
        this.autor = autor;
        this.disCopias = disCopias;
    }
    
    @Override
    public String toString() {
        return "Título: " + Titulo + ", Autor: " + autor + ", Copias disponibles: " + disCopias;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDisCopias() {
        return disCopias;
    }

    public void setDisCopias(int disCopias) {
        this.disCopias = disCopias;
    }
    
    
}
