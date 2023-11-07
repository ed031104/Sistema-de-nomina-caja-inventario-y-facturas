package modelo;

public class Clientes extends Persona{

    public Clientes() {
    }

    public Clientes(String Nombres, String Apellidos, String Direccion, String Cedula, String Sexo, String Correo, int Telefono) {
        super(Nombres, Apellidos, Direccion, Cedula, Sexo, Correo, Telefono);
    }

    Clientes(String nombre, String categoria, double precio, int cantidad, int Id, String estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return getNombres();
    }

    
    
    
}
