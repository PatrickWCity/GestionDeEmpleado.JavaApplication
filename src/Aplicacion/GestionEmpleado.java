
package Aplicacion;

import Libreria.*;

public class GestionEmpleado {
        public static void main(String[] args){
        // Datos del Empleado
        String rut="19.313.621-4";
        String nombre="Patrick";
        String apPaterno="Ciudad";
        String apMaterno="Iturra";
        String direccion="Sergio Valdovinos";
        int telefono=993550075;
        String email="PatrickWCity@gmail.com";
        //instanciamos objeto a de la clase Empleado
        Empleado a = new Empleado();
        //enviamos un mensaje al objeto a
        a.setRut(rut);
        a.setNombre(nombre);
        a.setApPaterno(apPaterno);
        a.setApMaterno(apMaterno);
        a.setDireccion(direccion);
        a.setTelefono(telefono);
        a.setEmail(email);
        
        mostrarEmpleado(a);
        // Datos de Comuna
        int id_comuna=8;
        String nombreC="Quinta Normal";
        //instanciamos objeto b de la clase Empleado
        Comuna b = new Comuna();
        //enviamos un mensaje al objeto b
        b.setId_comuna(id_comuna);
        b.setNombreC(nombreC);
        
        mostrarComuna(b);
        // Datos de Escala
        int puntajeEDI=850;
        byte puntajeAntiguedadLaboral=25;
        byte puntajeEstudios=4;
        //instanciamos objeto c de la clase Escala
        Escala c = new Escala();
        //enviamos un mensaje al objeto c
        c.setPuntajeEDI(puntajeEDI);
        c.setPuntajeAntiguedadLaboral(puntajeAntiguedadLaboral);
        c.setPuntajeEstudios(puntajeEstudios);
        mostrarEscala(c);
}
        public static void mostrarEmpleado(Empleado a){
        System.out.println(a.obtenerDatos());
    }
        public static void mostrarComuna(Comuna b){
        System.out.println(b.obtenerDatos());
    }
        public static void mostrarEscala(Escala c){
        System.out.println(c.obtenerDatos());
    }
}