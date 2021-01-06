/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperations;

/**
 *
 * @author Gabriel
 */
public class BasicOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum;
        int addend1;
        int addend2;
        
        int subtraction;
        int minuend;
        int subtrahend;
        
        int multiplication;
        int multiplying;
        int multiplier;
        
        int division;
        int dividend;
        int divisor;
        
        int modulus;
        int dividendm;
        int divisorm;
       
        
        //-23 - (-6) = -17 
        //3 * 7 = 21
        //168 % 9 = 6
        
        //initilization
        addend1=5;
        addend2=18;
        
        minuend = -23;
        subtrahend = -6;
        
        multiplying = 3;
        multiplier = -7;
        
        dividend = 162;
        divisor = 9;
        
        dividendm = 83;
        divisorm = 3;
        
        
        //operation
        sum = addend1 + addend2;
        
        System.out.println("the addition of " + addend1 + " + " + addend2 + " is equal to --> " + sum);
        
        ++sum;
        System.out.println("sum is equal to --> " + sum);
        
        sum++;
        System.out.println("sum is equal to --> " + sum);
        
        System.out.println("adding one to sum " + (sum++));
        
        System.out.println("ading one to sum " + ((++sum)));
        
        System.out.println("the subtraction of " + minuend + " - " + subtrahend + " is equal to --> " + (minuend - subtrahend));
        
        System.out.println(" the multiplicacion of " + multiplying + " * " + multiplier + " is equal to --> " + ( multiplying * multiplier));
        
        System.out.println(" the division of " + dividend + " / " + divisor + " is equal to --> " + ( dividend / divisor ));
    
        System.out.println(" the modulus of " + dividendm + " % " + divisorm + " is equal to --> " + ( dividendm % divisorm ));
        
        
    }
    
    
}
