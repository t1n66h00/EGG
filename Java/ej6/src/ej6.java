
import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) throws Exception {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingrese dos numeros enteros");
            int num1 = leer.nextInt();
            int num2 = leer.nextInt();

            if (num1>num2){
                System.out.println("el numero mayor es: "+num1);
               

            }
            else{
                System.out.println("el numero mayor es: "+num2);
            }
            if (num1==num2){
                System.out.println("los dos numeros son iguales");
            }
        }
    }
}