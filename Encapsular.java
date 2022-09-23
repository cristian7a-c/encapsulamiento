
package Encapsular;+

public class Encapsular {
    //ATRIBUTOS
    //private, protected,  public
 private   int edad;
  
//METODO CONSTRUCTOR

    public Encapsular(int edad) {
        this.edad = edad;
    }

    Encapsular() {
       
    }

//METODOS ACCESORES(GETTERS Y SETTERS)
    //SETTERS ES PARA ESTABLECER VALOR DEL ATRIBUTO
    //GETTERS ES PARA MOSTRAR EL VALO DEL ATRIBUTO

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
  
}
