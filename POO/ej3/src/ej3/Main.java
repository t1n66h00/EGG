package ej3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            Operacion op = new Operacion();
            System.out.println("Ingrese dos valores para operar: ");
            double numero1 = leer.nextDouble();
            double numero2 = leer.nextDouble();
            
            op.crearOperacion(numero1, numero2);

            op.sumar(numero1, numero2);
            op.restar(numero1, numero2);
            op.multiplicar(numero1, numero2);
            op.dividir(numero1, numero2);

            System.out.println(op.toString());
        }
    }

}
