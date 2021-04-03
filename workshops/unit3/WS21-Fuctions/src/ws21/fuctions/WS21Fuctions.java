/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws21.fuctions;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class WS21Fuctions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DONE
        
        
        Scanner input = new Scanner(System.in);
        int numberOfSheets;
        int minutesOfImpressions=2;
        System.out.println("AUTHOR: NICOLAS AGUIRRE");
        
        System.out.println("enter the number of sheets");
        numberOfSheets = input.nextInt();
        
        minutesOfImpressions = CalculateMinutesOfImpression(numberOfSheets);
  
         System.out.println(" The minutes of impression are " + minutesOfImpressions );
         
         int impressions;
         int cartridges =50;
         
         System.out.println("enter the number of impressions");
        impressions = input.nextInt();
        
        cartridges = CalculateCartrindgesNeed(impressions);
        System.out.println("The cartridges required are"  + cartridges );
        
        
         
        
     } 
    private static int CalculateMinutesOfImpression(int numberOfSheet ){
     
        int minutesOfImpressions;
        minutesOfImpressions = numberOfSheet * 2;
        return minutesOfImpressions;
         }
    private static int CalculateCartrindgesNeed(int impressions){
     
        int cartridges;
        cartridges = impressions / 50;
        return cartridges;
        }
        
        
        
    
    
    
    
    
    
    
    
    }




   
    
   
    

