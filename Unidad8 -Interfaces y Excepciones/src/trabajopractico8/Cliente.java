/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico8;

/**
 *
 * @author lucas
 */
public class Cliente implements Notificable{
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    // Implementacion del contrato Notificable
    @Override
    public void notificarCambio(String estadoPedido) {
        System.out.println("-> [NOTIFICACION a " + nombre + "]: Su pedido ha cambiado a estado: " + estadoPedido);
    }
}
