/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico8;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class DemoExcepciones {
    // 4. Excepcion personalizada: Metodo que lanza la excepcion
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            // Lanzar la excepcion personalizada
            throw new EdadInvalidaException("La edad (" + edad + ") debe estar entre 0 y 120.");
        }
        System.out.println("Edad valida: " + edad);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n======== PARTE 2: DEMO EXCEPCIONES ========");

        // --- 1. Division Segura (ArithmeticException) ---
        System.out.println("\n--- 1. Division Segura ---");
        try {
            int numerador = 10;
            int divisor = 0;
            int resultado = numerador / divisor;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.err.println("Error: No se puede dividir por cero. Mensaje: " + e.getMessage());
        }

        // --- 2. Conversion de cadena a numero (NumberFormatException) ---
        System.out.println("\n--- 2. Conversion de Cadena ---");
        System.out.print("Ingrese un numero (ej. 123): ");
        String texto = scanner.nextLine();
        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Conversion exitosa: " + numero);
        } catch (NumberFormatException e) {
            System.err.println("Error: El texto ingresado no es un numero entero valido. Mensaje: " + e.getMessage());
        }

        // --- 3. Lectura de Archivo (FileNotFoundException) ---
        System.out.println("\n--- 3. Lectura de Archivo ---");
        try {
            FileReader fr = new FileReader("archivo_inexistente.txt");
            System.out.println("Archivo encontrado y listo para leer.");
            fr.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error: Archivo no encontrado. Por favor, verifique la ruta.");
        } catch (IOException e) {
             System.err.println("Error de lectura/cierre del archivo.");
        }

        // --- 4. Excepcion Personalizada (EdadInvalidaException) ---
        System.out.println("\n--- 4. Excepción Personalizada ---");
        try {
            validarEdad(35);  // Válido
            validarEdad(-5);  // Invalido, lanza la excepción
        } catch (EdadInvalidaException e) {
            // Capturar y mostrar mensaje de la regla de negocio
            System.err.println("Error de validacion: " + e.getMessage());
        }

        // --- 5. Uso de try-with-resources (para manejar recursos) ---
        System.out.println("\n--- 5. Uso de try-with-resources ---");
        String nombreArchivo = "archivo_prueba.txt"; // Cambiar a un archivo existente para probar

        // La sintaxis 'try (recursos)' garantiza que BufferedReader se cierre automaticamente
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
