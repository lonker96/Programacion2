/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5;

/**
 *
 * @author lucas
 */
public class GeneradorQR {
        
    
    public void generar(String valor,Usuario2 usuario) {
        CodigoQR codigo = new CodigoQR(valor);
        codigo.setUsuario(usuario);
        System.out.println("El codigo creado es :"+ codigo);
    }
}
