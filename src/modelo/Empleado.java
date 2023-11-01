package modelo;

/*@author edwin*/

public class Empleado {
    
    private int NºINNS;//Numero INNS
    private String Nombres;//Nombre del empleado
    private String Apellidos;
    private String Direccion;
    private String Cedula;//cedula
    private String Sexo;
    private String Cargo;//Cargo
    private String Correo;
    private int Telefono;
    private Double Salario;//Salario mensual
    //private byte Foto;

    public Empleado(int NºINNS, String Nombres, String Apellidos, String Direccion, String Cedula, String Sexo, String Cargo, String Correo, int Telefono, Double Salario/*, byte Foto*/) {
        this.NºINNS = NºINNS;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Direccion = Direccion;
        this.Cedula = Cedula;
        this.Sexo = Sexo;
        this.Cargo = Cargo;
        this.Correo = Correo;
        this.Telefono = Telefono;
        this.Salario = Salario;
        //this.Foto = Foto;
    }

    public int getNºINNS() {
        return NºINNS;
    }

    public void setNºINNS(int NºINNS) {
        this.NºINNS = NºINNS;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double Salario) {
        this.Salario = Salario;
    }

//    public byte getFoto() {
//        return Foto;
//    }
//
//    public void setFoto(byte Foto) {
//        this.Foto = Foto;
//    }
}
