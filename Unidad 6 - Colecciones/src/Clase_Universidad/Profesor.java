/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase_Universidad;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author lucas
 */
public class Profesor {
    private String id;  // -> Identidficador unico
    private String nombre;  // -> Nombre completo
    private String especialidad;   // -> Area principal
    private List<Curso> cursos = new ArrayList<>();  // -> Curso que dicta

    public Profesor(String id, String nombre, String especialidad) {  // -> Constructor
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    
    
    
    public void agregarCurso(Curso c){    // -> Agrega el curso a su lista si no esta y sincroniza
        if(c != null && !cursos.contains(c)){
            cursos.add(c);
            if(c.getProfesor() !=this){
                c.setProfesor(this);
            }
        }
    
    }
    
    public void eliminarCurso(Curso c ){   // -> Quita el curso y sincroniza el lado del curso (dejar profesor en null si corresponde)
        if(cursos.remove(c) && c.getProfesor() == this){
            c.setProfesor(null);
        }
        
    }
    public  List<Curso> getCurso(){
        return Collections.unmodifiableList(cursos);
    }

    public List<Curso> getCursos() {  //Metodo temporal para pruebas
        return cursos;
    }
    
    
    
    public void listarCursos(){  // -> Muestra codigos y nombres.
        for(Curso curso:cursos)
            System.out.println("Curso: "+curso+"Codigo: "+curso.getCodigo()+"Nombre: "+curso.getNombre());
    }
    
    public void mostrarInfo(){   // -> Imprime datos del profesor y cantidad de cursos.
        System.out.println("Profesor{" + "id=" + id + ", nombre=" + nombre + ", especialidad=" + especialidad+ cursos.toString());
    }

    
}
