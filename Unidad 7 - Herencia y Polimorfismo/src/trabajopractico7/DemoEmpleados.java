/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico7;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author lucas
 */
public class DemoEmpleados {
    public static void main(String[] args) {
        System.out.println("\n--- 3. Empleados y Polimorfismo con Clasificacion ---");

        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Ana Lopez", "E001", 35000.0));
        empleados.add(new EmpleadoTemporal("Juan Perez", "E002", 250.0, 160));
        empleados.add(new EmpleadoPlanta("Carlos Ruiz", "E003", 40000.0));

        // Invocar calcularSueldo() utilizando polimorfismo
        for (Empleado empleado : empleados) {
            double sueldo = empleado.calcularSueldo();
            System.out.printf("Sueldo de %s (ID %s): $%.2f\n", empleado.getNombre(), empleado.getId(), sueldo);

            // Usar instanceof para clasificar
            if (empleado instanceof EmpleadoPlanta) { // Comprobacion del tipo real de los objetos
                System.out.println("  -> Clasificacion: Es un Empleado de Planta.");
            } else if (empleado instanceof EmpleadoTemporal) {
                System.out.println("  -> Clasificacion: Es un Empleado Temporal.");
            }
        }
    }
}
