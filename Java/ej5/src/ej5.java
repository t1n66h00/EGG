import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) throws Exception {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingrese un numero");
            int num = (int) leer.nextDouble();
            int doble = num*2;
            int triple = num*3;
            int raiz = (int) Math.sqrt(num);
            System.out.println("el doble es: "+doble+" el triple es: "+triple+" y la raiz es: "+raiz);
        }
    }
}
