/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico2;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class TrabajoPractico2 {

    /**
     * @param args the command line arguments
     */
    static final double DESCUENTO_ESPECIAL = 0.10;
    public static void main(String[] args) {
        System.out.println("Ejercicio 1 anio bisiesto");
        Scanner input = new Scanner(System.in);                                                     //Solicita al usuario un anio.

        System.out.print("Ingrese un anio para verificar si es bisiesto: ");          
        int anio = Integer.parseInt(input.nextLine());                                              //verifica si el anio ingresado es bisiesto 
        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            System.out.println("El anio ingresado ("+ anio + ") es bisiesto ");                     //si es TRUE imprime que es bisiesto, sino imprime que no es bisiesto
        } else {
            System.out.println("El anio ingresado ("+ anio + ") no es bisiesto ");
        }
        //=================================================================================================
        System.out.println("Ejercicio 2 mayor de tres numeros ");
        System.out.print("ingrese el primer numero: ");                                               //Solicita al usuario tres numeros INT
        int num1 = Integer.parseInt(input.nextLine());
        System.out.print("ingrese el segundo numero: ");
        int num2 = Integer.parseInt(input.nextLine());
        System.out.print("ingrese el tercer numero: ");
        int num3 = Integer.parseInt(input.nextLine());                                                 //Verifica cual es mayor y lo imprime por consola
        int mayor = num1;
        if (num2 > mayor){
            mayor = num2;
        }
        if (num3 > mayor){
            mayor = num3;
        }
        System.out.println("El mayor de los 3 numeros es: " + mayor);
        //=================================================================================================
        System.out.println("Ejercicio 3 Validar edad ");
        System.out.print("ingrese Su edad: ");
        int edad = Integer.parseInt(input.nextLine());                                                  //solicita al usuario una edad.
        while (edad <= 0){
        System.out.print("ERROR! ingreso una edad invalida, vuelva a intentarlo: ");                    //valida si la edad ingresada NO es negativa.
        edad = Integer.parseInt(input.nextLine());
        }
        if (edad < 12){                                                                                 //En base a unos rangos, imprime por consola a que grupo pertenece esa edad.
        System.out.println("Niño");
        }else if (edad >= 12 && edad <= 17){
        System.out.println("Adolescente");
        }else if (edad >= 18 && edad <=59){
        System.out.println("Adulto");
        }else{
        System.out.println("Adulto mayor");
        }
       //=================================================================================================
       System.out.println("Ejercicio 4 calculadora descuento");
       char a,b,c,categoria;
       double descuento,precio,precioFinal;                                                             
       a = 'A';
       b = 'B';
       c = 'C';
       System.out.print("Ingrese el precio de su producto: ");
       precio = Double.parseDouble(input.nextLine());                                                   //Solicita al usuario un precio
       System.out.print("Ingrese su categoria A, B o C: ");
       categoria = Character.toUpperCase(input.nextLine().charAt(0));                                   //Solicita una de las 3 categorias
       while (categoria != a && categoria != b && categoria != c){                                      //Verifica que la categoria ingresada sea valida
           System.out.print("ERROR! ingresaste una categoria incorrecta, vuelve a intentarlo recuerda que las categorias son A, B o C: ");
           categoria = Character.toUpperCase(input.nextLine().charAt(0));
       }
       if (categoria == a){                                                                             //En base a la categoria elejida y segun unos parametros aplica un descuento u otro
           descuento = precio * 0.10;                                                                   //Se muestra por consola el descuento aplicado y el precio final
           precioFinal = precio - descuento;
           System.out.println(" El precio original es: $" + precio + "\n El descuento es de 10%, lo que es: $" + descuento + "\n El precio final es: $" + precioFinal);
       }else if (categoria == b){
           descuento = precio * 0.15;
           precioFinal = precio - descuento;
           System.out.println(" El precio original es: $" + precio + "\n El descuento es de 15%, lo que es: $" + descuento + "\n El precio final es: $" + precioFinal);
       }else{
           descuento = precio * 0.20;
           precioFinal = precio - descuento;
           System.out.println(" El precio original es: $" + precio + "\n El descuento es de 20%, lo que es: $" + descuento + "\n El precio final es: $" + precioFinal);
       }
        //=================================================================================================
        System.out.println("Ejercicio 5 Suma de numeros pares ");
        int acu = 0;
        System.out.print("Ingrese un numero: ");                                                        //Solicita al usuario numeros INT
        int n = Integer.parseInt(input.nextLine());
        
        while (n!= 0) {
            if (n < 0) {                                                                                //Los clasifica si son pares o impares
            System.out.println("ERROR ingreso un numero negativo, vuelva a intentarlo : "+n+" vuelva a intentarlo");
            n = Integer.parseInt(input.nextLine());
            }
            else if (n % 2 == 0 ){
                acu+= n;                                                                                //Acumulada la c/u de los pares
                System.out.print("Numero par acumulado ++ , ingrese otro numero: ");
                n = Integer.parseInt(input.nextLine());
            }else{                                                                                      //Cuando el usuario ingresa 0 termina de ciclar
                System.out.print("Numero impar no acumulado, vuelva a ingresar otro numero: ");
                n = Integer.parseInt(input.nextLine());                                         
            }
        }           
        System.out.println("El acumulado de numeros pares es: " + acu);                                 //Muestra por consola el resultado de los acumulados
        //=================================================================================================
        System.out.println("Ejercicio 6 contador de positivos, negativos y ceros ");
        int i = 0;
        int acuPositivo = 0;                                    
        int acuNegativo = 0;
        int acuCero = 0;
        System.out.println("Ingrese diez numeros para clasificarlos");                                  //Solicita al usuario que ingrese 10 numeros INT
        for (i = 0 ; i < 10 ; i ++){
            int numeros = Integer.parseInt(input.nextLine());
            System.out.print("Ingrese otro: ");                                                         //Los clasifica segun si son POSITIVOS, NEGATIVOS O CERO
            if (numeros > 0){
                acuPositivo +=  1;
            }else if(numeros < 0){
               acuNegativo +=  1;                                                                       //Cuenta cuantos van entrando de c/u
            }else{
               acuCero +=  1;
            }
        }
        System.out.println("Total de positivos: "+ acuPositivo +"\nTotal de negativos: "+ acuNegativo +"\nTotal de ceros: " +acuCero);   //Muestra el resultado de los acumulados por consola       
        //=================================================================================================
        System.out.println("Ejercicio 7 contador de positivos, negativos y ceros ");
        System.out.print("Ingrese una nota (0-10): ");
        double nota;
        do{
            nota = Double.parseDouble(input.nextLine());                                                //Solicita al usuario que ingrese una nota entre 0 y 10
            if (nota < 0 || nota > 10){                                                                 //Verifica que la nota ingresada este en esos parametros
                System.out.println("Error: Nota invalida. Ingrese una nota entre 0 y 10. ");            //Cuando la nota es valida imprime por consola que 'Guardo la nota'
            }
        }while(nota < 0 || nota > 10);
        System.out.println("Nota guardada correctamente.");
        //=================================================================================================
        System.out.println("Ejercicio 8 Calculo de precio final, con impuesto y descuento ");
        System.out.println("Ingrese el precio base del producto");
        precio = Double.parseDouble(input.nextLine());                                                  //Solicita al usuario un precio base, un impuesto y un descuento
        System.out.println("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%):");                //Segun el impuesto y descuento ingresado por el usuario calcula el precio final
        double impuesto = Double.parseDouble(input.nextLine()) / 100;
        System.out.println("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%)");
        descuento = Double.parseDouble(input.nextLine()) / 100;
        precioFinal = calcularPrecioFinal(precio,impuesto,descuento);                                   //Llama al metodo qeu hace los calculos y muestra por consola el resultado
        System.out.println("El precio final es del producto es: "+ precioFinal);
        //=================================================================================================
        System.out.println("Ejercicio 9 funciones para calcular costo de envio y total de compra ");
        System.out.print("Ingrese el precio del producto: ");                                          //Solicitando el precio al usuario
        precio = Double.parseDouble(input.nextLine());
        do{                                                                                            //Comprobando que el dato sea valido
            if (precio < 0){
                System.out.print("ERROR! ingrese un precio positivo: ");
                precio = Double.parseDouble(input.nextLine());
            } 
        }while (precio < 0);
        System.out.print("Ingrese el peso del paquete en kg: ");                                        //Solicitando el peso en kg al usuario
        double peso = Double.parseDouble(input.nextLine()); 
        do{                                                                                             //Comprobando que el dato sea valido
            if (peso < 0){
                System.out.print("ERROR! ingrese un precio positivo: ");
                peso = Double.parseDouble(input.nextLine());
            } 
        }while (peso < 0);
        System.out.print("Ingrese la zona de envio (Nacional/Internacional)");                          //Solicitando la zona de envio al usuario
        String zona = input.nextLine();
        do{                                                                                             //Comprobando que la zona ingresada sea valida
            if (!zona.equalsIgnoreCase("INTERNACIONAL") && !zona.equalsIgnoreCase("NACIONAL")){
                System.out.print("ERROR! zona incorrecta, recuerda que la zona debe ser (Nacional/Internacional)");
                zona = input.nextLine();
            } 
        }while (!zona.equalsIgnoreCase("INTERNACIONAL") && !zona.equalsIgnoreCase("NACIONAL"));
        double costoEnvio = calcularCostoEnvio(peso,zona);                                              //Llamado a la funcion para calcular el envio y guardar el return en una variable
        System.out.println("El costo de envio es: "+costoEnvio);                                        //Mostrando el costo de envio por consola
        calcularTotalCompra(precio,costoEnvio);                                                         //Llamado a la funcion que calcula el total y mostrar los resultados por consola
        //=================================================================================================
        System.out.println("Ejercicio 10 Actualizacion de stock a partir de venta y recepcion de productos");
        System.out.print("Ingrese el stock actual del producto: ");                                     //Solicitud de datos al usuario
        int stockActual = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = Integer.parseInt(input.nextLine());
        actualizarStock(stockActual,cantidadVendida,cantidadRecibida);                                  //Llamado a la funcion que calcula el stock actual
        //=================================================================================================
        System.out.println("Ejercicio 11 Calculo de descuento especial usando variable global. ");
        System.out.print("Ingrese el precio del producto: ");                                            //Solicitud de datos al usuario
        double precioActual = Double.parseDouble(input.nextLine());
        do{                                                                                              //Comprobando que el dato sea valido
            if (precioActual < 0){
                System.out.print("ERROR! ingrese un precio positivo: ");
                precioActual = Double.parseDouble(input.nextLine());
            } 
        }while (precioActual < 0);
        precioFinal = descuentoAplicado(precioActual);                                                   //Llamado a la funcion para calcular el descuento
        System.out.println("El precio final con descuento es: " + precioFinal);
        //=================================================================================================
        System.out.println("Ejercicio 12 Modificacion de un array de precios y visualizacion de resultados");
        double[]precios={199.99,299.5,149.75,399.0,89.99};                                              //Declarando un array de double
        System.out.println("Precios originales: ");
        recorrerArray(precios);                                                                         //Utilizando un metodo para recorrer el array
        precios[2]= 777.77;                                                                             //Modificando el array mediante el indice
        precios[4]= 0.0;
        System.out.println("Precios modificados: ");
        recorrerArray(precios);                                                                         //Recorriendo el array modificado                                        
        //=================================================================================================
        System.out.println("Ejercicio 13 Impresion recursiva de arrays antes y despues de modificar un elemento.");
        System.out.println("Precios originales:");                                                      //REUTILIZA EL ARRAY DEL EJERCICIO ANTERIOR
        funcionRecu(precios,0);                                                                         //Llamada a la funcion recursiva para recorrer el array
        precios[2]= 777.77;                                                                             //Modificacion del array segun el indice
        precios[4]= 0.0;
        System.out.println("Precios modificados:");
        funcionRecu(precios,0);                                                                         //Rellamado a la funcion recu para recorrer devuelta con las modificaciones
        
}//Cierre del main
        public static void funcionRecu(double[]array,int ubicacion){
        if  (ubicacion < array.length){
            System.out.println(array[ubicacion]);
            funcionRecu(array, ubicacion +1);
        }  
        }
        public static void recorrerArray(double []array){
        int i;
        for (i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        }
        public static double descuentoAplicado(double precioActual ){                                   //Funcion que calcula el descuento utilizando una CONSTANTE.
            double descuentoEspecial = precioActual * DESCUENTO_ESPECIAL;  
            System.out.println("El descuento especial aplicado es: " + descuentoEspecial);              //Muestra cuando va a ser el descuento por consola.
            double precioFinal = precioActual - descuentoEspecial;
            return precioFinal;                                                                         //Devuelve el descuento aplicado.
        }
        public static double calcularCostoEnvio(double peso, String zona){                              //Funcion para calcular el envio
        //nacional 5$ x kg
        //internacional 10$ x kg
        if (zona.equalsIgnoreCase("INTERNACIONAL")){                                                    //Verifica la zona INTERNACIONAL y retorna el resultado
            return 10 * peso;
        }else{                                                                                          //Caso contrario la zona es NACIONAL y retorna el resultado
            return 5 * peso;
        }
        }
        public static void actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){  //Funcion void para calcular el stock actual, recibe 3 int donde uno debe ser el stock en este momento, lo que salio y lo que entro
            int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
            System.out.println("El nuevo stock del producto es: "+nuevoStock);                           //Post calculo muestra por consola el resultado
        }
        public static void calcularTotalCompra(double precioProducto, double costoEnvio){               //Funcion void que calcula el total
        double totalApagar = precioProducto + costoEnvio;
        System.out.println("El total a pagar es: " + totalApagar );                                     //Mostrando por consola el total
        }
        public static double calcularPrecioFinal(double precio, double impuesto, double descuento){     //Metodo para calcular el precio final del ecomers y retornar el resultado
        double precioFinal = precio + (precio * impuesto) - (precio * descuento);    
        return precioFinal;
    }
} //Cierre de clase
