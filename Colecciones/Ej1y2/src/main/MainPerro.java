
package main;


import java.util.Scanner;
import servicio.ServicioPerro;

public class MainPerro {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ServicioPerro p = new ServicioPerro(); // Llamo a mi clase SERVICIO para acceder a los metodos correspondientes

        System.out.println("Cuantas razas va a cargar???");
        byte cantidad = leer.nextByte(); // Para que me diga el usuario cuantas quiere crear

        for (int i = 0; i < cantidad; i++) {
            p.crearRazas(); // Invoco al metodo para cargar una persona, utilizo un FOR para crear las q quiera el Sr
        }

        p.mostrarRazas(); // Invoco al metodo de imprimir 
        
        System.out.println("Ingrese la raza que desea eliminar de la lista");
        String raza = leer.next();
        raza = raza.toUpperCase();

        p.eliminarRazas(raza);//LLAMO AL METODO y envio a quien quiero eliminar. "OJO CON ELIMINARME A MI JAJAJ"
        // LLAMO AL METODO PARA ORDENAR 
        p.mostrarRazas(); // Invoco al metodo de imprimir , para ver que se fue.....
        
    }

}
