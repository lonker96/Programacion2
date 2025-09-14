/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico1;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class TrabajoPractico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 3");
        String nombre;
        int edad;
        double altura;
        boolean estudiante;
        nombre = "Lucas";
        edad = 28;
        altura = 1.71;
        estudiante = true;
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(altura);
        System.out.println(estudiante);
        
        System.out.println("Ejercicio 4");
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre = input.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su edad es: " + edad);
        
        System.out.println("Ejercicio 5");
        int num1,num2,suma,resta,multiplicacion;
        double division;
        System.out.println("Ingrese el primer numero: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese el segundo numero: ");
        num2 = Integer.parseInt(input.nextLine());
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = (double)num1 / num2;
        System.out.println("La suma de " + num1 + " + " + num2 + " = "+suma);
        System.out.println("La resta de " + num1 + " - " + num2 + " = "+resta);
        System.out.println("La multiplicacion de " + num1 + " * " + num2 + " = "+multiplicacion);
        System.out.println("La division de " + num1 + " / " + num2 + " = "+division);
        
        System.out.println("Ejercicio 6");
        String direccion;
        nombre = "Juan Perez";
        edad = 30;
        direccion = "Calle Falsa 123";
        System.out.println("Nombre: " + nombre + "\n" + "Edad: " + edad + "\n" + "Direccion: " + direccion);
    
        System.out.println("Ejercicio 8");
        int resultadoInteger;
        double resultadoDouble;
        System.out.println("Ingrese el primer numero: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese el segundo numero: ");
        num2 = Integer.parseInt(input.nextLine());
        resultadoInteger = num1 / num2;
        resultadoDouble = (double) num1 / num2;
        System.out.println("Resultado de la division de enteros: " + resultadoInteger);
        System.out.println("Resultado de la division de doubles: " + resultadoDouble);
        
        System.out.println("Ejercicio 9");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        nombre = scanner.nextLine(); // SOLUCION APLICADA A MI CODIGO
        System.out.println("Hola, " + nombre);
        
        
    }
    
}
