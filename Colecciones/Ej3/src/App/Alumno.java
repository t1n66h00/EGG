
package App;

import java.util.List;
import java.util.Scanner;

public class Alumno {
  private Scanner leer = new Scanner(System.in);
  private String nombre;
  private int nota1;
  private int nota2;
  private int nota3;
  private float promedio;
 public void crearalumno (){
     System.out.println("Ingrese el nombre del alumno");
     nombre = leer.next();
     System.out.println("Ingrese la 1 nota");
     nota1 = leer.nextInt();
     System.out.println("Ingrese la 2 nota");
     nota2 = leer.nextInt();
     System.out.println("Ingrese la 3 nota");
     nota3 = leer.nextInt();
     promedio = (nota1+nota2+nota3)/3;
    
 }

    public int getNota1() {
        return nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public float getPromedio() {
        return promedio;
    }

    public String getNombre() {
        return nombre;
    }
  
}
