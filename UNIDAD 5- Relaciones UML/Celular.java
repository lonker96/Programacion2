/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5;

/**
 *
 * @author lucas
 */
public class Celular { 
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria; // Agregacion.
    private Usuario usuario; //Asociacion bidireccional
    
    public Celular(String imei,String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;  //Agregacion
 }
    
    public void setUsuario(Usuario usuario){ //Asociacion bidireccional verificando si el usuario dado es el actual sino lo agrega.
        this.usuario = usuario;
        if(usuario != null && usuario.getCelular() != this){ //Llama a getCelular para revisar que este celular este sincronizado con el usuario.
            usuario.setCelular(this);  //En caso de que no, lo sincroniza.
        }
    }
    
    public Usuario getUsuario(){
        return usuario;
    }
    
    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }
    
    @Override
    public String toString() {
        return "Celular{" + "imei=" + imei + ", marca=" + marca + ", modelo=" + modelo + 
                ", Bateria=" + bateria + 
                " Usuario= {"+"Nombre= "+usuario.getNombre()+", DNI= "+usuario.getDni()+'}';
    }
    
    
}
