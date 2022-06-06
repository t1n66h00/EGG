package ej9;
public class Main {
    public static void main(String[] args) throws Exception {
        //Variables
        double n1,n2;
        //Nacimiento de m1
        Matematica m1 = new Matematica();
        //Damos atributos
        System.out.println("Se darán dos valores aleatorios y se trabajará con ellos.");
        //Damos valor aleatorio a n1 y n2
        n1 = Math.random();
        n2 = Math.random();
        //Setteamos
        m1.setReal(n1);
        m1.setReal2(n2);
        //Devolvemos el valor mayor
        m1.devolverMayor();
        //Calculamos Potencia
        m1.calcularPotencia();
        //Calculamos Raiz
        m1.calcularRaiz();
    }
    
}

