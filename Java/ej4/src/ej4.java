import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) throws Exception {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingrese una cantidad de grados");
            int grados = leer.nextInt();
            int gradosf = 32 + (9 * grados / 5);
            System.out.println("resultado: " + gradosf);
        }
    }
}