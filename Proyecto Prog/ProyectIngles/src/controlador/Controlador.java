/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.MenuPrincipal;
import vista.Nivel2;
import vista.Nivel3;
import vista.Nivel4;
import vista.Nivel5;
import vista.NivelUno;
import vista.PantallaCarga;

/**
 *
 * @author FAMILIA
 */
public class Controlador implements ActionListener {
    private PantallaCarga viewCar;
    private MenuPrincipal view;
    private Modelo model;
    private NivelUno viewNiUno;
    private Nivel2 viewNiDos;
    private Nivel3 viewNiTres;
    private Nivel4 viewNiCuatro;
    private Nivel5 viewNiCinco;
    
    public Controlador(PantallaCarga viewCar, MenuPrincipal view, Modelo model,
            NivelUno viewNiUno, Nivel2 viewNiDos, Nivel3 viewNiTres, Nivel4 viewNiCuatro,
            Nivel5 viewNiCinco){
        this.model = model;
        this.viewCar = viewCar;
        this.view = view;
        this.viewNiUno = viewNiUno;
        this.viewNiDos = viewNiDos;
        this.viewNiTres = viewNiTres;
        this.viewNiCuatro = viewNiCuatro;
        this.viewNiCinco = viewNiCinco;
        this.view.JB_salir.addActionListener(this);
        this.view.JCB_niveles.addActionListener(this);
        this.viewNiUno.JB_opc1.addActionListener(this);
        this.viewNiUno.JB_opc2.addActionListener(this);
        this.viewNiUno.JB_opc3.addActionListener(this);
        this.viewNiUno.JB_opc4.addActionListener(this);
        this.viewNiDos.JB_opc1.addActionListener(this);
        this.viewNiTres.JB_opc2.addActionListener(this);
        this.viewNiCuatro.JB_opc3.addActionListener(this);
        this.viewNiCinco.JB_opc4.addActionListener(this);
    }
    public void InicioCarga(){
        this.viewCar.setLocationRelativeTo(null);
    }
    public void inicio(){
        view.setTitle("Kahoot");  
        this.view.setLocationRelativeTo(null);
    }
    
    
    public void actionPerformed (ActionEvent e){
        if(e.getSource() == view.JB_salir){
            System.exit(0);
        }
        if(view.JCB_niveles.getSelectedItem()== "1"){
            this.viewNiUno.setLocationRelativeTo(null);
            viewNiUno.setVisible(true);
            view.setVisible(false);
        }
        
        if(view.JCB_niveles.getSelectedItem()== "2"){
            this.viewNiDos.setLocationRelativeTo(null);
            viewNiDos.setVisible(true);
            view.setVisible(false);
        }
        
        if(view.JCB_niveles.getSelectedItem()== "3"){
            this.viewNiTres.setLocationRelativeTo(null);
            viewNiTres.setVisible(true);
            view.setVisible(false);
        }
        
        if(view.JCB_niveles.getSelectedItem()== "4"){
            this.viewNiCuatro.setLocationRelativeTo(null);
            viewNiCuatro.setVisible(true);
            view.setVisible(false);
        }
        
        if(view.JCB_niveles.getSelectedItem()== "5"){
            this.viewNiCinco.setLocationRelativeTo(null);
            viewNiCinco.setVisible(true);
            view.setVisible(false);
        }
    }
}
