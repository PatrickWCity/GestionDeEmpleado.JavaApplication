
package Libreria;

public class Escala {
    // Atributos
    private Empleado empleado;
    private int puntajeEDI;
    private byte puntajeAntiguedadLaboral;
    private int puntajeEstudios;
    // Constructor
    public Escala(){
        empleado = new Empleado();
        puntajeEDI=0;
        puntajeAntiguedadLaboral=0;
        puntajeEstudios=0;
    }
    // Propiedades
    public Empleado getEmpleado() {
        return empleado;
    }
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public int getPuntajeEDI() {
        return puntajeEDI;
    }
    public void setPuntajeEDI(int puntajeEDI) {
        this.puntajeEDI = puntajeEDI;
    }
    public byte getPuntajeAntiguedadLaboral() {
        return puntajeAntiguedadLaboral;
    }
    public void setPuntajeAntiguedadLaboral(byte puntajeAntiguedadLaboral) {
        this.puntajeAntiguedadLaboral = puntajeAntiguedadLaboral;
    }
    public int getPuntajeEstudios() {
        return puntajeEstudios;
    }
    public void setPuntajeEstudios(int puntajeEstudios) {
        this.puntajeEstudios = puntajeEstudios;
    }
    // Métodos
    public byte obtenerPuntajeTotalAscenso(){
        byte puntajeTotalAscenso;
        puntajeTotalAscenso = (byte) (obtenerPuntajeAscensoEdi() + obtenerPuntajeAscensoAntiguedadLaboral() + obtenerPuntajeAscensoEstudios());
        return puntajeTotalAscenso;
    }
    public String obtenerEstadoAscenso(){
        String EstadoAscenso;
        if (obtenerPuntajeTotalAscenso() >= 32.2){
            EstadoAscenso = "Ascender";
        }
        else{
            EstadoAscenso = "No Ascender";
        }
        return EstadoAscenso;
    }
    public byte obtenerPuntajeAscensoEdi(){
        byte puntajeAscensoEdi;
        if (puntajeEDI>=1 && puntajeEDI<=500 ){
            puntajeAscensoEdi = 5;
        } else if(puntajeEDI>=501 && puntajeEDI<=600){
            puntajeAscensoEdi = 10;
        } else if(puntajeEDI>=601 && puntajeEDI<=700){
            puntajeAscensoEdi = 15;
        } else if(puntajeEDI>=701 && puntajeEDI<=800){
            puntajeAscensoEdi = 20;
        } else if(puntajeEDI>=801 && puntajeEDI<=900){
            puntajeAscensoEdi = 25;
        } else if(puntajeEDI>=901 && puntajeEDI<=1000){
            puntajeAscensoEdi = 30;
        } else{
            puntajeAscensoEdi = 0;
        }
        return puntajeAscensoEdi;
    }
    public byte obtenerPuntajeAscensoAntiguedadLaboral(){
        byte puntajeAscensoAntiguedadLaboral;
        if (puntajeAntiguedadLaboral>=0 && puntajeAntiguedadLaboral<=9){
            puntajeAscensoAntiguedadLaboral = 1;
        } else if(puntajeAntiguedadLaboral>=10 && puntajeAntiguedadLaboral<=18){
            puntajeAscensoAntiguedadLaboral = 2;
        } else if(puntajeAntiguedadLaboral>=19 && puntajeAntiguedadLaboral<=28){
            puntajeAscensoAntiguedadLaboral = 3;
        } else if(puntajeAntiguedadLaboral>=29 && puntajeAntiguedadLaboral<=38){
            puntajeAscensoAntiguedadLaboral = 4;
        } else if(puntajeAntiguedadLaboral>=39 && puntajeAntiguedadLaboral<=48){
            puntajeAscensoAntiguedadLaboral = 5;
        } else if(puntajeAntiguedadLaboral==49){
            puntajeAscensoAntiguedadLaboral = 6;
        } else{
            puntajeAscensoAntiguedadLaboral = 0;
        }
        return puntajeAscensoAntiguedadLaboral;
    }
    public byte obtenerPuntajeAscensoEstudios(){
        byte puntajeAscensoEstudios;
        switch (puntajeEstudios) {
            case 1:
                puntajeAscensoEstudios = 1 ;
                break;
            case 2:
                puntajeAscensoEstudios = 2;
                break;
            case 3:
                puntajeAscensoEstudios = 4;
                break;
            case 4:
                puntajeAscensoEstudios = 6;
                break;
            case 5:
                puntajeAscensoEstudios = 8;
                break;
            case 6:
                puntajeAscensoEstudios = 10;
                break;
            default:
                puntajeAscensoEstudios = 0;
                break;
        }
        return puntajeAscensoEstudios;
    }
    public String obtenerDatos(){
        String datos="";
        datos +="Puntaje EDI                        : " + puntajeEDI + "\n";
        datos +="Puntaje Antiguedad Laboral         : " + puntajeAntiguedadLaboral + "\n";
        datos +="Puntaje Estudios                   : " + puntajeEstudios + "\n";
        datos +="Puntaje Ascenso EDI                : " + obtenerPuntajeAscensoEdi() + "\n";
        datos +="Puntaje Ascenso Antiguedad Laboral : " + obtenerPuntajeAscensoAntiguedadLaboral() + "\n";
        datos +="Puntaje Ascenso Estudios           : " + obtenerPuntajeAscensoEstudios() + "\n"; 
        datos +="Puntaje de Ascenso Total           : " + obtenerPuntajeTotalAscenso() + "\n";
        datos +="Estado de Ascenso                  : " + obtenerEstadoAscenso() + "\n";
        return datos;
    }
}