package trabajopractico8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class main {
    
    // Metodo auxiliar, ya que EdadInvalidaException extiende Exception, debemos usar throws
    private static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad (" + edad + ") debe estar entre 0 y 120.");    // Lanzar la excepcion
        }
        System.out.println("Edad valida: " + edad);
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 
        System.out.println("\n======== PARTE 1: DEMO INTERFACES ========");
        Cliente cl = new Cliente("Maria Rodriguez");
        Producto p1 = new Producto("Laptop", 1200.00);
        Producto p2 = new Producto("Mouse Gaming", 50.00);
        Pedido miPedido = new Pedido(cl);
        miPedido.agregarProducto(p1);
        miPedido.agregarProducto(p2);
        
        double subtotal = miPedido.calcularTotal();
        System.out.printf("\nTotal del Pedido (Pagable): $%.2f\n", subtotal);
        PayPal pp = new PayPal();
        double montoConDescuento = pp.aplicarDescuento(subtotal);
        pp.procesarPago(montoConDescuento);
        TarjetaCredito tc = new TarjetaCredito();
        tc.procesarPago(subtotal);
        System.out.println("\n--- Notificacion ---");
        miPedido.cambiarEstado("EN PREPARACION");
        miPedido.cambiarEstado("ENVIADO");
        
        System.out.println("\n\n======== PARTE 2: DEMO EXCEPCIONES ========");
        
        // --- 2.1. Division Segura (ArithmeticException) ---
        System.out.println("\n--- 2.1. Division Segura ---");
        try {
            int numerador = 10;
            int divisor = 0;
            int resultado = numerador / divisor;
            System.out.println("Resultado: " + resultado); 
        } catch (ArithmeticException e) {
            System.err.println("Error: No se puede dividir por cero. Mensaje: " + e.getMessage());
        }

        // --- 2.2. Conversion de cadena a numero (NumberFormatException) ---
        System.out.println("\n--- 2.2. Conversion de Cadena ---");
        System.out.print("Ingrese un numero (ej. 123abasda) para probar el error: ");
        String texto = scanner.nextLine();
        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Conversion exitosa: " + numero);
        } catch (NumberFormatException e) {
            System.err.println("Error: El texto ingresado no es un numero entero valido. Mensaje: " + e.getMessage());
        }
        // --- 2.3. Lectura de Archivo (FileNotFoundException) ---
        System.out.println("\n--- 2.3. Lectura de Archivo ---");
        try {
            // Suponiendo que el archivo "archivo_inexistente.txt" no existe
            FileReader fr = new FileReader("archivo_inexistente.txt");
            System.out.println("Archivo encontrado y listo para leer.");
            fr.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error: Archivo no encontrado. Por favor, verifique la ruta.");
        } catch (IOException e) {
             System.err.println("Error de lectura/cierre del archivo.");
        }

        // --- 2.4. Excepcion Personalizada (EdadInvalidaException) ---
        System.out.println("\n--- 2.4. Excepcion Personalizada ---");
        try {
            validarEdad(35);  // Valido
            validarEdad(-5);  // Invalido, lanza la excepción
        } catch (EdadInvalidaException e) {
            // Capturar la excepcion personalizada
            System.err.println("Error de validacion: " + e.getMessage());
        }

        // --- 2.5. Uso de try-with-resources ---
        System.out.println("\n--- 2.5. Uso de try-with-resources ---");
        String nombreArchivo = "archivo_prueba.txt";

        // La sintaxis try (recursos) garantiza que BufferedReader se cierre automaticamente
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea = br.readLine();
            System.out.println("Lectura exitosa (primera linea): " + linea);
        } catch (FileNotFoundException e) {
            System.err.println("Error: Archivo '" + nombreArchivo + "' no encontrado.");
        } catch (IOException e) {
            System.err.println("Error durante la lectura/cierre del archivo: " + e.getMessage());
        }
        
        scanner.close();
    }
}