package unidad3;

/**
 *
 * @author lucas
 */
public class NaveEspacial {
    private String nombre;
    private int combustible;
    private static final int MAX_COMBUSTIBLE = 100;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
    
    //Mostrar requeridos
    //despegar(), avanzar(distancia), recargarCombustible(cantidad), mostrarEstado()
    
    //Metodo recargarCombustible
    public void recargarCombustible(int cantidad){
        if(cantidad > 0){  //validacion la cantidad es negativa
            if(combustible + cantidad <= MAX_COMBUSTIBLE){  //Caso TRUE, valida la recarga no supera el maximo de combustible
                combustible+=cantidad;          //Caso TRUE, recarga el combustible
                System.out.println("\nNave "+ nombre +" esta recargando combustible...");
                System.out.println("Nave "+nombre+" a recargado con exito " + cantidad + " unidades de combustible");
                System.out.println("La nave "+nombre+" ahora tiene "+combustible+" unidades de combustible.");
            }else{                               //Caso FALSE, la recarga supera el limite maximo de combustible.
                combustible= MAX_COMBUSTIBLE;
                System.out.println("\nNave "+ nombre +" esta recargando combustible...");
                System.out.println("Nave "+nombre+" a recargado con exito la cantidad maxima de unidades de combustible");
                System.out.println("La nave "+nombre+" ahora tiene "+combustible+" unidades de combustible.");
            }
           }else{                         //Caso FALSE, la cantidad de combustible ingresada es negativa
                System.out.println("\nERROR la cantidad de combustible ingresada es invalida.");
        }
    }
    
    //Metodo avanzar 
        //consume 1 unidad de combustible x 1 unidad de distancia
    public void avanzar(int distancia){
        if(distancia > 0){  //validacion la distancia es negativa
            if(combustible >= distancia){  //Caso TRUE, valida si alcanza el combustible para la distancia requerida
                combustible-=distancia;          //Caso TRUE, resta la distancia al combustible y da los avisos correspondientes por consola
                System.out.println("\nNave "+ nombre +" se mueve...");
                System.out.println("Nave "+nombre+" se a movido con exito " + distancia + " unidades de distancia");
                System.out.println("La nave "+nombre+" ahora tiene "+combustible+" unidades de combustible.");
            }else{                               //Caso FALSE, no alcanza el combustible y avisa por consola
                System.out.println("\nERROR la nave "+nombre+" no posee el combustible suficiente para moverse "+ distancia +" unidades de distancia");
            }
           }else{                         //Caso FALSE, la distancia ingresada es negativa, no recorre y avisa por consola
                System.out.println("\nLas unidades de distancia ingresadas son invalidas");
               
        }
    }
    //Metodo despegar
        //Verifica si la nave tiene almenos 10 unidades de combustible y despega
    public void despegar(){
        if(combustible >=10){ //Verifica si tiene almenos 10 unidades de combustible.
            combustible-=10;            //Caso TRUE, resta 10 unidades de combustible y da los avisos correspondientes de despegue por consola
            System.out.println("\nNave "+nombre+" a despegado con exito!");
            System.out.println("Combustible restante "+combustible+" unidades.");
        }else{                          //Caso FALSE, no hay suficiente combustible, no despega y da los avisos por consola.
            System.out.println("\nERROR en el despegue, no hay suficiente combustible para despegar");
            System.out.println("Para despegar se requieren 10 unidades de combustible como minimo.");
        }
    }
    
    public void mostrarEstado(){ //Metodo para mostrar la info de los objetos
        System.out.println("Nave nombre: " + nombre);
        System.out.println("cantidad de combustible: " + combustible + " unidades");
    }
}
