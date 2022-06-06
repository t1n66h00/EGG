import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) throws Exception {
        try (Scanner leer = new Scanner(System.in)) {
            int num; int limite; int suma;
            System.out.println("Ingrese un numero limite");
            limite = leer.nextInt();
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            suma=num;
            while (suma <= limite ){
                System.out.println("Ingrese otro numero");
                num = leer.nextInt();
                suma=suma+num;
                }
            System.out.println(suma+" se paso del limite");
            } 
           
    }
}