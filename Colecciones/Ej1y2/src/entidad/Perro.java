
package entidad;

public class Perro {
    private String raza;
    
    public Perro(String raza) {
        this.raza = raza;
    }
    
    public Perro() {
    }
    
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    @Override
    public String toString() {
        return "Perro{" + "raza: " + raza + '}';
    }
}
