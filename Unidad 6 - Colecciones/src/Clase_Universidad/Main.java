/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase_Universidad;

/**
 *
 * @author lucas
 */
public class Main {
    public static void main(String[] args) {
        Universidad universidad = new Universidad();
                                //Instanciando profesores.
        Profesor profesor1 = new Profesor("ID_0001","Jorge Fernandez","Matematica");
        Profesor profesor2 = new Profesor("ID_0002","Ana Garcia","Quimica");
        Profesor profesor3 = new Profesor("ID_0003","Florencia Gonzalez","Musica");
                                //Instanciando cursos.
        Curso curso1 = new Curso("COD_0001","Curso Fisica");
        Curso curso2 = new Curso("COD_0002","Curso Quimica 1");
        Curso curso3 = new Curso("COD_0003","Curso Teatro");
                                //Agregar los cursos y profesores a las listas de la uni
        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarProfesor(profesor1);
        universidad.agregarProfesor(profesor2);
        universidad.agregarProfesor(profesor3);
                                //Listar cursos con sus profesores y profesores con sus cursos
        universidad.asignaProfesorACurso("COD_0001", "ID_0001");
        universidad.asignaProfesorACurso("COD_0002", "ID_0001");
        universidad.listarCursos();
        universidad.listarProfesores();
        
                                //Cambiar el profesore de un curso y verificar el cambio
        System.out.println("====================================================================");
        universidad.asignaProfesorACurso("COD_0001", "ID_0002");                        
        universidad.listarCursos();
        universidad.listarProfesores();
                                //Eliminar un curso y verificar el profesor de ese curso.
        System.out.println("====================================================================");
        universidad.eliminarCurso("COD_0001");
        universidad.listarCursos();
        universidad.listarProfesores();
        System.out.println("====================================================================");
        universidad.eliminarProfesorPorId("ID_0002");
        System.out.println("====================================================================");
        universidad.mostrarReporteCursosPorProfesor();
        
    }
}
