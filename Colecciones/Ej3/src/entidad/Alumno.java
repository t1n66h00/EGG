
package entidad;


public class Alumno {
    private String nombre;
    private Integer nota1;
    private Integer nota2;
    private Integer nota3;
    private Float promedio;
    
    public Alumno(String nombre, Integer nota1, Integer nota2, Integer nota3, Float promedio) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.promedio = promedio;
    }
    
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getNota1() {
        return nota1;
    }
    public void setNota1(Integer nota1) {
        this.nota1 = nota1;
    }
    public Integer getNota2() {
        return nota2;
    }
    public void setNota2(Integer nota2) {
        this.nota2 = nota2;
    }
    public Integer getNota3() {
        return nota3;
    }
    public void setNota3(Integer nota3) {
        this.nota3 = nota3;
    }
    public Float getPromedio() {
        return promedio;
    }
    public void setPromedio(Float promedio) {
        this.promedio = promedio;
    }
    
    public void promedio() {
        float promedio=(nota1+nota2+nota3)/3;
    }
    
    @Override
    public String toString() {
        return "Alumno{" + "promedio: " + promedio + '}';
    }
}
