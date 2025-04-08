package com.endes;
public class Calculadora {
    private int num1;
    private int num2;

   public Calculadora(int a, int b) {
       num1 = a;
       num2 = b;
   }
   // Comentario realizado por el miembro del equipo_4
   public int suma() {
       int resul = num1 + num2;
       return resul;
   }
   public int resta() {
       int resul = num1 - num2;
       return resul;
   }
   public int multiplica() {
       int resul = num1 * num2;
       return resul;
   }
   public int divide() {
       int resul = num1 / num2;
       return resul;
   }
   
   public int divide0() {		   
	   if(num2 == 0)
	      throw new java.lang.ArithmeticException("División por 0");
	   else{
	      int resul= num1 / num2;
	      return resul;
	   } 
	}
}