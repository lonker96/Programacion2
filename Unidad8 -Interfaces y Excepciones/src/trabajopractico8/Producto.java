/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico8;

/**
 *
 * @author lucas
 */
public class Producto implements Pagable{
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Implementacion del contrato Pagable
    @Override
    public double calcularTotal() {
        return this.precio;
    }

    @Override
    public String toString() {
        return nombre + " ($" + precio + ")";
    }
}
