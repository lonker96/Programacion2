/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico7;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author lucas
 */
public class DemoFiguras {
    public static void main(String[] args) {
        System.out.println("\n--- 2. Figuras Geometricas y Polimorfismo ---"); 
        
        List<Figura> figuras = new ArrayList<>();   // Crear una lista de Figuras
        figuras.add(new Circulo(4.0)); // Upcasting (Generalizacion)
        figuras.add(new Rectangulo(5.0, 8.0));
        figuras.add(new Circulo(2.5));

        for (Figura figura : figuras) {
            double area = figura.calcularArea();
            System.out.printf("%s (Area): %.2f\n", figura.getNombre(), area);
        }
    }
}
