/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10functions;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class HW10Functions {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
        // DONE
        int dividend;
        int dividier;
        float quotient=0;
        int multiplicand;
        int multiplier=1;
        int stop=12;
        int product;
        int x;
        int y;
        
        System.out.println("----NICOLAS AGUIRRE----");
        
        System.out.println(" Enter 2 numbers for division" );
        Scanner input = new Scanner(System.in);
                dividend = input.nextInt();
                dividier = input.nextInt();
                quotient = numbersdividen( dividend, dividier);
                
                System.out.println(" the quotient of " + dividend + "&" + dividier + " is " + quotient);
                
                
                System.out.println(" Enter a number for g(x)=x*x +2*x + 1 ");
                x =input.nextInt();
                y =computerParabola(x);
                System.out.println("x*x +2*x + 1 is " +y);
                
                
                System.out.println(" Enter a number for f(x)=x*x is ");
                x =input.nextInt();
                y =computerSquare(x);
                System.out.println(" x*x is " +y);
                
                System.out.println("Enter the number for the table");
                multiplicand =input.nextInt();
                for (multiplier =1; multiplier <= stop; multiplier++) {
                   product = showTheMultiplicationTable(multiplier, multiplicand);
                   System.out.println(multiplicand + " x " + multiplier + " = " + product );
                   }
                   System.out.println(" good bye ");
                }
                    
                public static float numbersdividen(int dividend, int dividier){
                            float quotient=0.0F;
                            quotient = (float) dividend / (float) dividier;
                            return quotient;
                            
                }  
                public static int computerParabola(int x){
                    int y=0;
                    y=x*x +2*x +1;
                    return y;
                    
                 }
                public static int computerSquare(int x){
                    int y=0;
                    y=x*x;
                    return y;
                }
               public static int showTheMultiplicationTable(int multiplicand, int multiplier){
                   int product=0;
                   product = multiplicand * multiplier;
                   return product;
                   
               }
           }
    


