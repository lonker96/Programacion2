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
public class DemoAnimales {
    public static void main(String[] args) {
        System.out.println("\n--- 4. Animales y Comportamiento Sobrescrito ---");

        // Crear lista de animales
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro());
        animales.add(new Gato());
        animales.add(new Perro());

        // Tarea: Mostrar sus sonidos con polimorfismo
        for (Animal animal : animales) {
            animal.describirAnimal();
            // Polimorfismo: el mismo metodo llama a implementaciones diferentes
            animal.hacerSonido(); // Uso de la sobrescritura de metodos y llamada dinamica
            System.out.println("-----");
        }
    }
}
