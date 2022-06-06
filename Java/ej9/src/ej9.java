import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) throws Exception {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingrese una frase");
            String frase = leer.nextLine();
            int aux = frase.length();

            if (aux == 8){
                System.out.println("correcto");
            }else{
                System.out.println("incorrecto");
            }
            
        }
    }
}