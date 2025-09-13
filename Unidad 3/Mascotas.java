/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad3;

/**
 *
 * @author lucas
 */
public class Mascotas {
    private String nombre;
    private String especie;
    private int edad;
    
    public String getNombre(){    
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Metodos requeridos
    //mostrarInfo(), cumplirAnios().
    public void cumplirAnios(int puntos){
        if (puntos > 0){
            if(puntos > edad){
                setEdad(puntos);
                System.out.println("Feliz Cumpleanios " + nombre +", tu edad ahora es: " + edad);
            }else{
                System.out.println("ERROR.. los anios cumplidos por " + nombre + " deben ser mayores a los que ya tiene");
            }  
        }else{
            System.out.println("ERROR!.. La cantidad de anios ingresada no es posible..\n ingrese cuantos anios cumplio " + nombre);
        }
    }
    public void mostrarInfo() {
        System.out.println("El nombre de la mascota: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " anios");
    }
}
