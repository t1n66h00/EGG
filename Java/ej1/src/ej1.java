import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) throws Exception {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingrese dos numeros enteros");
            int num1 = leer.nextInt();
            int num2 = leer.nextInt();
            int suma = num1+num2;
            System.out.println("suma: " + suma);
        }
    }
}
