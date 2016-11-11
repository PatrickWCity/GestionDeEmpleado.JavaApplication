
package Libreria;

public class Empleado {
    // Atributos
    private String rut;
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private String direccion;
    private Comuna comuna;
    private int telefono;
    private String email;
    // Constructor
    public Empleado(){
        rut="";
        nombre="";
        apPaterno="";
        apMaterno="";
        direccion="";
        comuna= new Comuna();
        telefono=0;
        email="";
    }
    // Propiedades
    public String getRut() {
        return rut;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApPaterno() {
        return apPaterno;
    }
    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }
    public String getApMaterno() {
        return apMaterno;
    }
    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Comuna getComuna() {
        return comuna;
    }
    public void setComuna(Comuna comuna) {
        this.comuna = comuna;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    // Métodos
    public String obtenerDatos(){
        String datos="";
        datos +="DATOS DE EMPLEADO\n";
        datos +="Rut                                : " + rut + "\n";
        datos +="Nombre                             : " + nombre + "\n";
        datos +="Apellido Paterno                   : " + apPaterno + "\n";
        datos +="Apellido Materno                   : " + apMaterno + "\n";
        datos +="Direccion                          : " + direccion + "\n";
        datos +="Telefono                           : " + telefono + "\n";
        datos +="Email                              : " + email + "";
        return datos;
    }
}