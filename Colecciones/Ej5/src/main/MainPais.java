
package main;

import java.util.Scanner;
import servicio.ServicioPais;

public class MainPais {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ServicioPais p = new ServicioPais();

        System.out.println("Cuantos paises va a cargar???");
        byte cantidad = leer.nextByte();

        for (int i = 0; i < cantidad; i++) {
            p.crearPaises();
        }

        p.mostrarPaises(); 
        
        System.out.println("Ingrese el pais que desea eliminar de la lista");
        String pais = leer.next();
        pais = pais.toUpperCase();

        p.eliminarPaises(pais);
        
        p.mostrarPaises();
        
        
        
        
        
      }
    }