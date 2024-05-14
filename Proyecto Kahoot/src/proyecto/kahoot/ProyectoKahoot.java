/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.kahoot;

import controlador.Controlador;
import modelo.Modelo;
import vista.PantallaCarga;

/**
 *
 * @author Bryam
 */
public class ProyectoKahoot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
PantallaCarga viewCar = new PantallaCarga();
       MenuPrincipal view = new MenuPrincipal();
       Nivel1 viewNiUno = new Nivel1();
       Nivel2 viewNiDos = new Nivel2();
       Nivel3 viewNiTres = new Nivel3();
       Nivel4 viewNiCuatro = new Nivel4();
       Nivel5 viewNiCinco = new Nivel5();
       Modelo mod = new Modelo();
       Controlador cont = new Controlador (viewCar, view, mod, viewNiUno, viewNiDos,
       viewNiTres, viewNiCuatro, viewNiCinco);
       cont.InicioCarga();
       cont.inicio();
       viewCar.setVisible(true);
       try{
           for(int i=0; i<=100; i++){
               Thread.sleep(20);
               viewCar.PB_carga.setValue(i);
               viewCar.JL_progreso.setText("Cargando..." + (Integer.toString(i)+"%"));
               if(i == 100){
                   viewCar.setVisible(false);
                   view.setVisible(true);
               }
           }
       }catch(Exception e){}
    
}
