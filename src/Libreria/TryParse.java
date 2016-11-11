package Libreria;

public class TryParse {
   public boolean esInteger(String dato){
       try {
           int numero=Integer.valueOf(dato);
           return true;
       } catch(Exception e) {
           return false;
       }
   }
   public boolean esByte(String dato){
       try {
           Byte numero=Byte.valueOf(dato);
           return true;
       } catch(Exception e) {
           return false;
       }
   }
}