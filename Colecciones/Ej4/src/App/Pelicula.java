
package App;

import java.util.Scanner;

public class Pelicula {
  private Scanner leer = new Scanner(System.in);
  private String titulo;
  private String director;
  private float duracion;


    public String getTitulo() {
        return titulo;
    }
    public String getDirector() {
        return director;
    }
    
    public float getDuracion() {
        return duracion;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setNombre(float nombre) {
        this.duracion = duracion;
    }
    
     public void crearpelicula() {
     System.out.println("Ingrese el titulo de la pelicula");
     titulo = leer.next();
     System.out.println("Ingrese el director de la pelicula");
     director = leer.next();
     System.out.println("Ingrese la duracion de la pelicula");
     duracion = leer.nextFloat();
    }
     
     public void mostrarPeliculas(){ 
        System.out.println("Nombre: "+ titulo + ", Director: "+ director + ", Dureacion: "+ duracion);
    }
     
}

