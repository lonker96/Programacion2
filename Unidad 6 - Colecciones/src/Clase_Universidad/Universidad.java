/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase_Universidad;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author lucas
 */
public class Universidad {
    private String nombre;
    private List<Profesor> profesores = new ArrayList<>();   // -> Lista de profesores
    private List<Curso> cursos = new ArrayList<>();   // -> Lista de cursos
    
    public void agregarProfesor(Profesor p) {  // -> Agrega profesor a la lista
        profesores.add(p);
    }
    public void agregarCurso(Curso c) {  // -> Agrega un curso a la lista
        cursos.add(c);
    }
    public void asignaProfesorACurso(String codigoCurso, String idProfesor){  // -> Usa setProfesor del curso
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesoresPorId(idProfesor);
        curso.setProfesor(profesor);
    }
    public void listarProfesores(){ // -> Muestra todos los profesores
        System.out.println("\nListado de profesores: ");
        for(Profesor profesor : profesores){
            System.out.println("Profesor: " + profesor.getNombre() + " (Especialida= " + profesor.getEspecialidad() + ")");
            if(profesor.getCursos().isEmpty()){
                System.out.println(" - No dicta cursos actualmente.");
            }else{
                for(Curso curso: profesor.getCursos()){
                    System.out.println("- curso: "+ curso.getNombre());
                }
            }
        }    
    }
    public void listarCursos(){ // -> Muestra todos los cursos
        System.out.println("\nListado de cursos: ");
        for (Curso curso: cursos){
            Profesor profe = curso.getProfesor();
            String nombreProfe;
            if(profe != null){
                nombreProfe = profe.getNombre();
            }else{nombreProfe = "Sin asignar";}
            System.out.println("Curso: " + curso.getNombre() + " | Profesor: " + nombreProfe);
        }
    }
    private Profesor buscarProfesoresPorId(String id){// -> Buscar un profesor por su id
        for(Profesor profesor: profesores)
            if(profesor.getId().equals(id)){
                return profesor;
            }
        return null;
    }
    private Curso buscarCursoPorCodigo(String codigo){// -> Buscar un curso por su codigo
        for(Curso curso: cursos)
            if(curso.getCodigo().equals(codigo)){
                return curso;
            }
        return null;
    }
    public void eliminarCurso(String codigo){// -> Debe romper la relacion con su profesor si la hubiera
        Iterator<Curso> it = cursos.iterator();
        while (it.hasNext()) {
            Curso curso = it.next();
            if (curso.getCodigo().equals(codigo)) {
                // Romper relacion con el profesor
                Profesor profe = curso.getProfesor();
                if (profe != null) {
                    profe.getCursos().remove(curso); // Eliminar curso de la lista del profesor
                }

                it.remove(); // Eliminar curso de la lista de la universidad
                System.out.println(curso.getNombre() + " eliminado.");
                return;
            }
        }
    }
    public void eliminarProfesorPorId(String id) {
        Iterator<Profesor> it = profesores.iterator();
        while (it.hasNext()) {
            Profesor profe = it.next();
            if (profe.getId().equals(id)) {
                // Romper relacion con los cursos
                for (Curso curso : profe.getCursos()) {
                    curso.setProfesor(null); // El curso ya no tiene profesor
                }
                it.remove(); //Eliminar al profesor de la lista
                System.out.println("Profesor " + profe.getNombre() + " eliminado.");
                return;
            }
        }
        System.out.println("No se encontro un profesor con ID: " + id);
    }
    public void mostrarReporteCursosPorProfesor() {
        System.out.println(" Reporte: Cantidad de cursos por profesor");
        for (Profesor profesor : profesores) {
            int cantidad = profesor.getCursos().size();
            System.out.println("- " + profesor.getNombre() + " (" + profesor.getId() + "): " + cantidad + " curso(s)");
        System.out.println("  Cursos:");
        for (Curso curso : profesor.getCursos()) {
            System.out.println("    - " + curso.getNombre());
            }
        }
    }
}
