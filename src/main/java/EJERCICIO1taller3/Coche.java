/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO1taller3;

/**
 *
 * @author asd
 */
public class Coche {
    private String marca;
    private String modelo;    
    
private static int contadorCoches = 0;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++; // Incrementa el contador cada vez que se crea un coche        
    }

    public void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }

    public static void mostrarTotalCoches() {
        System.out.println("Total de coches creados: " + contadorCoches);
    }
}
