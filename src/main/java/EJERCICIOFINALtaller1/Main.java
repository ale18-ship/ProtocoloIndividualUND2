/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIOFINALtaller1;

import java.util.Scanner;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese los datos para un libro:");
            System.out.print("Título: ");
            String titulo = scanner.nextLine();
            System.out.print("Autor: ");
            String autor = scanner.nextLine();
            System.out.print("Número de Páginas: ");
            int numeroPaginas = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            Libro libro = new Libro(titulo, autor, numeroPaginas);
            
            System.out.println("\nIngrese los datos para una cuenta bancaria:");
            System.out.print("Número de Cuenta: ");
            String numeroCuenta = scanner.nextLine();
            System.out.print("Saldo: ");
            double saldo = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer
            System.out.print("Tipo de Cuenta: ");
            String tipoCuenta = scanner.nextLine();
            CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, saldo, tipoCuenta);
            
            System.out.println("\nIngrese los datos para un estudiante:");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            System.out.print("Curso: ");
            String curso = scanner.nextLine();
            Estudiante estudiante = new Estudiante(nombre, edad, curso);
            
            System.out.println("\nDetalles del libro:");
            System.out.println(libro);
            
            System.out.println("\nDetalles de la cuenta bancaria:");
            System.out.println(cuenta);
            
            System.out.println("\nDetalles del estudiante:");
            System.out.println(estudiante);
        }
    } 
}
