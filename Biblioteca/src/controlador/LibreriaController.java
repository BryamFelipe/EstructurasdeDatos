/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.Scanner;
import modelo.Libro;
import modelo.ListaEnlazada;
import vista.LibreriaView;

/**
 *
 * @author Bryam
 */
public class LibreriaController {
    private ListaEnlazada model;
    private LibreriaView view;

    public LibreriaController(ListaEnlazada model, LibreriaView view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            view.displayMessage("1. Agregar libro");
            view.displayMessage("2. Eliminar libro");
            view.displayMessage("3. Actualizar libro");
            view.displayMessage("4. Mostrar libros");
            view.displayMessage("5. Salir");

            int option = scanner.nextInt();

            if (option == 1) {
                view.displayMessage("Ingrese el título del libro:");
                String titulo = scanner.next();
                view.displayMessage("Ingrese el autor del libro:");
                String autor = scanner.next();
                view.displayMessage("Ingrese el número de copias disponibles:");
                int copias = scanner.nextInt();

                Libro libro = new Libro(titulo, autor, copias);
                model.agregarLibro(libro);
            }
            else if (option == 2) {
                view.displayMessage("Ingrese el título del libro:");
                String titulo = scanner.next();
                view.displayMessage("Ingrese el autor del libro:");
                String autor = scanner.next();

                Libro libro = new Libro(titulo, autor, 0);
                model.removerLibro(libro);
            }
            else if (option == 3) {
                view.displayMessage("Ingrese el título del libro:");
                String titulo = scanner.next();
                view.displayMessage("Ingrese el autor del libro:");
                String autor = scanner.next();
                view.displayMessage("Ingrese el nuevo título del libro:");
                String newTitulo = scanner.next();
                view.displayMessage("Ingrese el nuevo autor del libro:");
                String newAutor = scanner.next();
                view.displayMessage("Ingrese el número de copias disponibles:");
                int copias = scanner.nextInt();

                Libro olLibro = new Libro(titulo, autor, 0);
                Libro newLibro = new Libro(newTitulo, newAutor, copias);

                model.updateLibro(olLibro,newLibro);
            }
            else if (option == 4) {
                view.mostrarLibros(model);
            }
            else if (option == 5) {
                view.displayMessage("Saliendo...");
                break;
            }
            else {
                view.displayMessage("Opción inválida.");
            }
        }

        scanner.close();
    }    
}
