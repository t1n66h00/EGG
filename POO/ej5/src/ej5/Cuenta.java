package ej5;

import java.util.Scanner;

public class Cuenta {
    public Scanner leer = new Scanner(System.in);

    private int numerocuenta;
    private int dni;
    private double saldo;
    
    //constructores
    public Cuenta() {
    }
    public Cuenta(int numerocuenta, int dni, double saldo, double interes) {
        this.setNumerocuenta(numerocuenta);
        this.setDni(dni);
        this.setSaldo(saldo);
    }
    //getters y setters
    public int getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(int numerocuenta) {
        this.numerocuenta = numerocuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }

    //metodos

    public void cuenta(){
         System.out.println("ingrese su numero de cuenta");
         numerocuenta = leer.nextInt();
         System.out.println("ingrese su dni");
         dni = leer.nextInt();
         System.out.println("ingrese su saldo actual");
         saldo = leer.nextDouble();
    }
    public void menu(){
        int opcion =0;
        do{
            System.out.println("Ingrese una opcion");
            System.out.println("1: ingresar");
            System.out.println("2: retiro");
            System.out.println("3: extraccion rapida");
            System.out.println("4: cosultar saldo y datos de la cuenta");
            System.out.println("5: salir");
            opcion = leer.nextInt();

                switch (opcion){
                    case 1:
                        ingresar();
                        break;
                        case 2:
                        retiro();
                        break;
                        case 3:
                        extraccionRapida();
                        break;
                        case 4:
                        consultardatosysaldo();
                        break;
                        case 5:
                        break;
                    }
        }while(opcion !=5);
            
            
    }
    public void ingresar(){
        System.out.println("declare la cantidad de dinero a ingresar");
        double ingreso = leer.nextDouble();
        saldo = saldo+ingreso;

    }
    public void retiro(){
        System.out.println("declare la cantidad de dinero a retirar");
        double retiro = leer.nextDouble();
        if (retiro > saldo){
            saldo=0;
            System.out.println("su saldo es insuficiente");
        }else{
            saldo=saldo-retiro;
        }
    }
    public void extraccionRapida(){
        System.out.println("declare la cantidad de dinero a extraer");
        double extraccionRapida = leer.nextDouble();
        double veinte = 0.2*saldo;
        if(extraccionRapida>veinte){
            System.out.println("no es posible retirar mas del 20% de su sueldo");
        }else{
            saldo = saldo-extraccionRapida;
        }

    }
    public void consultardatosysaldo(){
        System.out.println("su saldo es: "+saldo);
        System.out.println(numerocuenta);
        System.out.println("DNI: "+dni);
        
    }
}
