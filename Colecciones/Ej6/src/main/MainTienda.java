
package main;

import java.util.Scanner;
import servicio.ServicioTienda;

public class MainTienda {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ServicioTienda p = new ServicioTienda();

        System.out.println("Cuantos paises va a cargar???");
        byte cantidad = leer.nextByte();

        for (int i = 0; i < cantidad; i++) {
            p.crearProductos();
        }

        p.mostrarProductos(); 
               
        
      }
    
}
