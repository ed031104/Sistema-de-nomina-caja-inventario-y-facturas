package modelo;

/*@author edwin*/

public class Empleado extends Persona{
    
    private int NºINNS;//Numero INNS
    private String Cargo;//Cargo
    private double Salario;//Salario mensual
    //private byte Foto;

    public Empleado() {
     
    }

    public Empleado(int NºINNS, String Cargo, double Salario, String Nombres, String Apellidos, String Direccion, String Cedula, String Sexo, String Correo, int Telefono) {
        super(Nombres, Apellidos, Direccion, Cedula, Sexo, Correo, Telefono);
        this.NºINNS = NºINNS;
        this.Cargo = Cargo;
        this.Salario = Salario;
    }

    public int getNºINNS() {
        return NºINNS;
    }

    public void setNºINNS(int NºINNS) {
        this.NºINNS = NºINNS;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    @Override
    public String toString() {
        return getNombres();
    }

    
    
}
