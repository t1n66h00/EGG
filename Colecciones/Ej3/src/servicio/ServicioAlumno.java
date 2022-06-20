
package servicio;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioAlumno {

    private ArrayList<Alumno> listaAlumnos; // Creo la lista
    private Scanner leer; // Creo el Scanner para utilizar en toda mi clase

    public ServicioAlumno() {
        this.listaAlumnos = new ArrayList<>(); // Creo el espacio en memoria del LISTA
        this.leer = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
    }

    public void crearAlumnos() {
        System.out.println("Ingrese el nombre");
        String nombre = leer.next();
        nombre= nombre.toUpperCase();  
        System.out.println("ingrese la primer nota");
        Integer nota1 = leer.nextInt();
        System.out.println("ingrese la segunda nota");
        Integer nota2 = leer.nextInt();
        System.out.println("ingrese la tercer nota");
        Integer nota3 = leer.nextInt();
        listaAlumnos.add(new Alumno(nombre, nota1, nota2, nota3));
    }
    
    public void notaFinal(){
        
    }
   
}
