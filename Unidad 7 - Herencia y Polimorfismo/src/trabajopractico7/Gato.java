/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico7;

/**
 *
 * @author lucas
 */
public class Gato extends Animal{
    public Gato() {
        super("Felis catus");
    }

    // Sobreescribe hacerSonido()
    @Override 
    public void hacerSonido() {
        System.out.println("Miau.");
    }
}
