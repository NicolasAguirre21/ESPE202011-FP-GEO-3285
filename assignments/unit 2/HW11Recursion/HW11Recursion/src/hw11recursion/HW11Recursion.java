/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11recursion;

/**
 *
 * @author Gabriel
 */
public class HW11Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int n = 25;
        int recursiveSum;
        int result = SumRecursive (n);     
        System.out.println ( " The Sum Recursive the " + n + " is " + result);
         
    }
     
    public static int SumRecursive (int n) {
         int result;
        if (n == 1) {
            return 1;
        } else {
            return result = (n + SumRecursive ( n - 1 ));
        }
       
    }

    
    }
    

