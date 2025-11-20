/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico7;

/**
 *
 * @author lucas
 */
public class Auto extends Vehiculo {
    private int cantidadPuertas;

    // Constructor que usa el metodo super() para importar los atributos de la superclase
    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    // Se sobreescribre el metodo mostrar info de la super clase
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); 
        System.out.println("  Auto: Puertas=" + cantidadPuertas);
    }

    public static void main(String[] args) {
        System.out.println("--- 1. Vehiculos y Herencia ---");
        Auto miAuto = new Auto("Fiat", "Cronos", 4); // Instanciar un auto
        miAuto.mostrarInfo();
    }
}
