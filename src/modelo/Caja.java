
package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Caja {

    Clientes cliente;
    ArrayList<Producto> producto;
    double total, subTotal, vuelto;
    int numeroFactura;
    String date;
    
    public Caja(int numeroFactura, String fecha, Clientes cliente, double subTotal, double Total, double vuelto, ArrayList<Producto> productos) {
        this.cliente = cliente;
        this.subTotal = subTotal;
        this.total = Total;
        this.vuelto = Total;
        this.producto = productos;
        this.numeroFactura = numeroFactura;
        this.date = fecha;
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

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

   

    @Override
    public String toString() {
        return getCliente().getNombres();
    }


    
}
