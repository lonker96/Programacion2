/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5;

/**
 *
 * @author lucas
 */
public class Usuario {  
    private String nombre;
    private String dni;
    private Celular celular; //Asociacion bidirecional

    public Usuario(String nombre, String dni) { //Constructor 
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public void setCelular(Celular celular){ //Setter de la asociacion bidireccional a celular
        this.celular = celular;
        if(celular != null && celular.getUsuario() != this){
            celular.setUsuario(this);
        }
    }
    public Celular getCelular(){
        return celular;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() { //To String con los datos tambien del celular.
        
        return "Usuario={" + "nombre=" + nombre + ", dni=" + dni + 
               ", celular={imei= " + celular.getImei() + ", Marca= "+celular.getMarca()+", Modelo= "+celular.getModelo()+ '}';
    }
    
    
}
