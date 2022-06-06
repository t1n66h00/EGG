import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) throws Exception {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingrese una frase");
            String frase = leer.nextLine();

            if (frase.equals("eureka")){
                System.out.println("correcto");
            }else{
                System.out.println("incorrecto");
            }
            
        }
    }
}