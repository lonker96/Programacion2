/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase_Universidad;

/**
 *
 * @author lucas
 */
public class Curso {
    private String codigo;  // -> Codigo Unico
    private String nombre;  // -> Nombre del curso
    private Profesor profesor;  // -> Profesor responsable

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    
    public void setProfesor(Profesor p){   // -> Asigna/cambia el profesor sincronizando
        if(this.profesor == p) return;
        
        if(this.profesor != null){
            this.profesor.eliminarCurso(this);
        }
        this.profesor = p;
        if(p != null && !p.getCurso().contains(this)){
            p.agregarCurso(this);
        }
    
    }
    public Profesor getProfesor(){
        return profesor;
    }
    
    //Metodo antiguo de mostrar info
    /*
    public void mostrarInfo(){   // -> Muestra codigo, nombre y nombre del profesor(si tiene)
        if(profesor != null){
        System.out.println( "Curso{" + "codigo=" + codigo + ", nombre=" + nombre + 
                ", profesor{ "+"id = " + profesor.getId() +"nombre= "+profesor.getNombre()+"especialida= "+profesor.getEspecialidad() + '}');
        }else{
            System.out.println( "Curso{" + "codigo=" + codigo + ", nombre=" + nombre + 
            ", profesor{ Ningun profesor a sido asignado a este curso aun}");
        }
    }
    */
    
    public void mostrarInfo(){
        System.out.println("Curso{" + "codigo=" + codigo + ", nombre=" + nombre +"Profesor"+ profesor);
    
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", nombre=" + nombre +'}';
    }
    
}
