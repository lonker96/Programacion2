
package trabajopractico4;
import java.util.Random;
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    private static final double AUMENTO_BASE = 0.10;
    
    //Constructor que solicita todos los valores
    public Empleado(int id,String nombre,String puesto,double salario){
        totalEmpleados++;
        setId(id);
        setNombre(nombre);
        setPuesto(puesto);
        setSalario(salario);
    }
    
    //Constructor que solicita solo dos valores.
        //Utilizacion de la clase Random para crear ids aleatorios de 4 digitos.
    public Empleado(String nombre,String puesto){
        totalEmpleados++;
        Random rand = new Random();  //Creando una instancia de la clase Random.
        setId(rand.nextInt(9000)+1000); // El numero sera como minimo 1000 hasta 9000 para asegurar 4 digitos.
        setNombre(nombre);
        setPuesto(puesto);
        setSalario(500.0);              //Ingresando un salario por defecto.
    }
    
    //Metodos getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //Metodo estatico para mostrar el total de empleados.
    public static void mostrarTotalEmpleados(){
        System.out.println("El total de empleados hasta ahora es: "+ totalEmpleados);
    }
    //Metodo para actualizar salario, que recibe el porcentaje de aumento.  
    public void actualizarSalario(double porcentaje){
        if(porcentaje > 0){     //Verificacion que el porcenjae sea positivo.
            double salarioBase = getSalario();       //Guardando el salario actual en una variable auxilia.
            double aumento = salarioBase *(porcentaje/100); //Calculando la cantidad de aumento.
            aumento = salarioBase + aumento;    //Cargando el aumento en la variable auxilia.
            setSalario(aumento);            //Seteando el nuevo salario.
        }else{
            System.out.println("ERROR!.. El valor ingresado como aumento es invalido");
        }
    }
    //Metodo para actualizar salario, por una cantidad fija.
    public void actualizarSalario(){
        double salarioBase = getSalario();       //Guardando el salario actual en una variable auxilia.
        double aumento = salarioBase * AUMENTO_BASE; //Calculando la cantidad de aumento.
        aumento = salarioBase + aumento;    //Cargando el aumento en la variable auxilia.
        setSalario(aumento);            //Seteando el nuevo salario.
    }
    
    //Metodo ToString
    @Override
    public String toString(){   
        return "Empleado {" + "Nombre= "+nombre
                +", Puesto = " + puesto
                +", Salario = "+ salario+"}";
    }
   
}

