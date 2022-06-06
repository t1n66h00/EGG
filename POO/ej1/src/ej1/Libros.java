package ej1;
import java.util.Scanner;

public class Libros {

    public Scanner leer = new Scanner(System.in);

    private int isbn;
    private String titulo;
    private String autor;
    private int paginas;


    //constructores
    public Libros() {
    }
    public Libros(int isbn, String titulo, String autor, int paginas) {
        this.setIsbn(isbn);
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setPaginas(paginas);
    }

    //getters and setters
    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    //metodos

    public void cargarlibro(){
        System.out.println("ingrese el ISBN del libro");
        isbn = leer.nextInt();
        System.out.println("ingrese el titulo del libro");
        titulo = leer.next();
        System.out.println("ingrese el nombre del autor del libro");
        autor = leer.next();
        System.out.println("ingrese la cantidad de paginas del libro");
        paginas = leer.nextInt();
        
    }
  
    @Override
    public String toString() {
        return " ISBN: "+isbn+ " titulo: "+titulo+" autor: "+autor+" cantidad de paginas: "+paginas;
    }
    
    
}