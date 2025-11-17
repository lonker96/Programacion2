/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase_Producto;

import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class Inventario {
    private ArrayList <Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    
    public void buscarProductoPorId(String id){
        Producto producto = buscarPorductoId(id);
        if(producto != null){
            producto.mostrarInfo();
        }
    }
    
    private Producto buscarPorductoId(String id){
        for (Producto producto : productos){
            if (producto.getId().equalsIgnoreCase(id)){
                return producto;
            }
        }
        System.out.println("Producto no encontrado");
        return null;
        }
    
    public void obtenerTotalStock(){
        System.out.println("Stock total...");
        for (Producto producto : productos){
            System.out.println("Producto: "+producto.getNombre()+" | Cantidad de stock: "+producto.getCantidad()+"\n========================================================");
        }
    }
    
    public void filtrarProductosPorPrecio(double min, double max){
        if(min > 0 && max > 0){
            System.out.println("Filtrando productos entre ("+min+" y "+max+')');
            for (Producto producto : productos){
                if(producto.getPrecio() >= min && producto.getPrecio() <= max){
                    System.out.println(producto);
                }
            }
        }else{System.out.println("Alguno de los dos valores ingresados son negativos, solo se aceptan numeros positivos");}
    }
    
    public void mostrarCategoriasDisponibles(){
        System.out.println("Las categorias son..");
        for(CategoriaProducto categoria: CategoriaProducto.values()){
            System.out.println("_ "+ categoria);
        }
    }
    
    public void obtenerProductoConMayorStock(){
        int maximo = 0;
        Producto producto_Maximo = productos.get(0); 
        for (Producto producto : productos){
            if (producto.getCantidad() > maximo){
                maximo = producto.getCantidad();
                producto_Maximo = producto;
            }
        }
        System.out.println("El producto con mayor stock es: "+ maximo);
        producto_Maximo.mostrarInfo();
    }
    
    public void filtrarPorCategoria(CategoriaProducto categoria){
        System.out.println("Filtrado por..("+categoria+')');
        for (Producto producto : productos){
            if (producto.getCategoria() == categoria)
                producto.mostrarInfo();
        }
    }
    
    public void eliminarProductoPorId(String id){
        Producto producto = buscarPorductoId(id);
        if(producto != null){
            productos.remove(producto);
            System.out.println("Producto con el "+id+" eliminado");
        }
    }
    
    public void listarProductos(){
        if (productos.isEmpty()){
            System.out.println("La lista de inventarios esta vacia");
        }else{
            for (Producto producto : productos) {
                producto.mostrarInfo();
            }
            
        }
    }
    
    public void actualizarStock(String id, int nuevaCantidad){
        Producto producto = buscarPorductoId(id);
        if (producto != null){
            producto.setCantidad(nuevaCantidad);
            System.out.println("El producto con el "+id+" Fue modificado con exito.");
            System.out.print("La nueva cantidad es: ");
            producto.mostrarInfo();
        }
    }
    
    @Override
    public String toString() {
        return "Inventario{" + "productos=" + productos + '}';
    }
    
}
