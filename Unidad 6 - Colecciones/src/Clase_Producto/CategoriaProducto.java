/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase_Producto;

/**
 *
 * @author lucas
 */
public enum CategoriaProducto {
    ALIMENTOS("Producto comestible"),
    ELECTRONICA("Dispositivo electronicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Articulos para el hogar");
    
    private final String descripcion;
    CategoriaProducto(String descripcion){
        this.descripcion = descripcion;
    }
    public String getDescripcion(){
        return descripcion;
    }
    
}
