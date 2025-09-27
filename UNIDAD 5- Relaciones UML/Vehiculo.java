/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5;

/**
 *
 * @author lucas
 */
public class Vehiculo {
    private String patent;
    private String modelo;
    private Motor motor;   //Agregacion
    private Conductor conductor;  //Asociacion bidireccional

    public Vehiculo(String patent, String modelo, Motor motor) {
        this.patent = patent;
        this.modelo = modelo;
        this.motor = motor;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if(conductor != null && conductor.getVehiculo() != this){
            conductor.setVehiculo(this);
        }
    }
    
    public String getPatent() {
        return patent;
    }

    public void setPatent(String patent) {
        this.patent = patent;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patent=" + patent + ", modelo=" + modelo + ", "
                + "motor= {" + motor.getTipo()+','+motor.getNumeroSerie() 
                + "}, Conductor={" + conductor.getNombre() + ',' + conductor.getLicencia() + "}}";
    }
    
    
}
