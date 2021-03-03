/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examunit2;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Examunit2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DONE
       int totalHardwareProducts;
        String[] products;
        float[] priceOfTheProduct;
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