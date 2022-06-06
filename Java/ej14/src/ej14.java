import java.util.Scanner;

public class ej14 {

    public static void main(String[] args) throws Exception {
        try (Scanner leer = new Scanner(System.in)) {
            int num, contador=0, suma=0;
            System.out.println("ingrese 20 num");
            do {
              contador=contador+1;
              num = leer.nextInt();
              if (num>0){
                suma=suma+num;
              }
              if(num==0 || contador==20){
                break;
              }
              } while (num!=0 || contador!=20 );
            
                System.out.println("la suma es: "+suma);
            
            
        }    
           
    }
}