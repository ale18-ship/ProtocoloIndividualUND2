/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERICICIO1taller1;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        System.out.println("Detalles del libro por defecto:");
        libro1.mostrarDetalles();

        System.out.println();

        Libro libro2 = new Libro("El Principito", "Antoine de Saint-Exupéry", 96);
        System.out.println("Detalles del libro parametrizado:");
        libro2.mostrarDetalles();
    }
    
}
