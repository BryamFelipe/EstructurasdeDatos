/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cinedigital;

import java.util.Scanner;

/**
 *
 * @author Bryam
 */
public class CineDigital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        int cartelera = 0;
        int sala = 0;
        
        System.out.print("Bienveniedo a CineCalidad\n");
        System.out.print("Por favor seleccione la pelicula que desea ver\n");
        System.out.print("1.SpiderMan Across\n"
                + "2.Interestelar\n"
                + "3.Ready Player One");
        
        cartelera= sc.nextInt();
        if(cartelera== 1){
            System.out.print("1. 9:30a.m\n"
                    + "2. 3:30p.m\n"
                    + "3. 7:20p.m\n");
            if(sala == 1){
                System.out.print("Sala numero 4");
            }else(sala == 2){
            
        }
        }
        
        
    }
    
}
