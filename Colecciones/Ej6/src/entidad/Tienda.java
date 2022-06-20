
package entidad;


public class Tienda {
    private String producto;
    private Float precio;
    
    public Tienda(String producto, Float precio) {
        this.producto = producto;
        this.precio = precio;
    }
    
    public Tienda() {
    }
    
    public String getProducto() {
        return producto;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public Float getPrecio() {
        return precio;
    }
    public void setPrecio(Float precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return "producto: " + producto + "Precio:" + precio;
    }
}
