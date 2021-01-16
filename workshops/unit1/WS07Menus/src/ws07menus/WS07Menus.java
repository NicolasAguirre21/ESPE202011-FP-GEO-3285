/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws07menus;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class WS07Menus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;
        
        do {
            System.out.println("====Calculator====");
            System.out.println(" 1 --> Addition");
            System.out.println(" 2 --> Subtraction");
            System.out.println("3 --> Multiplication");
            System.out.println("4 --> Division");
            System.out.println("5 --> Exit");
            
            System.out.println("Enter your menu options --> ");
            option = input.nextInt();
            
            switch(option) {
                case 1:
                    int addend1;
                    int addend2;
                    int sum;
                     System.out.println("Enter addend 1 -->  ");
                     addend1 = input.nextInt();
                     System.out.println("Enter addend 2 -->  ");
                     addend2 = input.nextInt();
                     sum = addend1 + addend2;
                     System.out.println(" The sum is --> " + sum );
                     break;
                     
                case 2:
                    int minuend;
                    int subtrahend;
                    int subtraction;
                    System.out.println("Enter minuend --> ");
                    minuend = input.nextInt();
                    System.out.println("Enter subtrahend --> ");
                    subtrahend = input.nextInt();
                    subtraction = minuend - subtrahend;
                    System.out.println("The subtraction is --> " + subtraction);
                    break;
                case 3:
                    int multiplying;
                    int multiplier;
                    int multiplication;
                    System.out.println("Enter factor 1 --> ");
                    multiplying = input.nextInt();
                    System.out.println("Enter factor 2 --> ");
                    multiplier = input.nextInt();
                    multiplication = multiplying * multiplier;
                    System.out.println("The multiplication is --> " + multiplication );
                    break;
                case 4:
                    float dividend;
                    float divider;
                    float division;
                    System.out.println("Enter dividend --> ");
                    dividend = input.nextFloat();
                    System.out.println("Enter divider --> ");
                    divider = input.nextFloat();
                    division = dividend/divider;
                    System.out.println("The division is --> " + division );
                    break;
                case 5:
                    System.out.println("come back soon ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
        
    }
            
    
} while (option != 5);
        
}

}

