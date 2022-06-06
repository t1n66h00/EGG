import java.util.Scanner;

public class ej15 {
    public static void main(String[] args) throws Exception {
        try (Scanner leer = new Scanner(System.in)) {
            int suma, resta, multiplicacion, division;
            System.out.println("ingrese dos numeros");
            int num1 = leer.nextInt();
            int num2 = leer.nextInt();
            suma=num1+num2;
            resta=num1-num2;
            multiplicacion=num1*num2;
            division=num1/num2;
            System.out.println("Ingrese una operacion");
            System.out.println("1: suma");
            System.out.println("2: resta");
            System.out.println("3: multiplicacion");
            System.out.println("4:division");
            System.out.println("5: salir");
            int opcion = leer.nextInt();

            if (opcion >=1 && opcion <=5) {
                
                switch (opcion){
                    case 1:
                    System.out.println(suma);
                    break;
                    case 2:
                    System.out.println(resta);
                    break;
                    case 3:
                    System.out.println(multiplicacion);
                    break;
                    case 4:
                    System.out.println(division);
                    break;
                    case 5:
                    break;

                }

            } else{System.out.println("opcion incorrecta");}
             
        }
    }
}