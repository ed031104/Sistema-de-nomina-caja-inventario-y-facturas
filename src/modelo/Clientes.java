
package modelo;

public class Clientes extends Persona{

    private int id;
    
    public Clientes() {
    }

    public Clientes(int id, String Nombres, String Apellidos, String Direccion, String Cedula, String Sexo, String Correo, int Telefono) {
        super(Nombres, Apellidos, Direccion, Cedula, Sexo, Correo, Telefono);
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return getNombres();
    }

    
    
    
}
