
package servicio;

import entidad.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioPerro {

    private ArrayList<Perro> listaRazas; // Creo la lista
    private Scanner leer; // Creo el Scanner para utilizar en toda mi clase

    //Esta es una muy buena practica
    public ServicioPerro() {
        this.listaRazas = new ArrayList<>(); // Creo el espacio en memoria del LISTA
        this.leer = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
    }

    //Metodo para que el usuario carague los DATOS de forma manual
    public void crearRazas() {
        System.out.println("Ingrese el nombre");
        String raza = leer.next();
        raza = raza.toUpperCase();     
        
        listaRazas.add(new Perro(raza));     
    }

    public void mostrarRazas() {
        // utilizo el FOREACH - ATAJO NETBEANS fore+TAB - Forma rapida de recorrer colecciones      
        for (Perro razas : listaRazas) {
            System.out.println(razas.toString());      
        }
    }

    public void eliminarRazas(String raza) {
        // Uso el iterador, porque si uso FOREACH da error
        Iterator<Perro> it = listaRazas.iterator();
        while (it.hasNext()) {
            if (it.next().getRaza().equals(raza)) { // Si se cumple la condicion de encontrar "Ese apellido elegido,lo elimina)
                it.remove();
            }
        }
    }
    
}
