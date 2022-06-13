
package App;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        String text="";

        Scanner leer = new Scanner(System.in);
        
        Perro Fun = new Perro();
        
        Fun.pedirYLlenar();
       
        Fun.Mostrar();
        
        Fun.Iter();
        
        Fun.Mostrar();
       
    }

}
