import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) throws Exception {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();

            if (num % 2 ==0){
                System.out.println("el numero es par");
            }else{
                System.out.println("el numero es impar");
            }
            
        }
    }
}