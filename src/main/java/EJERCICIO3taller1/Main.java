/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO3taller1;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        System.out.println("Detalles del estudiante por defecto:");
        estudiante1.mostrarDetalles();

        System.out.println();

        Estudiante estudiante2 = new Estudiante("María", 20);
        System.out.println("Detalles del estudiante con nombre y edad:");
        estudiante2.mostrarDetalles();

        System.out.println();

        Estudiante estudiante3 = new Estudiante("Carlos", 22, "Matemáticas");
        System.out.println("Detalles del estudiante con todos los parámetros:");
        estudiante3.mostrarDetalles();
    }
    
}
