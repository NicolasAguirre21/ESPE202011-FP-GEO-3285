/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw08.fcactorialnumber;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class HW08FcactorialNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  int factorial= 1;
        int number;
        int stop=15;
        
        do {
        
        System.out.println("Enter the number factorial: ");
        System.out.println("0 (zero) to exit  <--");
        
        Scanner input = new Scanner (System.in);
                number=input.nextInt();
                
                if (factorial != 1);{
             System.out.println("  Studying the number  of --> " + factorial + "<-- ");
             for (int i =number; i > 0 ; i--){
                 factorial=factorial*i;
                 System.out.println(" the factorial the : " + number + " is: " + factorial);
             }
        }
               
                
    } while (factorial != 1 );
             stop=15;
             System.out.println("Good bye");
             
   }
    }
    

