
package servicio;

import entidad.Tienda;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioTienda {

    private HashSet<Tienda> listaProductos;
    private Scanner leer;

    public ServicioTienda() {
        this.listaProductos = new HashSet<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void crearProductos() {
        System.out.println("Ingrese el producto");
        String producto = leer.next();
        producto = producto.toUpperCase();     
        System.out.println("ingrese el precio");
        Float precio = leer.nextFloat();
        listaProductos.add(new Tienda(producto, precio));     
    }

    public void mostrarProductos() {
              
        for (Tienda pais : listaProductos) {
            System.out.println(pais.toString());      
        }
    }

    public void eliminarProductos(String producto) {
      
        Iterator<Tienda> it = listaProductos.iterator();
        while (it.hasNext()) {
            if (it.next().getProducto().equals(producto)) {
                it.remove();
            }
        }
    }    
    
    
}