/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5;

/**
 *
 * @author lucas
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre; //Composicion
    private Propietario propietario; //Asociacion bidireccional
    
    public Computadora(String marca,String numero, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numero;
        this.placaMadre = new PlacaMadre(modelo,chipset); //Composicion
    }
    
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if(propietario != null && propietario.getCompu() != this){
            propietario.setCompu(this);
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public Propietario getPropietario() {
        return propietario;
    }
    
    
    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", numeroSerie=" + numeroSerie + 
                ", placaMadre={" + placaMadre.getModelo() +','+placaMadre.getChipset() +
                "} Propietario={"+ propietario.getNombre() +','+propietario.getDni() + "}}";
    }
    
}