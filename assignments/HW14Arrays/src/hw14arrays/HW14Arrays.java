/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw14arrays;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class HW14Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DONE
        int[] monthsOfTheYear;
        String[] months = {"Janueary", "February", "March","April","May","June","July","August","September","October","Novenmber","Dicember"};
        float[] numbersDay = { 31F, 28F, 31F, 30F, 30F, 30F ,31F , 31F , 30F , 31F , 30F , 31F };
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the name of months-> ");
        n = input.nextInt();

        monthsOfTheYear = new int[n];
     
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of months in the year " + (i + 1) + " -> ");
            monthsOfTheYear[i] = input.nextInt();
        }

        for ( int days :monthsOfTheYear){
            System.out.println(" days of the year " + days );
        }

        for (int i = 0; i < n; i++) {
            System.out.println(" days of the year " + (i + 1) + " -> " +  monthsOfTheYear[i]);
        }

        for (String month : months) {
            System.out.println("month name -> " + month);
        }
        
        for (int i = 0; i < numbersDay.length ; i++) {
            System.out.println(" numbers Day " + (i + 1) + " -> " + numbersDay[i]);
        }
        int totalHardwareProducts;
        String[] products = {"nails", "taco fisher", "meter","flexometer","job","silicone","cement","paintings","varnishes","drill","showel","glass"};
        float[] priceOfTheProduct = { 0.5F, 0.25F, 1.50F, 3.00F, 0.23F, 0.15F , 3.50F , 2.00F , 2.50F , 2.00F , 2.00F , 2.50F };
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Enter the name of product-> ");
        totalHardwareProducts = scanner.nextInt();
        
        products = new String[totalHardwareProducts];
        priceOfTheProduct = new float[totalHardwareProducts];
        
         for (int i = 0; i < totalHardwareProducts; i++) {
             scanner.nextLine();
      
            System.out.print("Enter the number of the hardware products" + i + " -> ");
            products[i] = scanner.nextLine();
             System.out.print("Enter the" + products[i] + " price of the product ");
            priceOfTheProduct[i] = scanner.nextFloat(); 
        }

        
            System.out.println(" product -> \t price oof the product" );
        
        for (int i = 0; i < totalHardwareProducts; i++) {
            System.out.println(products[i] + " -> \t " + priceOfTheProduct[i]);
        }
    }
    
}
