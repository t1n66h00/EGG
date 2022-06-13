
package App;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Perro {

    Scanner leer;
    private ArrayList<String> razas;

    public Perro() {
        this.leer = new Scanner(System.in);
        this.razas = new ArrayList();
    }

    String raze,text;

    public Perro(String name) {
        this.raze = name;
    }

    public void pedirYLlenar() {
        System.out.println("Se le pedirá una raza de perro, cuando quiera finalizar el programa ingrese ''exit''");

        do {
            System.out.println("Ingrese una raza de perro");
            raze = leer.nextLine();
            if ((!raze.equals("exit"))) {
                razas.add(raze);
            }
        } while (!raze.equals("exit"));
    }

    public void Mostrar() {
        System.out.println("Se mostrará los datos almacenados en el arraylist: ");
        for (String aux : razas) {
            System.out.println(aux);
        }
        System.out.println("El tamaño del arraylist es de " + razas.size());
    }

    public void Iter() {
        System.out.println("Ingrese una raza para eliminarla: ");
        text = leer.nextLine();
        
        Iterator<String> iter = razas.iterator();
       
        while (iter.hasNext()) {
            String aux = iter.next();
            if (aux.equals(text)) {
                iter.remove();
            }
            if (!aux.equals(text)) {
                System.out.println("La raza "+text+" no se encuentra en la lista.");
            }
        }
    }

}
