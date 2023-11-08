
package modelo;

public class Clientes extends Persona{

    public Clientes() {
    }

    public Clientes(String Nombres, String Apellidos, String Direccion, String Cedula, String Sexo, String Correo, int Telefono) {
        super(Nombres, Apellidos, Direccion, Cedula, Sexo, Correo, Telefono);
    }
    
    
    
    
    @Override
    public String toString() {
        return getNombres();
    }

    
    
    
}
