/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.DobleEnlazada;
import modelo.Pila;
import vista.Vista;

/**
 *
 * @author Bryam
 */
public class Controlador implements ActionListener{
    private final Vista vista;
    private final Pila pila;
    private final DobleEnlazada lista;

    public Controlador(Vista vista) {
        this.vista = vista;
        this.pila = new Pila();
        this.lista = new DobleEnlazada();
        this.vista.JB_IngresarVariable.addActionListener(this);
        this.vista.JB_AgregarAmbitos.addActionListener(this);
        this.vista.JB_EliminarAmbito.addActionListener(this);
        vista.setControlador(this);
    }

    public void ingresarVariable(String nombreVariable, int tamaño) {
        String mensaje = " Variable Ingresada: " + nombreVariable + " (Con tamaño " + tamaño + ")\n";
        pila.push(mensaje); 
        lista.insertarAlFinal(mensaje);
        mostrarMensajeVariable(mensaje);
    }
    
    public void entrarAlAmbito() {
        String mensaje = "Entrando al ambito\n";
        pila.push(mensaje); 
        lista.insertarAlFinal(mensaje);
        mostrarMensajeVariable(mensaje);
    }
    
    public void limpiarMemoria() {
        String mensaje = "Limpiando memoria\n";
        pila.push(mensaje); 
        lista.insertarAlFinal(mensaje);
        mostrarMensajeVariable(mensaje);
    }
    
    public void mostrarMensajeVariable(String mensaje) {
        String textoActual = vista.JL_Mostrar.getText();
        String nuevoTexto = textoActual.isEmpty() ? mensaje : textoActual + "\n" + mensaje;
        vista.JL_Mostrar.setText(nuevoTexto);
    }
    
    public void mostrarVariables(String variables) {
        String textoActual = vista.JL_Mostrar.getText();
        String nuevoTexto = textoActual.isEmpty() ? variables : textoActual + "\n" + variables;
        vista.JL_Mostrar.setText(nuevoTexto);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == vista.JB_IngresarVariable){
        String nombreVariable = vista.JTF_Variable.getText();
        int tamaño = Integer.parseInt(vista.JTF_TamanoVariable.getText());
        ingresarVariable(nombreVariable, tamaño);
        }
        if(e.getSource() == vista.JB_AgregarAmbitos){
            entrarAlAmbito();
        }
        if(e.getSource() == vista.JB_EliminarAmbito){
            limpiarMemoria();
        }
    }
}
