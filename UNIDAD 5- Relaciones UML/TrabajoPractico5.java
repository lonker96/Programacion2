
package trabajopractico5;

/**
 *
 * @author lucas
 */
public class TrabajoPractico5 {

    public static void main(String[] args) {
        System.out.println("======================================================================================\nEjercicio 1:");
        Pasaporte pasaporte1 = new Pasaporte("33","21/09/2025","Imagen_1","PNG"); //Se crea la instancia pasaporte enviando tambien los parametros para crear la instancia foto.
        Titular titular1 = new Titular("Lucas","123456789");
        titular1.setPasaporte(pasaporte1);// solo un setter necesario
        System.out.println("Datos del pasaporte..");
        System.out.println(pasaporte1);
        System.out.println("Datos de titular..");
        System.out.println(titular1);
        System.out.println("======================================================================================\nEjercicio 2:");
        Bateria bateria1 = new Bateria("KFC12","83%");
        Celular celular1 = new Celular("FHJ359","Samsung","ZFLIP7",bateria1);
        Usuario usuario1 = new Usuario("Lucas","123456789");
        usuario1.setCelular(celular1); // Solo un setter necesario.
        System.out.println(celular1);
        System.out.println("======================================================================================\nEjercicio 3:");
        Editorial editorial1 = new Editorial("Editorial Gorditos","Calle Falsa 123");
        Libro libro1 = new Libro("Los Juegos del Hambre","1538BNO",editorial1); //Agregacion.
        Autor autor1 = new Autor("Pepe","Argentina");
        libro1.setAutor(autor1);  //Asociacion Unidireccional.
        System.out.println(libro1);
        System.out.println("======================================================================================\nEjercicio 4:");
        Banco banco1 = new Banco("BBVA","30-589632-1");
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("1452 1536 5978 5639", "08/32",banco1);
        Cliente cliente1 = new Cliente("Lucas","123456789");
        tarjeta1.setCliente(cliente1); // Solo un setter necesario
        System.out.println(tarjeta1);
        System.out.println("======================================================================================\nEjercicio 5:");
        Computadora compu1 = new Computadora("Intel","FKR28213","GIGABYTE","COFEE LAKE");
        Propietario propietario1 = new Propietario("Lucas","123456789");
        compu1.setPropietario(propietario1);
        System.out.println(compu1);
        System.out.println("======================================================================================\nEjercicio 6:");
        Mesa mesa1 = new Mesa("Nro8","10 personas");
        Reserva reserva1 = new Reserva("22/09/2025","09:00HS",mesa1);
        reserva1.setCliente(cliente1);
        System.out.println(reserva1);
        System.out.println("======================================================================================\nEjercicio 7:");
        Conductor conductor1= new Conductor("Lucas","Tipo A");
        Motor motor1 = new Motor("1.0","AKGJ123429");
        Vehiculo auto1 = new Vehiculo("AF236595","MODELO 2",motor1);
        auto1.setConductor(conductor1);
        System.out.println(auto1);
        System.out.println("======================================================================================\nEjercicio 8:");
        Usuario2 usuario2 = new Usuario2("Lucas","Lucas@hotmail.com");
        Documento documento1 = new Documento("Primer documento","La firma digital y el usuario","5e71d4ffc3a0723b1bcc","24/09/2025",usuario2);
        System.out.println(documento1);
        System.out.println("======================================================================================\nEjercicio 9:");
        Profesional profesional1 = new Profesional("Maria","Oculista");
        Paciente paciente1 = new Paciente("Lucas","ObraPlus");
        CitaMedica cita1 = new CitaMedica("24/09/2025","20:37HS");
        cita1.setPaciente(paciente1);
        cita1.setProfesional(profesional1);
        System.out.println(cita1);
        System.out.println("======================================================================================\nEjercicio 10:");
        Titular2 titular2 = new Titular2("Lucas","123456789");
        CuentaBancaria cuenta1 = new CuentaBancaria("123456789101112","1.996","123456","24/09/2025");
        cuenta1.setTitular(titular2);
        System.out.println(cuenta1);
        System.out.println("======================================================================================\nEjercicio 11:");
        Reproductor reproductor1 = new Reproductor();
        Artista artista1 = new Artista("Lali","Pop");
        Cancion cancion1 = new Cancion ("Obsesion",artista1);
        reproductor1.reproducir(cancion1);
        reproductor1.setEncendido(true);
        reproductor1.reproducir(cancion1);
        System.out.println("======================================================================================\nEjercicio 12:");
        Contribuyente contribuyente1 = new Contribuyente("Lucas","20-12345678-1");
        Calculadora calculadora = new Calculadora();
        Impuesto impuesto = new Impuesto(192.02);
        impuesto.setContribuyente(contribuyente1);
        calculadora.calcular(impuesto);
        System.out.println("======================================================================================\nEjercicio 13:");
        GeneradorQR generador1 = new GeneradorQR();
        generador1.generar("123456789", usuario2);
        System.out.println("======================================================================================\nEjercicio 14:");
        Proyecto proyecto1 = new Proyecto("Primer proyecto","24:00 mins");
        EditorVideo editor1 = new EditorVideo();
        editor1.exportar("PNG", proyecto1);
    }
    
}
