/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5;

/**
 *
 * @author lucas
 */
public class CodigoQR {
    private String valor;
    private Usuario2 usuario; //asociacion unidireccional

    public CodigoQR(String valor) {
        this.valor = valor;
    }


    public void setUsuario(Usuario2 usuario){//asociacion unidireccional
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "CodigoQR{" + "valor=" + valor + "," + usuario + '}';
    }
    
}
