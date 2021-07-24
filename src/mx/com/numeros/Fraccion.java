package mx.com.numeros;

public class Fraccion{
   //Propiedades
   private int numerador;
   private int denominador;

   //Metodos
   public Fraccion(){
      System.out.println("Se crea Fraccion");
      this.numerador = 0;
      this.denominador = 1;
   }
   
   
   public void imprimir(){
      System.out.println("soy una fraccion:" + this.numerador + "/" +this.denominador);
   } 

}