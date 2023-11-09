
package modelo;

import java.util.ArrayList;

public class Caja {

Clientes cliente;
    ArrayList<Producto> producto;

double total, subTotal, vuelto;

    public Caja(Clientes cliente, double subTotal, double Total, double vuelto, ArrayList<Producto> productos) {
        this.cliente = cliente;
        this.subTotal = subTotal;
        this.total = Total;
        this.vuelto = Total;
        this.producto = productos;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getProducto() {
        return producto;
    }

    public void setProducto(ArrayList<Producto> producto) {
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

    public double getVuelto() {
        return vuelto;
    }

    public void setVuelto(double vuelto) {
        this.vuelto = vuelto;
    }

   

    @Override
    public String toString() {
        return getCliente().getNombres();
    }


    
}
