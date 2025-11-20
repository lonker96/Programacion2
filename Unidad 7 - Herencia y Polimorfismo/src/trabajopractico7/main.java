/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico7;

/**
 *
 * @author lucas
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // --- 1. Vehículos y Herencia ---
        System.out.println("\n--- 1. Vehiculos y Herencia (Auto) ---");
        Auto miAuto = new Auto("Fiat", "Cronos", 4);
        miAuto.mostrarInfo(); 

        // --- 2. Figuras Geometricas (Llamando al main de DemoFiguras) ---
        DemoFiguras.main(args); 

        // --- 3. Empleados y Polimorfismo (Llamando al main de DemoEmpleados) ---
        DemoEmpleados.main(args);
        
        // --- 4. Animales y Comportamiento (Llamando al main de DemoAnimales) ---
        DemoAnimales.main(args);
    }
    
}
