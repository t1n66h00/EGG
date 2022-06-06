import java.util.Scanner;

public class ej16 {
    public static void main(String[] args) throws Exception {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingrese una frase");
            String frase = leer.nextLine();
            int longitud = frase.length();
            String primer = frase.substring(0,1);
            String ultimo = frase.substring(4,5);
            

            if (longitud ==5 && primer.equals("x") && ultimo.equals("o")){
                System.out.println("correcto");
            }else{
                System.out.println("incorrecto");
            }
            
        }
    }
}