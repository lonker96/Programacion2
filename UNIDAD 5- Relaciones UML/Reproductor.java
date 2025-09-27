/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5;

/**
 *
 * @author lucas
 */
public class Reproductor {
    private boolean encendido;

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public boolean isEncendido() {
        return encendido;
    }


    public void reproducir(Cancion cancion){ //Dependencia de uso, con un poquito de uso de boolean del atributo 
        if(encendido){
            System.out.println("Encendiendo reproductor..\nReproduciendo..."+cancion);
        }else{
            System.out.println("El reproductor esta apagado, encendalo para reproducir");
        }
    }
}
