package ej2;

public class Circunferencia {

    private int radio;
    private double area;
    private double perimetro;

    public Circunferencia() {
    }

//Constructores
    public Circunferencia(int radio) {
        this.radio = radio;
    }

//Setter    
    public void setRadio(int radio) {
        this.radio = radio;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

//Getter   
    public int getRadio() {
        return radio;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

//Método circunferencia   
    public void crearCircunferencia(int radio) {
        this.radio = radio;
    }
//Método área

    public void area(int radio) {
        area = Math.PI * radio;
    }
//Método perímetro

    public void perimetro(int radio) {
        perimetro = 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", area=" + area + ", perimetro=" + perimetro + '}';
    }

}