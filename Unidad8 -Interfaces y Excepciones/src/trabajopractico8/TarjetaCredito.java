/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico8;

/**
 *
 * @author lucas
 */
public class TarjetaCredito implements Pago{
    @Override
    public void procesarPago(double monto) {
        System.out.printf("Procesando pago con Tarjeta de Credito por $%.2f. Comision del 2%%.\n", monto * 1.02);
    }  
}
