package modelo;

/*@author edwin*/

public class Persona {
    
    private String Nombres;//Nombre del empleado
    private String Apellidos;
    private String Direccion;
    private String Cedula;//cedula
    private String Sexo;
    private String Correo;
    private int Telefono;

    public Persona() {
    }

    
    public Persona(String Nombres, String Apellidos, String Direccion, String Cedula, String Sexo, String Correo, int Telefono) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Direccion = Direccion;
        this.Cedula = Cedula;
        this.Sexo = Sexo;
        this.Correo = Correo;
        this.Telefono = Telefono;
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
    
    
    
    
}
