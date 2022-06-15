
package main;

import servicio.ServicioAlumno;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ServicioAlumno a = new ServicioAlumno(); // Llamo a mi clase SERVICIO para acceder a los metodos correspondientes

        System.out.println("Cuantas personas va a cargar???");
        byte cantidad = leer.nextByte(); // Para que me diga el usuario cuantas quiere crear

        for (int i = 0; i < cantidad; i++) {
            a.crearAlumnos(); // Invoco al metodo para cargar una persona, utilizo un FOR para crear las q quiera el Sr
        }
        
       System.out.println("Ingrese el alumno para sacar el promedio");
        String nombre = leer.next();
        nombre = nombre.toUpperCase();

    }
    
}
