/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventosredsocial;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bryam
 */
public class SecuenciaEventos {
    
    private NodoEvento inicio;
    private NodoEvento fin;

    public void agregarEvento(Evento evento) {
        NodoEvento nuevo = new NodoEvento(evento);
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            NodoEvento temp = inicio;
            while (temp.getSiguiente() != null && temp.getEvento().getFechaHora().compareTo(evento.getFechaHora()) < 0) {
                temp = temp.getSiguiente();
            }
            if (temp.getEvento().getFechaHora().compareTo(evento.getFechaHora()) < 0) {
                temp.setSiguiente(nuevo);
                nuevo.setAnterior(temp);
            } else {
                temp.setAnterior(nuevo);
                nuevo.setSiguiente(temp);
                if (temp == inicio) {
                    inicio = nuevo;
                }
            }
            fin = nuevo;
        }
    }

    public void eliminarEvento(int id) {
        NodoEvento temp = inicio;
        while (temp != null) {
            if (temp.getEvento().getId() == id) {
                if (temp.getAnterior() != null) {
                    temp.getAnterior().setSiguiente(temp.getSiguiente());
                } else {
                    inicio = temp.getSiguiente();
                }
                if (temp.getSiguiente() != null) {
                    temp.getSiguiente().setAnterior(temp.getAnterior());
                } else {
                    fin = temp.getAnterior();
                }
                return;
            }
            temp = temp.getSiguiente();
        }
    }

    public List<Evento> buscarEventos(String tipoEvento, int idUsuario) {
        List<Evento> resultados = new ArrayList<>();
        NodoEvento temp = inicio;
        while (temp != null) {
            if (tipoEvento != null&& !temp.getEvento().getTipoEvento().equals(tipoEvento)) {
                temp = temp.getSiguiente();
                continue;
            }
            if (idUsuario != -1 && temp.getEvento().getIdUsuario() != idUsuario) {
                temp = temp.getSiguiente();
                continue;
            }
            resultados.add(temp.getEvento());
            temp = temp.getSiguiente();
        }
        return resultados;
    }

    public void listarEventos(String tipoEvento, int idUsuario) {
        List<Evento> eventos = buscarEventos(tipoEvento, idUsuario);
        for (Evento evento : eventos) {
            System.out.println(evento.getFechaHora() + " - " + evento.getTipoEvento() + " - " + evento.getIdUsuario() + ": " + evento.getContenido());
        }
    }
}
