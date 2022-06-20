
package servicio;

import java.util.Scanner;
import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Comparator;

public class ServicioPelicula {
    private ArrayList<Pelicula> listaPeliculas; // Creo la lista
    private Scanner leer; // Creo el Scanner para utilizar en toda mi clase
    
    public ServicioPelicula() {
        this.listaPeliculas = new ArrayList<>(); // Creo el espacio en memoria del LISTA
        this.leer = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
    }

    
     public void crearPeliculas() {
     System.out.println("Ingrese el titulo de la pelicula");
     String titulo = leer.next();
     titulo= titulo.toUpperCase();
     System.out.println("Ingrese el director de la pelicula");
     String director = leer.next();
     director= director.toUpperCase();
     System.out.println("Ingrese la duracion de la pelicula");
     Float duracion = leer.nextFloat();
     
     listaPeliculas.add(new Pelicula(titulo, director, duracion));
    }
     public void mostrarPeliculas() {
        // utilizo el FOREACH - ATAJO NETBEANS fore+TAB - Forma rapida de recorrer colecciones      
        for (Pelicula todos : listaPeliculas) {
            System.out.println(todos.toString());      
        }
    }
     
    
    public static Comparator<Pelicula> ordenarMayor = new Comparator<Pelicula>(){
        
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o2.getDuracion().compareTo(o1.getDuracion());
        }
    };
    
    //ordenar por duracion descendente
    public static Comparator<Pelicula> ordenarMenor = new Comparator<Pelicula>(){
        
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDuracion().compareTo(o2.getDuracion());
        }
    };

    //ordenar por titulo alfabeticamente
    public static Comparator<Pelicula> ordenarTitulo = new Comparator<Pelicula>(){
        
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getTitulo().compareTo(o2.getTitulo());
        }
    };
    
    //ordenar por duracion director
    public static Comparator<Pelicula> ordenarDirector = new Comparator<Pelicula>(){
        
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDirector().compareTo(o2.getDirector());
        }
    };
     
}

