
package modelo;

public class Caja {

Clientes cliente;
Producto producto;

double total, subTotal;

    public Caja(Clientes cliente, Producto producto, double total, double subTotal) {
        this.cliente = cliente;
        this.producto = producto;
        this.total = total;
        this.subTotal = subTotal;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    @Override
    public String toString() {
        return getCliente().getNombres();
    }


    
}
