/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad3;

/**
 *
 * @author lucas
 */
public class Unidad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Creando objeto estudiante..");
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Lucas");
        estudiante1.setApellido("Fredes");
        estudiante1.setCurso("Matematica");
        estudiante1.setCalificacion(5.3);
        System.out.println("Informacion incial..");
        estudiante1.mostrarInfo();
        System.out.println("Modificando informacion..");
        estudiante1.subirCalificacion(2);
        estudiante1.bajarCalificacion(-5);
        System.out.println("Informacion final..");
        estudiante1.mostrarInfo();
        
        System.out.println("\n=============================\n");
        
        System.out.println("Creando objeto Mascota..\n");
        Mascotas mascota1 = new Mascotas();
        mascota1.setNombre("Teemo");
        mascota1.setEspecie("Caniche");
        mascota1.setEdad(8);
        System.out.println("Informacion inicial de Mascota.");
        mascota1.mostrarInfo();
        System.out.println("\nPasaron dos anios, actualizando info...\n");
        mascota1.cumplirAnios(2);
        mascota1.cumplirAnios(10);
        System.out.println("Informacion Final de Mascota.");
        mascota1.mostrarInfo();
        
        System.out.println("\n=============================\n");
        System.out.println("Creando objeto Libro..\n");
        Libro libro1 = new Libro();
        libro1.setTitulo("Programacion1");
        libro1.setAutor("Guillermo Garcia");
        libro1.setAnioPublicacion(2010);
        libro1.mostrarInfo();
        System.out.println("\nProbando las restricciones..\n");
        libro1.setAnioPublicacion(2000);
        libro1.setAnioPublicacion(1800);
        libro1.setAnioPublicacion(2050);
        System.out.println("\nInformacion final.");
        libro1.mostrarInfo();
        
        System.out.println("\n=============================\n");
        System.out.println("Creando objetos Gallina..\n");
        Gallina gallina1 = new Gallina();
        gallina1.setIdGallina(0001);
        gallina1.setEdad(6);
        gallina1.setHuevosPuestos(1);
        System.out.println("La primer gallina a sido creada..");
        Gallina gallina2 = new Gallina();
        gallina2.setIdGallina(0002);
        gallina2.setEdad(4);
        gallina2.setHuevosPuestos(2);
        System.out.println("La segunda gallina a sido creada..");
        System.out.println("\nPrimer gallina");
        gallina1.mostrarEstado();
        System.out.println("\nSegunda gallina");
        gallina2.mostrarEstado();
        System.out.println("\nSimulando acciones...");
        gallina1.ponerHuevo();
        gallina1.envejecer();
        gallina2.ponerHuevo();
        gallina2.envejecer();
        System.out.println("\nEstados finales:");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        System.out.println("\n=============================\n");
        System.out.println("Creando Nave Espacial..");
        NaveEspacial nave1 = new NaveEspacial();
        nave1.setNombre("ALCON 001");
        nave1.setCombustible(50);
        System.out.println("\nEstado inicial de la nave..");
        nave1.mostrarEstado();
        
        //Intentar avanzar 60 unidades
        System.out.println("Intentando mover 60 unidades sin recargar");
        nave1.despegar();
        nave1.avanzar(60);
        System.out.println("Intentando mover 40 unidades sin recargar");
        nave1.recargarCombustible(40);
        System.out.println("Mover las 60 unidades despues de recargar");
        nave1.avanzar(60);
        System.out.println("\nEstado Final.");
        nave1.mostrarEstado();
    }
    
}
