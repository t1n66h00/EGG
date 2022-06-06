package ej9;

public class Matematica {
    //Atributos
    private double real;
    private double real2;

    //Constructor vacío
    public Matematica() {
    }

    //Constructor lleno
    public Matematica(double real, double real2) {
        this.real = real;
        this.real2 = real2;
    }
    //Getters and Setters

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getReal2() {
        return real2;
    }

    public void setReal2(double real2) {
        this.real2 = real2;
    }

//Método devolverMayor()
    public void devolverMayor() {
        double mayor;
        mayor = Math.max(real, real2);
        System.out.println("El valor mas alto es: " + mayor);
    }
//Método calcularPotencia()

    public void calcularPotencia() {
        double potencia, n1, n2, a, b;
        //Redondeo
        n1 = Math.round(real);
        n2 = Math.round(real2);
        //Mayor separado del menor
        a = Math.max(n2, n1);
        b = Math.min(n2, n1);
        potencia = Math.pow(a, b);
        System.out.println("La potencia entre " + n1 + " y " + n2 + " es: " + potencia);
    }
//Método calculaRaiz()

    public void calcularRaiz() {
        double raiz;
        double min;
        min = Math.min(real, real2);
        min = Math.abs(min);
        raiz = Math.sqrt(min);
        System.out.println("La raíz entre " + real + " y " + real2 + " es: " + raiz);
    }
}
