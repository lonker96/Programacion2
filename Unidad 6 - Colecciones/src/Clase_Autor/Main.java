/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase_Autor;

/**
 *
 * @author lucas
 */
public class Main {
    /**
     * @param args the command line arguments
    */
    public static void main(String[] args) {
                        // Instanciamos una biblioteca y un autor.
        Biblioteca biblioteca1 = new Biblioteca("Alejandria");
        Autor autor1 = new Autor("id_0001","Juan","Mexico");
        Autor autor2 = new Autor("id_0002","Ana","Argentina");
        Autor autor3 = new Autor("id_0003","Ramon","Chile");
                        // Agregar tres libros falsos en la biblioteca.
        biblioteca1.agregarLibro("1234567891234", "Titulo Falso",1900, autor1);
        biblioteca1.agregarLibro("1235963153367", "Titulo Falso2",2000, autor2);
        biblioteca1.agregarLibro("1265359726874", "Titulo Falso3",1995, autor3);
                        // Listamos todos los libros de la biblioteca.
        System.out.println("La primera biblioteca es..");
        biblioteca1.listarLibros();
                        // Buscamos un libro de la biblioteca por su isbn.
        biblioteca1.buscarLibroPorIsbn("-126535926874");
                        // Eliminar libro por su isbn.
        biblioteca1.eliminarLibro("1265359726874");
                        // Obtener el total de libros de la biblioteca
        biblioteca1.obtenerCantidadLibros();
                        // Filtrar los libros por anio
        biblioteca1.filtrarLibrosPorAnio(-2000);
                        // Listar todos los autores disponibles.
        biblioteca1.mostrarAutoresDisponibles();
        
}
}