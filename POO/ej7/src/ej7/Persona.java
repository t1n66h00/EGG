package ej7;

import java.util.Scanner;

public class Persona {

    Scanner leer = new Scanner(System.in);

    //Atributos
    private String nombre;
    private int edad;
    private String sexo;
    private int peso;
    private double altura;

    //Constructores
    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, int peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    //Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void crearPersona() {
        System.out.println("Ingrese el nombre:");
        nombre = leer.next();
        System.out.println("Ingrese la edad:");
        edad = leer.nextInt();
        do{
            System.out.println("Ingrese el sexo:");
            sexo = leer.next().toUpperCase();
            if (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O")){
                System.out.println("Error, pruebe con H,M o O.");
            }
        }while (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O"));
       
        System.out.println("Ingrese el peso:");
        peso = leer.nextInt();
        System.out.println("Ingrese la altura:");
        altura = leer.nextDouble();
    }
    public void calcularMC(){
        double pesoideal = peso/(altura*altura);
        if  (pesoideal < 20){
            pesoideal = -1;
            if (peso/(altura*altura) > 25) {
                pesoideal = 1;
            }
        }else{
            pesoideal = 0;
        }          
    }
    public boolean esmayordeedad(){
        boolean b =false;
        if (edad >= 18){
            b=true;
        }
        return b;
    }
}