
package unidad3;
import java.time.Year;
/**
 *
 * @author lucas
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    //Modifica el anio de la publicacion, con la validacion de anio actual
    public void setAnioPublicacion(int nuevoAnio) {
        int anioActual = Year.now().getValue(); //Obtiene el anio actual
        if(nuevoAnio >= 1900 && nuevoAnio <= anioActual){  //Verifica que el anio ingresado este entre 1900 y el anio acutal
            this.anioPublicacion = nuevoAnio;       //Caso TRUE mofica
            System.out.println("El anio de la publicacion fue actualizado correctamente, el anio actual es: "+anioPublicacion);
        }else{              //Caso FALSE, no mofica y da el aviso del porque
            System.out.println("ERROR.. el anio ingresado debe estar entre 1900 y " + anioActual);
        }
    }
    public void mostrarInfo(){ //Metodo para mostrar la info de los objetos
        System.out.println("Titulo del libro: " + titulo);
        System.out.println("Autor del libro: " + autor);
        System.out.println("Anio de publicacion: " +anioPublicacion);
    }
}
