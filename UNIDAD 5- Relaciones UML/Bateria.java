/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5;

/**
 *
 * @author lucas
 */
public class Bateria {  //Clase bateria sesilla.
    private String modelo;
    private String capacidad;
    
    public Bateria (String modelo,String capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }


    @Override
    public String toString() {
        return "{" + "modelo= " + modelo + ", capacidad= " + capacidad + '}';
    }
    
}