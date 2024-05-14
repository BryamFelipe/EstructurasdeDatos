/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duplicados;

/**
 *
 * @author Bryam
 */
public class Lista {
    public Nodo cabeza;
    
    public Lista(){
        cabeza=null;
    }
    
    public void agregarValor(String Valor) {
        if (cabeza == null) {
            cabeza = new Nodo(Valor);
        } else {
            Nodo temp = cabeza;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(new Nodo(Valor));
        }
        System.out.println("Tarea agregada correctamente.");
    }
    
    public void MostrarDatos() {
        Nodo temp = cabeza;
        System.out.println("----- Lista de tareas -----");
        while (temp != null) {
            System.out.println(temp.getValor());
            temp = temp.getSiguiente();
        }
    }
    
    public void removerDuplicados() {
        Nodo actual = cabeza;
        while (actual != null && actual.getSiguiente() != null) {
            if (actual.getValor().equals(actual.getSiguiente().getValor())){
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
            } else {
                actual = actual.getSiguiente();
            }
        }
    }    
}
