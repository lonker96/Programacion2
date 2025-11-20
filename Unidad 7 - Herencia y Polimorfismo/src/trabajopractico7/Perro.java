/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico7;

/**
 *
 * @author lucas
 */
public class Perro extends Animal{
    public Perro() {
        super("Canis familiaris");
    }

    // Sobreescribe hacerSonido()
    @Override 
    public void hacerSonido() {
        System.out.println("Guau! Guau!");
    }
}
