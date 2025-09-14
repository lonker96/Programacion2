/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad3;

/**
 *
 * @author lucas
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        if(calificacion < 0){
            this.calificacion = 0;     //Evita valores negativos
        }else if(calificacion > 10){
            this.calificacion = 10;   //Evita valores mayores a 10
        }else{
            this.calificacion = calificacion;
        }
    }
    
    //Metodos requeridos
    //mostrarInfo(), subirCalificacion(puntos), bajarCalificacion(puntos).
    
    public void bajarCalificacion(double puntos){
        if (calificacion - puntos >= 0){
                setCalificacion(calificacion -= puntos);
                System.out.println("La calificacion fue modificada, Actualmente es: " + calificacion);
            }else{
                System.out.println("No se puede bajar de la calificacion minima de 0");
            }
    }
    public void subirCalificacion(double puntos){
        if (calificacion + puntos <= 10){
            setCalificacion(calificacion +=puntos);
            System.out.println("La calificacion fue modificada, Actualmente es: " + calificacion);
        }else{
            System.out.println("No se puede superar la calificacion maxima de 10");
        }
    }
    public void mostrarInfo(){
        System.out.println("Estudiante: " + nombre + ' ' + apellido  );
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " +calificacion);
    }
    
}
