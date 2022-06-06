package ej6;

import java.util.Scanner;

public class Nespresso {
    public Scanner leer = new Scanner(System.in);

    private double capacidadmaxima;
    private double cantidadactual;

    //constructores
    public Nespresso() {
    }
    public Nespresso(Double capacidadmaxima, Double cantidadactual) {
        this.setCapacidadmaxima(capacidadmaxima);
        this.setCantidadactual(cantidadactual);
    }

    //getters y setters
    public double getCapacidadmaxima() {
        return capacidadmaxima;
    }
    public void setCapacidadmaxima(Double capacidadmaxima2) {
        this.capacidadmaxima = capacidadmaxima2;
    }
    public double getCantidadactual() {
        return cantidadactual;
    }
    public void setCantidadactual(Double cantidadactual2) {
        this.cantidadactual = cantidadactual2;
    }

    //metodos

    public void cafe(){
        capacidadmaxima= 2;
        System.out.println("ingrese la cantidad actual de la cafetera");
        cantidadactual = leer.nextInt();
        if (cantidadactual > capacidadmaxima){
            System.out.println("la cantidad de cafe no puede superar la capacidad maxima");
        }
   }
   public void menu(){
    int opcion =0;
    do{
        System.out.println("Ingrese una opcion");
        System.out.println("1: llenar cafetera");
        System.out.println("2: servir taza");
        System.out.println("3: vaciar cafetera");
        System.out.println("4: agregar cafe");
        System.out.println("5: salir");
        opcion = leer.nextInt();

            switch (opcion){
                case 1:
                    llenarcafetera();
                    break;
                    case 2:
                    servirtaza();
                    break;
                    case 3:
                    vaciarcafetera();
                    break;
                    case 4:
                    agregarcafe();
                    break;
                    case 5:
                    break;
                }
    }while(opcion !=5);
        
        
}
public void llenarcafetera(){
    cantidadactual=capacidadmaxima;
}
public void servirtaza(){
    System.out.println("ingrese la capacidad de la taza");
    double taza = leer.nextDouble();
    System.out.println("ingrese la cantidad de cafe que desea servir");
    double cafe = leer.nextDouble();
    taza=0+cafe;
    if (cafe < cantidadactual){
        System.out.println("la taza esta llena");
    }else{
        System.out.println("la taza no se lleno, tiene: "+taza+" l.");
    }

}
public void vaciarcafetera(){
    cantidadactual=0;
}
public void agregarcafe(){
    System.out.println("ingrese la cantidad de cafe que desea agregar a la cafetera ");
    double cafe = leer.nextDouble();
    cantidadactual = cafe+cantidadactual;
    if (cafe > capacidadmaxima || cafe > capacidadmaxima){
        System.out.println("la cantidad de cafe no puede superar la cantidad actual o la capacidad maxima");
    }
}
    
    
}
