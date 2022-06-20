
package main;

import servicio.ServicioPelicula;
import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
    Scanner leer = new Scanner(System.in);
    ServicioPelicula pelicula = new ServicioPelicula();
    ArrayList<ServicioPelicula> listaPeliculas = new ArrayList();
    String selector;
    int menu;
    
    do{
        pelicula.crearPeliculas();
        listaPeliculas.add(pelicula);
        System.out.println("Desea ingresar otra pelicula?");
        do{
        selector = leer.next();
        }while(!"no".equals(selector)&&!"si".equals(selector));
    }while(!"no".equals(selector));
    
        System.out.println("Seleccione que desea hacer");
        System.out.println("1- Mostrar todas las peliculas");
        System.out.println("2- Mostrar peliculas que duran mas de una hora");
        System.out.println("3- Ordenar segun duracion (mayor a menor)");
        System.out.println("4- Ordenar segun duracion (menor a mayor)");
        System.out.println("5- Ordenar alfabeticamente por titulo");
        System.out.println("6- Ordenar alfabeticamente por director");
        
        menu = leer.nextInt();
        
        switch(menu){
                case 1:
                 for(int i=0; i<listaPeliculas.size(); i++){
                        pelicula.mostrarPeliculas();
                    }
                case 2:
                    for(int i=0; i<listaPeliculas.size(); i++){
                       if(listaPeliculas.get(i).getDuracion()>1){
                           pelicula.mostrarPeliculas();
                       }
                   }
                    break;
                case 3:
                    Collections.sort(listaPeliculas, ServicioPelicula.ordenarMayor);
                      for(int i=0; i<listaPeliculas.size(); i++){
                        pelicula.mostrarPeliculas();
                    }
                    break;
                case 4:  
                    Collections.sort(listaPeliculas, ServicioPelicula.ordenarMenor);
                      for(int i=0; i<listaPeliculas.size(); i++){
                        pelicula.mostrarPeliculas();
                    }
                    break;
                case 5:
                   Collections.sort(listaPeliculas, ServicioPelicula.ordenarTitulo);
                      for(int i=0; i<listaPeliculas.size(); i++){
                        pelicula.mostrarPeliculas();
                    }
                    break;
                case 6: 
                    Collections.sort(listaPeliculas, ServicioPelicula.ordenarDirector);
                      for(int i=0; i<listaPeliculas.size(); i++){
                        pelicula.mostrarPeliculas();
                    }
                    break;
                case 7: 
                    System.out.println("Gracias por usar nuestro sistema");
                    break;     
            }               
        }
    
    }
