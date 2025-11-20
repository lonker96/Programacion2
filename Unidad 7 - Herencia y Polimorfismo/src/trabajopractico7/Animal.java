/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico7;

/**
 *
 * @author lucas
 */
public class Animal {
    private String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido generico.");
    }

    public void describirAnimal() {
        System.out.println("Soy un animal de la especie: " + especie);
    }
}
