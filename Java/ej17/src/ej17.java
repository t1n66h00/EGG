import java.util.Scanner;
 
public class ej17 {
 
    public static void main(String[] args) {
       
        try (Scanner leer = new Scanner(System.in)) {
            int tamano, lado1, lado2;
            System.out.println("Por favor ingrese el tamaño del cuadrado: ");
            tamano = leer.nextInt();
      
                for( lado1 = 0; lado1 < tamano; lado1++) {
                    System.out.print("*");
                }
                System.out.println();
               
                for( lado1 = 0; lado1 < tamano-2; lado1++) {
                    System.out.print("*");
                    for( lado2 = 0; lado2 < tamano-2; lado2++) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                }
               
                for( lado1 = 0; lado1 < tamano; lado1++) {
                    System.out.print("*");
                }
        }
               
 
    }
}