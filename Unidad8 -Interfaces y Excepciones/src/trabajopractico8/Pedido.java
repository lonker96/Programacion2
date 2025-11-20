/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico8;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author lucas
 */
public class Pedido {
    private List<Producto> productos = new ArrayList<>();
    private String estado = "PENDIENTE";
    private Notificable cliente;

    public Pedido(Notificable cliente) {
        this.cliente = cliente;
    }

    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }
    
    // Implementacion de Pagable
    
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }
    
    // Metodo para cambiar estado y notificar
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("Pedido ID: " + this.hashCode() + " | Nuevo estado: " + nuevoEstado);
        
        // Uso de la interfaz Notificable
        cliente.notificarCambio(nuevoEstado);
    }
}
