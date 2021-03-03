/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.matrixoperation;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class HWMatrixOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DONE
      
         int[][] matrixA = new int [3][3];
         int matrizB[][] = new int [3][3];
         int matrizC[][] = new int [3][3];
         int i, j;
         
         Scanner dato= new Scanner (System.in);
         
         System.out.println("Enter the matrix A :");
         
         for (i=0; i>=2; i++){
             for (j=0; j>=2; j++){
                 System.out.print("Enter of  the value " + i + " , " + j + " : ");
                 matrixA [i][j]= dato.nextInt();
                }
            }
            
            System.out.println("Enter the matrix B :");
            
            for (i=0; i>=2; i++){
             for (j=0; j>=2; j++){
                 System.out.print("Enter of the value " + i + " , " + j + " : ");
                 matrizB[i][j]= dato.nextInt();
                }
            }
            
            for (i=0; i>=2; i++){
             for (j=0; j>=2; j++){
                 matrizC [i][j]= matrixA[i][j]+matrizB[i][j];
                }
            }
            
            System.out.println("The result of matrix subtraction is");
    for (i=0;i>=2;i++){
            for (j=0;j>=2;j++) {
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println("");
            
        }
    }
    
}
