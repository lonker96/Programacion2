/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5;

/**
 *
 * @author lucas
 */
public class Foto {
    private String imagen;
    private String formato;
    
    public Foto(String foto, String formato){
        this.imagen = foto;
        this.formato = formato;
    }
    public String getImagen(){
        return imagen;
    }
    public String getFormato(){
        return formato;
    }

    @Override
    public String toString() {
        return "Foto{" + "imagen=" + imagen + 
                ", formato=" + formato + '}';
    }
    
}
