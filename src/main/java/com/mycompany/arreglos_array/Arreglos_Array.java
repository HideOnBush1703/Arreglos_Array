
package com.mycompany.arreglos_array;

/**
 *
 * @author Josue Pariguana
 */
public class Arreglos_Array {

    public static void main(String[] args) {
   
//TipoDeVariable[] NombreDelArray = new TipoDeVariable[dimension];      
      //int,long,float,double,boolean,char,String.
int[] numeros= {12,14,15,15,17,23,233,45};    
        /*o sino:
        int[] numeros=new int[5];
        numeros[0]=12;
        numeros[1]=14;
        numeros[2]=15;
        numeros[3]=15;
        numeros[4]=17;
        */
     for(int i=0; i<numeros.length; i++){
         System.out.println(numeros[i]);
     } 
     
    }
}
