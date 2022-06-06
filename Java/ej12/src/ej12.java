import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) throws Exception {
        try (Scanner leer = new Scanner(System.in)) {
            int num;
            do{
                System.out.println("Ingrese una nota entre 1 y 10");
                num = leer.nextInt();
    
                if (num >= 0 && num <=10 ){
                    System.out.println("la nota esta entre 1 y 10");
                    break;
                }
                

            } while (num < 0 || num >10 );

           
        }
    }
}