/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw04menus;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class HW04Menus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    Scanner input = new Scanner (System.in);
    boolean mainLoop = true;
    int option ;
        
        do {
            System.out.println("====Calculator of area====");
            System.out.println(" 1 --> rectangle area");
            System.out.println(" 2 --> Triangle area");
            System.out.println("3 --> Area of ​​the rectangle");
            System.out.println("4 --> square area");
            System.out.println("5 --> Exit");
            
            System.out.println("Enter your menu options --> ");
            option = input.nextInt();
            
            switch(option) {
                case 1:
                    int base;
                    int height;
                    int area;
                     System.out.println("Enter base -->  ");
                    base = input.nextInt();
                     System.out.println("Enter height -->  ");
                     height = input.nextInt();
                     area = base * height;
                     System.out.println(" The area is --> " + area );
                     break;
                     
                case 2:
                    int base1;
                    int heigh1;
                    int area1;
                    System.out.println("Enter base1 --> ");
                   base1 = input.nextInt();
                    System.out.println("Enter heigh1 --> ");
                   heigh1 = input.nextInt();
                    area1 = ( base1 * heigh1 ) /2 ;
                    System.out.println("The area1 is --> " + area1 );
                    break;
                case 3:
                    int perimeter;
                    int base2;
                    int area2;
                    System.out.println("Enter perimeter --> ");
                    perimeter = input.nextInt();
                    System.out.println("Enter base2 --> ");
                   base2 = input.nextInt();
                    area2 =( perimeter * base2 ) / 2;
                    System.out.println("The area2 is --> " + area2 );
                    break;
                case 4:
                    float base3;
                    float area3;
                    System.out.println("Enter base3 --> ");
                    base3 = input.nextFloat();
                    area3 = base3 * base3 ;
                    System.out.println("The area3 is --> " + area3 );
                    break;
                case 5:
                    System.out.println("come back soon ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
      
    }
        } while (option != 4);
        
}

    
}
