/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5;

/**
 *
 * @author lucas
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma; //Composicion

    public Documento(String titulo, String contenido, String codigoHash, String fecha, Usuario2 usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new FirmaDigital(codigoHash, fecha, usuario);
    }

    @Override
    public String toString() {
        return "Documento{\n" + " Titulo= {" + titulo + "}\n Contenido= {" + contenido + 
                "}\n firma= {CodigoHash=" + firma.getCodigoHash() +", Fecha="+firma.getFecha()+"}\n "+firma.getUsuario()+ '}';
    }
    
}
