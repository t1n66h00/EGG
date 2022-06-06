import java.util.Scanner;

public class ej18 {
    public static void main(String[] args) throws Exception {
        try (Scanner leer = new Scanner(System.in)) {
            int num1, num2,num3,num4,aux;
            System.out.println("Ingrese 4 numeros ");
        num1= leer.nextInt();
        num2= leer.nextInt();
        num3= leer.nextInt();
        num4= leer.nextInt();
        if (num1<20) {
            System.out.print(num1);
            for (aux = 0; aux < num1; aux++) {
                System.out.print(" *");
            }
            }else {
            System.out.print("El numero ingresado en invalido");
        } System.out.println(" ");
        if (num2<20) {
            System.out.print(num2);
            for (aux = 0; aux < num2; aux++) {
                System.out.print(" *");
            }
            }else {
            System.out.print("El numero ingresado en invalido");
        }System.out.println(" ");
        if (num3<20) {
            System.out.print(num3);
            for (aux = 0; aux < num3; aux++) {
                System.out.print(" *");
            }
            }else {
            System.out.print("El numero ingresado en invalido");
        } System.out.println(" ");
        if (num4<20) {
            System.out.print(num4);
            for (aux = 0; aux < num4; aux++) {
                System.out.print(" *");
        }
        }else {
            System.out.print("El numero ingresado es invalido");
    
        }
        }
    }
}