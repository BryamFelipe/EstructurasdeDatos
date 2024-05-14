/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myBank.modelo;

/**
 *
 * @author Bryam
 */
public class Cuenta {
    private String Nombre;
    private String docuIden;
    private int Monto;
    
    public Cuenta(String Nombre,String docuIden,int Monto){
        this.Nombre=Nombre;
        this.docuIden=docuIden;
        this.Monto=Monto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDocuIden() {
        return docuIden;
    }

    public void setDocuIden(String docuIden) {
        this.docuIden = docuIden;
    }

    public int getMonto() {
        return Monto;
    }

    public void setMonto(int Monto) {
        this.Monto = Monto;
    }
    
    public void retirarDinero(int cantidad){
        if(cantidad <= Monto){
            Monto -= cantidad;
            System.out.println("Se ha retirado $: "+cantidad+ " de su cuenta");
        } else{
            System.out.println("Fondos insuficientes");
        }
    }
    
    public void depositarDinero(int cantidad){
        if(cantidad <= Monto){
            Monto += cantidad;
            System.out.println("Se ha depositado $: "+cantidad+ " a su cuenta");
        }
    }
}
