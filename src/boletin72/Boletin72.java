
package boletin72;

import java.util.Scanner;


public class Boletin72 {

  
    public static void main(String[] args) {
     
        Scanner dato=new Scanner(System.in);
        
        Metodo obx= new Metodo();
        System.out.println("numeros= ");
        obx.setNumero(dato.nextShort(), dato.nextShort());
        obx.getNumero1();
        obx.getNumero2();
        obx.Condicional();
    }
    
}
