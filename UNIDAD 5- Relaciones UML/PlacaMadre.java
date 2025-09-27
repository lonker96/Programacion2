/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5;

/**
 *
 * @author lucas
 */
public class PlacaMadre {               //Clase Placa madre normal
        private String modelo;
        private String chipset;
        
    public PlacaMadre(String modelo,String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }
    
    public String getModelo() {
        return modelo;
    }
    public String getChipset() {
       return chipset;
    }
}