/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico8;

/**
 *
 * @author lucas
 */
public class PayPal implements PagoConDescuento{
    @Override
    public double aplicarDescuento(double monto) {
        double montoFinal = monto * 0.95; // 5% de descuento
        System.out.printf("[PayPal] Descuento del 5%% aplicado. Monto final: $%.2f\n", montoFinal);
        return montoFinal;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.printf("Procesando pago con PayPal por $%.2f. Sin comisiones.\n", monto);
    }
}
