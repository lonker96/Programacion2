/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Clase_Autor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author lucas
 */
public class Biblioteca{
    private String nombre;
    private List<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarLibro(String isbn, String titulo,int anioPublicacion, Autor autor){
        libros.add(new Libro(isbn,titulo,anioPublicacion,autor));
    }
    
    public void listarLibros(){
        if(!libros.isEmpty()){
            for(Libro libro: libros){
                libro.mostrarInfo();
            }
        }else{System.out.println("La Biblioteca esta vacia..");}
    }
    
    private Libro buscarPorIsbn(String isbn){
        for(Libro libro : libros){
            if(libro.getIsbn().equalsIgnoreCase(isbn)){
            return libro;}
        }//Si no encuentra un isbn identico en la biblioteca devuelve null
        return null;
        }
    
    public void buscarLibroPorIsbn(String isbn){
        System.out.println("\nBuscando el libro con el isbn: "+isbn);
        Libro libro = buscarPorIsbn(isbn);
        if(libro != null){
            System.out.println("Libro encontrado!, el libro con el isbn "+isbn+" es: ");
            libro.mostrarInfo();
        }else{System.out.println("Libro no encontrado, no se registra ningun libro con el isbn "+isbn);}
    }
    
    public void eliminarLibro(String isbn){
        System.out.println("\nBuscando el libro con el isbn ("+isbn+") para eliminar....");
        Libro libro = buscarPorIsbn(isbn);
        if(libro != null){
            System.out.println("Libro encontrado, eliminando...");
            System.out.println("Libro: "+libro+" Eliminado");
            libros.remove(libro);
        }else{System.out.println("El libro con el isbn "+isbn+" No existe en la biblioteca");}
    }
    
    public void obtenerCantidadLibros(){
        int cont = 0;
        for(Libro libro: libros){
            cont++;
        }
        System.out.println("\nLa cantidad de libros que tiene la biblioteca es: "+cont);
    }
    
    public void filtrarLibrosPorAnio(int anio){  
        if(anio > 0 ){
            for(Libro libro: libros){
                if(libro.getAnioPublicacion() == anio){libro.mostrarInfo();}
            }
        }else{System.out.println("\nEl anio ingresado es invalido, no se pueden buscar anios negativos.");}
    }
    
    public void mostrarAutoresDisponibles(){
       Set<String>id_autor = new HashSet<>();
        System.out.println("\nMostramos los autores con libros disponibles en la biblioteca..");
        for(Libro libro : libros){
            Autor autor = libro.getAutor();
            if(id_autor.add(autor.getId())){  //Solo agrega si es nuevo, al agregar devuelve TRUE.
                autor.mostrarInfo();     //Utilizo ese TRUE para mostrar la info del autor agregado

            }
        }
    }   
    
}