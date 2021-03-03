/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13.tesk;

import com.sun.javafx.geom.Area;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class WS13Tesk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DONE
        Scanner input = new Scanner(System.in);
         int option=0;
        do{
            System.out.println();
            System.out.println();
            System.out.println( "OPTION MENU");
          
            System.out.println("1. Area Rombo ");
            System.out.println(" 2. Area Romboide ");
            System.out.println(" 3. Area Trapecio ");
          
            System.out.println(" ENTER A OPTION ");
            option = input.nextInt();
            switch (option){
                case 1:
                    System.out.println("Enter the base");
                    int base=input.nextInt();
                    System.out.println("Enter the  Diagonal");
                    int Diagonal=input.nextInt();
                    System.out.println(" The Area of rombo is :"+arearombo(base,Diagonal));
                    break;
                case 2:
                    System.out.println("Enter base1");
                    int base1 =input.nextInt();
                    System.out.println("Enter height");
                    int height=input.nextInt();
                    System.out.println(" The Area of Romboide is :"+arearomboide(base1,height));
                    break;
                case 3:
                    System.out.println("Enter the base M");
                    int base_M=input.nextInt();
                    System.out.println("Enter the base m");
                    int base_m=input.nextInt();
                    System.out.println("Enter Height_1");
                    int height_1=input.nextInt();
                    System.out.println(" The Area of the Trapeze is :"+areatrapecio(base_M,base_m,height_1));
                    break;

            }
        } while(option!=9);
    }
        private static int areaRombo(int D, int d) {
            return(D*d)/2;
        }

        private static int arearomboide(int b, int h) {
            return b*h;
        }

        private static int areatrapecio(int B, int b, int h) {
            return ((B+b)/2)*h;
    }

    private static String arearombo(int base, int Diagonal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

   


