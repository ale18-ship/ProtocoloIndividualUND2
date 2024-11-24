/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO2taller1;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();
        System.out.println("Detalles de la cuenta por defecto:");
        cuenta1.mostrarDetalles();

        System.out.println();

        CuentaBancaria cuenta2 = new CuentaBancaria("12345678", "Corriente");
        System.out.println("Detalles de la cuenta parametrizada (2 parámetros):");
        cuenta2.mostrarDetalles();

        System.out.println();

        CuentaBancaria cuenta3 = new CuentaBancaria("87654321", 1500.75, "Ahorro");
        System.out.println("Detalles de la cuenta sobrecargada (3 parámetros):");
        cuenta3.mostrarDetalles();
    }
}
