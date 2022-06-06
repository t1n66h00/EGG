import java.util.Scanner;

public class ej22 {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner (System.in)) {
            int dimension,cont1d=0,cont2d=0;
            System.out.println("Ingrese la dimension del vector");
            do{
                dimension=leer.nextInt();
            }while(dimension<0);
            int vector[];
            vector = new int [dimension];
            for (int i=0; i<dimension; i++){
                vector[i] = (int)(Math.random()*(99-(-99)+1)+(-99));
                System.out.println(vector[i]);
                if (vector[i]>=(-9) && (9)<=vector[i]){
                   cont1d=cont1d+1;
                }else if ((vector[i]>=(-99) && vector[i]<=-10)||(vector[i]>=10 && vector[i]<=99))
                    cont2d=cont2d+1;
            }
            System.out.print("1D "+ cont1d);
            System.out.print("2D "+ cont2d);
        }
        
    }
    
}