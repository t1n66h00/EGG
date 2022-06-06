package ej3;

import java.util.Scanner;

public class Operacion {

    private Scanner leer = new Scanner(System.in);

    private double numero1;
    private double numero2;
    private double suma;
    private double resta;
    private double multiplicacion;
    private double division;
//Constructor vacío

    public Operacion() {
    }
//Constructor con atributos

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public Operacion(Double numero1, Double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
//Getters

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public double getSuma() {
        return suma;
    }

    public double getResta() {
        return resta;
    }

    public double getMultiplicacion() {
        return multiplicacion;
    }

    public double getDivision() {
        return division;
    }

//Setters
    public void setNumero1(Double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(Double numero2) {
        this.numero2 = numero2;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public void setResta(double resta) {
        this.resta = resta;
    }

    public void setMultiplicacion(double multiplicacion) {
        this.multiplicacion = multiplicacion;
    }

    public void setDivision(double division) {
        this.division = division;
    }

//Método petición
    public void crearOperacion(Double numero1, Double numero2) {
        numero1 = this.numero1;
        numero2 = this.numero2;
    }
//Sumar

    public void sumar(Double numero1, Double numero2) {
        suma = numero1 + numero2;
    }
//Restar

    public void restar(Double numero1, Double numero2) {
        resta = numero1 - numero2;
    }
//Multiplicar

    public void multiplicar(Double numero1, Double numero2) {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Error al multiplicar, uno de los valores es 0.");
            multiplicacion = 0;
        } else {
            multiplicacion = numero1 * numero2;
        }
    }
//Dividir

    public void dividir(Double numero1, Double numero2) {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Error al dividir, uno de los valores es 0.");
            division = 0;
        } else {
            division = (numero1 / numero2);
        }
    }

    @Override
    public String toString() {
        return "Operacion{" + " suma=" + suma + ", resta=" + resta + ", multiplicacion=" + multiplicacion + ", division=" + division + '}';
    }

}