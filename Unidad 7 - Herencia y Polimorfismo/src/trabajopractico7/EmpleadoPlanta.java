/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico7;

/**
 *
 * @author lucas
 */
public class EmpleadoPlanta extends Empleado{
    private double sueldoFijo;

    public EmpleadoPlanta(String nombre, String id, double sueldoFijo) {
        super(nombre, id);
        this.sueldoFijo = sueldoFijo;
    }

    @Override
    public double calcularSueldo() {
        return sueldoFijo;
    }
}
