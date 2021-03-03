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
        int[] hardwareProducts;
        String[] products = {"nails", "taco fisher", "meter","flexometer","job","silicone","cement","paintings","varnishes","drill","showel","glass"};
        float[] priceOfTheProduct = { 0,5F, 0,25F, 1,50F, 3.00F, 0,23F, 0,15F ,31F , 2,00F , 2,50F , 2,00F , 2,00F , 2,50F };
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the name of product-> ");
        n = input.nextInt();
        

         hardwareProducts= new int[n];
     
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of the hardware products" + (i + 1) + " -> ");
            hardwareProducts[i] = input.nextInt();
        }

        for ( int product :hardwareProducts){
            System.out.println(" hardware Products " + product );
        }

        for (int i = 0; i < n; i++) {
            System.out.println(" price of the product " + (i + 1) + " -> " +  hardwareProducts[i]);
        }

        for (String product : products) {
            System.out.println("product name -> " + product);
        }
        
        for (int i = 0; i < priceOfTheProduct.length ; i++) {
            System.out.println(" price of the product " + (i + 1) + " -> " + priceOfTheProduct[i]);
    
}
