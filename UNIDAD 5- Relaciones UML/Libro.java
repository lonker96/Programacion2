/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5;

/**
 *
 * @author lucas
 */
public class Libro {  //Clase Libro con Agregacion y Asociacion Unidireccional.
    private String titulo;
    private String isbn;
    private Autor autor;  //Asociacion Unidireccional
    private Editorial editorial; //Agregacion
 
    public Libro (String titulo, String isbn, Editorial editorial){ //Agregando el objeto Editorial en le construcctor para realizar la agregacion.
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
 }
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) { //Asociacion Unidireccional.
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "Titulo=" + titulo + ", isbn=" + isbn + ", Autor= " + autor +" Editorial= "+editorial+ '}';
    }
    
}