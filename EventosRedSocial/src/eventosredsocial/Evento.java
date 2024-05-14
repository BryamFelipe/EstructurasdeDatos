/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventosredsocial;

/**
 *
 * @author Bryam
 */
public class Evento {
    private int id;
    private String tipoEvento;
    private int idUsuario;
    private String fechaHora;
    private String contenido;

    public Evento(int id, String tipoEvento, int idUsuario, String fechaHora, String contenido) {
        this.id = id;
        this.tipoEvento = tipoEvento;
        this.idUsuario = idUsuario;
        this.fechaHora = fechaHora;
        this.contenido = contenido;
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    @Override
    public String toString() {
        return "Evento{" +
                "Tipo_Evento='" + tipoEvento + '\'' +
                ", idEvento=" + id + '\'' +
                ", idUsuario=" + idUsuario + '\'' +
                ", fecha=" + fechaHora + '\'' +
                ", contenido=" + contenido + '\'' +
                '}';
    }
    
}
