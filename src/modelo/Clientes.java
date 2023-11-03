/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
