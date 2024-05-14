/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.HistorialNavegacion;
import vista.Vista;

/**
 *
 * @author Bryam
 */
public class Controlador implements ActionListener{
    private HistorialNavegacion model;
    private Vista view;

    public Controlador(HistorialNavegacion model, Vista view) {
        this.model = model;
        this.view = view;
        this.view.JB_atras.addActionListener(this);
        this.view.JB_avanzar.addActionListener(this);
        this.view.JB_buscar.addActionListener(this);
    }
    
    public void iniciar(){
        view.setTitle("Historial de navegacion");
        view.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == view.JB_buscar){
            String pagina = view.JTF_pag.getText();
            model.visitarPagina(pagina);
            model.actualizarPagina(model.mostrar());
            view.JL_resPag.setText(pagina);
        }
        if(e.getSource() == view.JB_atras){
            model.atras();
        }else if(e.getSource() == view.JB_avanzar){
            model.adelante();
        }
        
    }
}
