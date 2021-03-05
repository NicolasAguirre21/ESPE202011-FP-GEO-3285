/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquingadq11;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class AlquingaDQ11 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int[] instruction = new int[5];
        Scanner ent = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            

            System.out.println("Enter the " + i + " number:");
            instruction[i] = ent.nextInt();
            number += instruction[i];

        }
        for (int i = 0; i < 1; i++) {
            System.out.println("The sum total is: " + number);
        }

        Scanner leer = new Scanner(System.in);
        float numbers;
        float sum = 0;
        float average = 0;

        System.out.print("enter number of floats:");
        numbers = leer.nextInt();

        for (int i = 1; i <= numbers; i++) {
            System.out.println("Enter numbers" + " " + i + " " + "de" + " " + numbers + ":");
            int nota = leer.nextInt();
            sum = sum + nota;
        }

        average = sum / numbers;
        System.out.println("The average is:" + average);
    }
}
