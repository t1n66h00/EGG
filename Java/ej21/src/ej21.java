import java.util.Scanner;

public class ej21 {

    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            int tamaño, numero, contador=0;
        System.out.println("ingrese el tamaño del vector");
        tamaño = leer.nextInt();
        
        int vector[] = new int[tamaño];
        System.out.println("ingrese el numero que desea buscar");
        numero=leer.nextInt();
        
        for (int i =0; i < tamaño; i++) {
           vector[i] = (int) (Math.random()*10);
           System.out.println(vector[i]);
           if (vector[i] == numero){
               System.out.println("el numero "+numero+" se encuentra en la posicion "+ i);
               contador=contador+1;
           }        
        }
        System.out.println("se encontro el numero "+numero +", "+contador+" veces");
            }
        
    }

}