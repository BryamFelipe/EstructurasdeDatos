/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eventosredsocial;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Bryam
 */
public class EventosRedSocial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        SecuenciaEventos listado = new SecuenciaEventos();

        int opcion;
        
        do {
            System.out.println("\nBienvenido a la Red");
            System.out.println("1. Desea agregar un evento");
            System.out.println("2. Desea eliminar evento");
            System.out.println("3. Desea buscar algun evento en especifico");
            System.out.println("4. Listar eventos");
            System.out.println("5. Salir");
            System.out.println("Por favor seleccione una opcion: ");
            opcion = leer.nextInt();
            leer.nextLine();
            
            switch(opcion){
                case 1:
                    System.out.println("Ingrese los datos para el evento");
                    System.out.println("Ingrese el tipo de evento: ");
                    String tipoEvento=leer.nextLine();
                    System.out.println("Ingrese la ID del evento: ");
                    int id=leer.nextInt();
                    System.out.println("ingrese el ID del usuario: ");
                    int idUsuario=leer.nextInt();
                    System.out.println("ingrese la fecha y hora del evento: ");
                    String fechaHora=leer.nextLine();
                    System.out.println("ingrese una descripcion del evento: ");
                    String contenido=leer.nextLine();
                    listado.agregarEvento(new Evento(id, tipoEvento, idUsuario, fechaHora, contenido));
                    break;
               
                case 2:
                    System.out.println("Ingrese la ID del evento que desea eliminar: ");
                    int idEvento=leer.nextInt();
                    leer.nextLine();
                    listado.eliminarEvento(idEvento);
                    System.out.println("Evento eliminado.....: ");
                    break;
                case 3:
                    System.out.println("Ingrese la ID del evento que buscar: ");
                    String tipoEvent=leer.nextLine();
                    System.out.println("Ingrese la ID del usuario que buscar: ");
                    int idUser=leer.nextInt();
                    List<Evento>eventosEncontrados = listado.buscarEventos(tipoEvent, idUser);;

                    break;
                case 4:
                    System.out.println("Mostrando..........");
                    
                    break;
                case 5:
                    System.out.println("Saliendo........");
                default:
                    System.out.println("Opción no valida. Inténtelo de nuevo.");
                    break;    
            }
        }while(opcion !=5);
         leer.close();

    }   
    
}












//import java.util.ArrayList;
//import java.util.List;

//public class Main {
    //public static void main(String[] args) {
      //  SecuenciaEventos secuenciaEventos = new SecuenciaEventos();

        // Agregar eventos
        //secuenciaEventos.agregarEvento(new Evento(1, "Tipo 1", 1, "Contenido 1", LocalDateTime.now()));
        //secuenciaEventos.agregarEvento(new Evento(2, "Tipo 2", 2, "Contenido 2", LocalDateTime.now().plusHours(1)));
        //secuenciaEventos.agregarEvento(new Evento(3, "Tipo 3", 1, "Contenido 3", LocalDateTime.now().plusHours(2)));

        // Listar eventos
        //secuenciaEventos.listarEventos(null, -1);

        // Buscar eventos
        //List<Evento> eventosEncontrados = secuenciaEventos.buscarEventos("Tipo 1", 1);
        //System.out.println("Eventos encontrados:");
        //for (Evento evento : eventosEncontrados) {
          //  System.out.println(evento.getFechaHora() + " - " + evento.getTipoEvento() + " - " + evento.getIdUsuario() + ": " + evento.getContenido());
       // }

        // Eliminar evento
        //secuenciaEventos.eliminarEvento(2);

        // Listar eventos nuevamente
        //secuenciaEventos.listarEventos(null, -1);
    //}
//}