package ej2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingrese el valor del radio: ");
            int radio = leer.nextInt();
            
            Circunferencia c = new Circunferencia();

            c.crearCircunferencia(radio);

            c.area(radio);
            c.perimetro(radio);
            
            System.out.println(c.toString());
        }
    }

}
