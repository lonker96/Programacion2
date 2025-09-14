package trabajopractico4;

public class TrabajoPractico4 {

    public static void main(String[] args) {
        System.out.println("Creando empleados...");
        Empleado empleado1 = new Empleado(1324,"Lucas","Comprador",5000.0);
        Empleado empleado2 = new Empleado("Brian","Vendedor");
        Empleado empleado3 = new Empleado(3568,"Juan","Vendedor",3000);
        Empleado empleado4 = new Empleado("Cristian","Vendedor");
        Empleado empleado5 = new Empleado("Pablo","Vendedor");
        System.out.println("\nDatos iniciales...");
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        System.out.println(empleado4);
        System.out.println(empleado5);
        System.out.println("\nActualizacion de salario..");
        empleado1.actualizarSalario(15);
        empleado2.actualizarSalario(20);
        empleado4.actualizarSalario();
        System.out.println("Salarios actualizados...");
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado4);
        System.out.println("\nTotal de empleados..");
        Empleado.mostrarTotalEmpleados();
    }
    
}
