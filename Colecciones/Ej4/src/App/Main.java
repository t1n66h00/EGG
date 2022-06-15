
package App;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
    Scanner leer = new Scanner(System.in);
    Pelicula pelicula = new Pelicula();
    ArrayList<Pelicula> listaPeliculas = new ArrayList();
    String selector;
    
    do{
        pelicula.crearpelicula();
        listaPeliculas.add(pelicula);
        System.out.println("Desea ingresar otra pelicula?");
        do{
        selector = leer.next();
        }while(!"no".equals(selector)&&!"si".equals(selector));
    }while(!"no".equals(selector));
    for (int i=0; i<listaPeliculas.size(); i++){
        pelicula.mostrarPeliculas();
    }
    
    }
}
