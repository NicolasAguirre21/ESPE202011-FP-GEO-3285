/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HWIter;

/**
 *
 * @author Gabriel
 */
public class HW03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int i ;
        i = 0 ;
        
        System.out.println("== This is a While loop from 1 to 2 ===");
        while( i < 2){
              System.out.println("i -> " + i );
            // i += 1;
            i++; 
            // i = i + 1;
        
      
    }
        System.out.println("Multiplication Tables : 2");
        int top=12;
        int product=0;
        int table = 2;
         for(int j=1 ; j <= top ; j++){
             product = table * j;
             System.out.println("2 * " + j + " = " + product);
    
}
         
         
         System.out.println(" First 20 numbers multiples of 2 ");
        
        int stop;
        stop=18;
        for(int j=2 ; j < stop ; j+=2){
            System.out.println("odd number -> " + j);
        } 
         
         
         
        
         
