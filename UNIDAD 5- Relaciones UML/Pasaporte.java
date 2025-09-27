/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5;

/**
 *
 * @author lucas
 */
public class Pasaporte { //Atributos de la clase pasaporte donde tenemos dos atributos de tipo objeto
    private String numero;
    private String fechaEmision;
    private Titular titular; //atributo de tipo objeto  //Asociacion bidireccional
    private Foto foto; //atributo de tipo objeto  //Composicion

    public Pasaporte(String numero, String fechaEmision,String foto, String formato){ //constructor de la clase pasaporte que tambien crea la instancia foto
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(foto,formato);
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular){
        this.titular = titular;
        if(titular != null && titular.getPasaporte() != this){
            titular.setPasaporte(this);
        }
    }

    @Override
    public String toString() { //Metodo to string que en la parte del objeto solo devuelve un dato 
        return "Pasaporte{" + "numero=" + numero + ", fechaEmision=" + fechaEmision + 
                ", titular= {nombre= " + titular.getNombre() + ", dni= "+ titular.getDni() +'}'
                +"Imagen= {"+foto.getImagen()+", formato="+foto.getFormato()+'}'+'}'; 
    }
}
