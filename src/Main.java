public class Main {
    public static void main(String[] args) {
        //Creación objeto cliente con propiedades de Persona + variable credito
        Cliente cliente = new Cliente();
        cliente.edad = 21;
        cliente.nombre = "José Perez";
        cliente.telefono = 912345678;
        cliente.credito = 1000;

        System.out.println("El cliente : "+ cliente.nombre + "de "+ cliente.edad + " años de edad, con teléfono: "+cliente.telefono +" tiene crédito disponible de: "+cliente.credito + " dólares" );

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 25;
        trabajador.nombre = "Rafael Guzmán";
        trabajador.telefono = 123456789;
        trabajador.salario = 5000;

        System.out.println("El cliente : "+ trabajador.nombre + "de "+ trabajador.edad + " años de edad, con teléfono: "+trabajador.telefono +" tiene un salario de: "+trabajador.salario + " dólares" );
    }

    //Creación clase persona con variables
    static class Persona {
        int edad;
        String nombre;
        int telefono;}

    //Creación clase cliente con herencia de Persona
    static class Cliente extends Persona{
        int credito;
    }

    //Creación clase Trabajador con herencia de persona
    static class Trabajador extends Persona {
        int salario;
    }


}