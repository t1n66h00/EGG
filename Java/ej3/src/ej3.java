import java.util.Scanner;
public class ej3 {
    public static void main(String[] args) {
        
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingrese una frase");
            String frase;
            frase = leer.nextLine();
            System.out.println(frase.toLowerCase());
            System.out.println(frase.toUpperCase());
        }
        
    }
}
