import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) throws Exception {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingrese una frase");
            String frase = leer.nextLine();
            String aux = frase.substring(0,1);

            if (aux.equals("a")){
                System.out.println("correcto");
            }else{
                System.out.println("incorrecto");
            }
            
        }
    }
}