package unidad3;

/**
 *
 * @author lucas
 */
public class Gallina {
    
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
    
    //Metodos requeridos:
    //ponerHuevo(), envejecer(), mostrarEstado().
    
    public void envejecer(){ //Metodo para envejecer 1 anio las gallinas
        setEdad(edad+=1);
        System.out.println("La gallina (" + idGallina + ") a envejecido un anio.\nSu edad actual es: " + edad + " anios");
    }
    
    public void ponerHuevo(){  //Metodo para que la gallina ponga un huevo
        setHuevosPuestos(huevosPuestos+=1);
        System.out.println("La gallina (" + idGallina + ") a puesto un huevo.\nLleva puestos: " + huevosPuestos + " huevos");
    }
    
    public void mostrarEstado(){ //Metodo para mostrar la info de los objetos
        System.out.println("Gallina ID : " + idGallina);
        System.out.println("Edad: " + edad);
        System.out.println("Cantidad de huevos puestos: " + huevosPuestos);
    }
}
