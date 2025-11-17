/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clase_Producto;

import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                            // Instanciamos los 5 productos
        System.out.println("===========================================================");
        Producto producto1= new Producto("id_0001","Auricular",12580.50,2,CategoriaProducto.ELECTRONICA);
        Producto producto2= new Producto("id_0002","Remera",50000.20,4,CategoriaProducto.ROPA);
        Producto producto3= new Producto("id_0003","Mesa",70500.30,1,CategoriaProducto.HOGAR);
        Producto producto4= new Producto("id_0004","Pancho",5000.50,5,CategoriaProducto.ALIMENTOS);
        Producto producto5= new Producto("id_0005","Mouse",10000,1,CategoriaProducto.ELECTRONICA);
                            // Instanciamos el inventario
        System.out.println("===========================================================");                    
        Inventario inventario = new Inventario();
                            // Agregamos a el inventario los 5 productos
        System.out.println("===========================================================");                    
        inventario.agregarProducto(producto1);
        inventario.agregarProducto(producto2);
        inventario.agregarProducto(producto3);
        inventario.agregarProducto(producto4);
        inventario.agregarProducto(producto5);
                            // Listamos todos los productos del inventario
        System.out.println("===========================================================");
        inventario.listarProductos();
                            //Buscamos un producto por su id
        System.out.println("===========================================================");
        inventario.buscarProductoPorId("id_0066");
                            // Eliminamos un producto por su id
        System.out.println("===========================================================");
        inventario.eliminarProductoPorId("id_0002");
        inventario.listarProductos();
                            // Actualizamos stock de un producto por su id
        System.out.println("===========================================================");
        inventario.actualizarStock("id_0001", 10);
                            // Filtramos por categoria
        System.out.println("===========================================================");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
                            // Obtener el stock total del inventario
        System.out.println("===========================================================");
        inventario.obtenerTotalStock();
                            // Obtener el producto con el stock mas alto
        System.out.println("===========================================================");
        inventario.obtenerProductoConMayorStock();
                            // Obtener los prductos entre los dos parametros establecidos
        System.out.println("===========================================================");
        inventario.filtrarProductosPorPrecio(8000, 71000);
                            // Listar las categorias de la clase enum
        System.out.println("===========================================================");
        inventario.mostrarCategoriasDisponibles();
    }
    
}
