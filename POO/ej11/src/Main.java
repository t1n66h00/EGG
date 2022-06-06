
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (//Scanner
        Scanner leer = new Scanner(System.in)) {
            //Variables
            int anio,mes,dia;
            System.out.println("Ingrese el día: ");
            dia = leer.nextInt();
            System.out.println("Ingrese el mes: ");
            mes = leer.nextInt();
            System.out.println("Ingrese el año");
            anio = leer.nextInt();

        Date fecha = new Date(anio, mes, dia);
            
        System.out.println(fecha);

        Date fechaactual = new Date();
        
        System.out.println(fechaactual);

        int resta;
        resta = (fechaactual.getYear()+1900)-fecha.getYear();
        System.out.println("Año ingresado: "+fecha.getYear());
        System.out.println("Año actual "+(fechaactual.getYear()+1900));
        System.out.println("Diferencia "+resta);    

        } 
    }  
}