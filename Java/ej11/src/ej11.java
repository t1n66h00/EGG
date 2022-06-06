import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) throws Exception {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingrese una opcion del 1 al 4");
            int opcion = leer.nextInt();

            if (opcion >=1 && opcion <=4) {
                
                switch (opcion){
                    case 1:
                    System.out.println("La bomba es una bomba de agua");
                    break;
                    case 2:
                    System.out.println("La bomba es una bomba de gasolina");
                    break;
                    case 3:
                    System.out.println("La bomba es una bomba de hormigon");
                    break;
                    case 4:
                    System.out.println("La bomba es una bomba de pasta alimenticia");
                    break;

                }

            }  else {
                System.out.println("No existe un valor válido para tipo de bomba");
            }   
        }
    }
}