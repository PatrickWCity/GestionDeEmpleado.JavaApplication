
package Libreria;

public class Comuna {
    // Atributos
    private int id_comuna;
    private String nombreC;
    // Constructor
    public Comuna(){
        id_comuna=0;
        nombreC="";
    }
    // Propiedades
    public int getId_comuna() {
        return id_comuna;
    }
    public void setId_comuna(int id_comuna) {
        this.id_comuna = id_comuna;
    }
    public String getNombreC() {
        return nombreC;
    }
    public void setNombreC(String nombre) {
        this.nombreC = nombre;
    }
    // Métodos
    public String obtenerDatos(){
        String datos="";
        datos +="ID de Comuna                       : " + id_comuna + "\n";
        datos +="Nombre de Comuna                   : " + nombreC + "";
        return datos;
    }
}