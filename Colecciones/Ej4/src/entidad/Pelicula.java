
package entidad;


public class Pelicula {
    private String titulo;
    private String director;
    private Float duracion;
    
    public Pelicula(String pelicula, String director, Float duracion) {
        this.titulo = titulo;
        this.director = director;
        this.director = director;
    }
    
    public Pelicula() {
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public Float getDuracion() {
        return duracion;
    }
    public void setDuracion(Float duracion) {
        this.duracion = duracion;
    }
    
    @Override
    public String toString() {
        return "Titulo: " + titulo + "Director: " + director + "Duracion: " + duracion;
    }
}
