package ej4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner leer = new Scanner(System.in)) {
            // Nacimiento del Rectangulo
            Rectangulo r1 = new Rectangulo();

            System.out.println("Ingrese dos valores para operar: ");
            int base = leer.nextInt();
            int altura = leer.nextInt();
            //Asigno atributos
            r1.crearRectangulo(base, altura);
            r1.CalcularSuperficie(base, altura);
            r1.CalcularPerimetro(base, altura);
            r1.ImprimirRectangulo();
            System.out.println(r1.toString());
        }
    }

}