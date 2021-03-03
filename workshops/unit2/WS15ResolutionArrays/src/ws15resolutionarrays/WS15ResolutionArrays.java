/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws15resolutionarrays;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class WS15ResolutionArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //DONE
       int totalOfPlayers=0;
        String[] players;
        float[] goalAverages; 
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Please Enter the amount of players you want to record-> ");
        totalOfPlayers = scanner.nextInt();
        
        players= new String[totalOfPlayers];
        goalAverages = new float[totalOfPlayers];
        
         for (int i = 0; i < totalOfPlayers; i++) {
             scanner.nextLine();
      
            System.out.print("Please Enter the name of player # " + i + " -> ");
            players[i] = scanner.nextLine();
             System.out.print("Please Enter" + players[i] + " goals average ->  ");
           goalAverages[i] = scanner.nextFloat(); 
        }

        
            System.out.println(" player -> \t  goal average" );
        
        for (int i = 0; i < totalOfPlayers; i++) {
            System.out.println(players[i] + " -> \t " +  goalAverages[i]);
        }
}        
    }
    

