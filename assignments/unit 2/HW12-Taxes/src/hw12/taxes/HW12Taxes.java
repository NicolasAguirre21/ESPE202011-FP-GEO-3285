/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw12.taxes;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class HW12Taxes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner data = new Scanner(System.in);
    double value1;
    double value2;
    double value3;
    double rentalValue;
    double ivaTax;
    double feTax;

  
    public void enterData(double value1){
        System.out.println("Enter the value of your income in the year: ");
        value1 = data.nextDouble();
    }

    public void showIncomeTax(int value1, double rentalValue) {
        if (value1 > 0 && value1 <= 11212) {
            System.out.println("The tax on the basic fraction is $ 0");
            System.out.println("The tax on the excess fraction is $ 0");
        } else if (value1 > 11212 && value1 <= 14285) {
            rentalValue = value1 * 0.05;
            System.out.println("The tax on the basic fraction is $ 0");
            System.out.println("The tax on the excess fraction is $ " + rentalValue);
        } else if (value1 > 14285 && value1 <= 17854) {
            rentalValue = value1 * 0.10;
            System.out.println("The tax on the basic fraction is $ 154");
            System.out.println("The tax on the excess fraction is $ " + rentalValue);
        } else if (value1 > 17854 &&value1 <= 21442) {
            rentalValue = value1 * 0.12;
            System.out.println("The tax on the basic fraction is $ 511");
            System.out.println("The tax on the excess fraction is $ " + rentalValue);
        } else if (value1 > 21442 &&value1 <= 42874) {
            rentalValue = value1 * 0.15;
            System.out.println("The tax on the basic fraction is $ 941");
            System.out.println("The tax on the excess fraction is $" + rentalValue);
        }
        else if (value1 > 42874 && value1 <= 64297) {
            rentalValue = value1 * 0.20;
            System.out.println("The tax on the basic fraction is $ 4 156");
            System.out.println("The tax on the excess fraction is $ " + rentalValue);
        } 
        else if (value1 > 64297 && value1 <= 85729) {
            rentalValue = value1 * 0.25;
            System.out.println("The tax on the basic fraction is $ 8 440");
            System.out.println("The tax on the excess fraction is $ " + rentalValue);
        } 
        else if (value1 > 85729 && value1 <= 114288){
            rentalValue = value1 * 0.30;
            System.out.println("The tax on the basic fraction is $ 13 798");
            System.out.println("The tax on the excess fraction is $ " + rentalValue);
        } else if (value1 > 114288) {
            rentalValue = value1 * 0.35;
            System.out.println("The tax on the basic fraction is $ 22 366");
            System.out.println("The tax on the excess fraction is $ " + rentalValue);
        }

    }

    public void enterDataIVA(double value2) {
        System.out.println("Enter the value of the service or product: ");
        value2 = data.nextDouble();
    }

    public void showIVA(double value2, double ivaTax) {
        ivaTax = value2 * 0.12;
        System.out.println("The IVA is: " + ivaTax);
        System.out.println("TOTAL --> " +value2+ " + " + ivaTax + " = " + (value2 + ivaTax));
    }

    public void enterDataForeignExchange(double value3) {
        System.out.println("Enter the value to send: ");
        value3 = data.nextDouble();
    }

    public void showForeignExchangeTax(double value3, double feTax) {
        feTax = value3 * 0.05;
        System.out.println("The  amount to pay of the tax on the exit of foreign "
                + "currency is: " + feTax);
    }
    }
    
    

