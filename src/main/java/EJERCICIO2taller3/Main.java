/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO2taller3;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Suma: " + Matematicas.suma(a, b));
        System.out.println("Resta: " + Matematicas.resta(a, b));
        System.out.println("Multiplicación: " + Matematicas.multiplicacion(a, b));
        System.out.println("División: " + Matematicas.division(a, b));

        int c = 0;
        System.out.println("División por cero: " + Matematicas.division(a, c));
    }
    
}
