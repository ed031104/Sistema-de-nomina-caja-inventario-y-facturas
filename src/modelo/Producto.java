
package modelo;

public class Producto {
 
    private String nombre, categoria, estado;
    private double precio;
    private int cantidad, id;
    

    public Producto(String nombre, String categoria, double precio, int cantidad, int id, String estado) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidad = cantidad;
        this.id = id;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    
    @Override
    public String toString() {
        return getNombre();
    }
    
    public void estadoProducto(Producto producto){
        String estado;
        if(producto.getCantidad() > 0){
            estado = "Disponible";    
        }else{
            estado = "Agotado"; 
        }
        producto.setEstado(estado);
    }
    
}
