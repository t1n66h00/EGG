package ej8;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
       try (Scanner leer = new Scanner(System.in).useDelimiter("\n")) {
        String frase2;
           Cadena c1= new Cadena();
           System.out.println(" Ingresar una frase");
           c1.setFrase(leer.nextLine());
           c1.setLongitud(+c1.getFrase().length());
           System.out.println(" La cantidad de letras de la frase son "+c1.getFrase().length());
           c1.getLongitud();
           c1.mostrarVocales();
           c1.invertirFrase();
           System.out.println(" Ingresar una letra que quiera saber cuantas veces se repite en "+c1.getFrase());
           String letra=leer.next();
           c1.vecesRepetido(letra);
           System.out.println(" Ingresa una segunda frase para comparar con " +c1.getFrase());
           frase2=leer.next();//si pongo nextline no me deja colocar el resultado por eso coloco solo next
           c1.compararLongitud(frase2);
           System.out.println(" Escribir una frase para concatenar con "+c1.getFrase());
           String frase3=leer.next();
           c1.unirFrases(frase3);
           System.out.println(" Elija un caracter para reemplaza la letra a de la frase "+c1.getFrase());
           String letra2=leer.next();
           c1.reemplazar(letra2);
           System.out.println("Ingrese una letra que quiera que se busque en la frase "+c1.getFrase());
           String letra3=leer.next();
           c1.contiene(letra3);
    }
       
       
    }
    
}
