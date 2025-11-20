/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package trabajopractico8;

/**
 *
 * @author lucas
 */
public interface PagoConDescuento extends Pago{ //Herencia de interfaz que extiende el contrato de Pago
    // Aplica un descuento y retorna el monto final.
    double aplicarDescuento(double monto);
}
