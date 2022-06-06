package ej10;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner leer = new Scanner(System.in)) {
        //Creo Array = A
        double A[] = new double[50];
        double B[] = new double[20];
        //Lleno A con valores aleatorios
        for (int i = 0; i < A.length; i++) {
            A[i] = Math.random();
            System.out.println("");
        }
        //Ordenar Array = A
        Arrays.sort(A);
        //Dar los primeros diez valores al vector
        System.arraycopy(A, 0, B, 0, 9);
        for (int i = 10; i < 20; i++) {
            B[i]=0.5;
        }
        //Imprimir Vectores
        System.out.println("Vector A:");
        System.out.println("");
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
            System.out.println("");
        }
        
        System.out.println("Vector B:");
        System.out.println("");
        for (int i = 0; i < 20; i++) {
            System.out.println(B[i]);
            System.out.println("");
        }
    }
}


}
