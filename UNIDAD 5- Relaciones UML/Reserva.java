/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5;

/**
 *
 * @author lucas
 */
public class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente; //Asociacion unidireccional
    private Mesa mesa;  //Agregacion

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public void setCliente(Cliente cliente) {
       this.cliente = cliente;
    }
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Reserva{" + "fecha=" + fecha + ", hora=" + hora + 
                ", Cliente={" + cliente.getNombre() +','+cliente.getDni() 
                +"}, Mesa={"+mesa.getNumero()+','+ mesa.getCapacidad()+"}}";
    }

    
    
    
}
