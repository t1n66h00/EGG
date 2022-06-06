package ej7;
public class Main {
    public static void main(String[] args) throws Exception {


        Persona p1= new Persona();
        Persona p2= new Persona();
        Persona p3= new Persona();
        Persona p4= new Persona();

        System.out.println("ingrese los datos de la primer persona");
        p1.crearPersona();
        p1.calcularMC();
        p1.esmayordeedad();
        System.out.println("ingrese los datos de la segunda persona");
        p2.crearPersona();
        p2.calcularMC();
        p2.esmayordeedad();
        System.out.println("ingrese los datos de la tercer persona");
        p3.crearPersona();
        p3.calcularMC();
        p3.esmayordeedad();
        System.out.println("ingrese los datos de la cuarta persona");
        p4.crearPersona();
        p4.calcularMC();
        p4.esmayordeedad();
    }
}
