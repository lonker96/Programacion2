/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico7;

/**
 *
 * @author lucas
 */
public abstract class Figura {   //Se usa abstract para definir la estructura base
    private String nombre;

    // Constructor que van a utilizar las sub clases
    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Metodo abstracto, declara el comportamiento que debe implementarse
    public abstract double calcularArea();
}
