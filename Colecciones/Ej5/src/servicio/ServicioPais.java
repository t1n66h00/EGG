
package servicio;


import entidad.Pais;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioPais {

    private HashSet<Pais> listaPaises;
    private Scanner leer;

    public ServicioPais() {
        this.listaPaises = new HashSet<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void crearPaises() {
        System.out.println("Ingrese el nombre");
        String pais = leer.next();
        pais = pais.toUpperCase();     
        
        listaPaises.add(new Pais(pais));     
    }

    public void mostrarPaises() {
              
        for (Pais pais : listaPaises) {
            System.out.println(pais.toString());      
        }
    }

    public void eliminarPaises(String pais) {
      
        Iterator<Pais> it = listaPaises.iterator();
        while (it.hasNext()) {
            if (it.next().getPais().equals(pais)) {
                it.remove();
            }
        }
    }    
    
    
}