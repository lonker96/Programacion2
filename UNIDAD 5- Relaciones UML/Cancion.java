package trabajopractico5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucas
 */
public class Cancion {
    private String titulo;
    private Artista artista; //Asociacion unidireccional
    
    public Cancion(String titulo,Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + 
                ", Artista= " + artista.getNombre() +','+artista.getGenero()+'}';
    }
    
}
