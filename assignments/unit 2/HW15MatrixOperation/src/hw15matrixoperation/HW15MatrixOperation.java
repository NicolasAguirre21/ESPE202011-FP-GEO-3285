/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw15matrixoperation;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class HW15MatrixOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DONE
         float matrixA[][]; 
         float matrixB[][]; 
         float matrixC[][]; 
         int i, j;
         
         Scanner input= new Scanner (System.in);
         
        System.out.println("Enter the matrix A :");
        
        matrixA = new float[3][3];
        matrixB = new float[3][3];
        matrixC = new float[3][3];
        
             for (i=0; i<=2; i++){
             for (j=0; j<=2; j++){
                 System.out.print("Enter of  the value " + i + " , " + j + " : ");
                 matrixA [i][j]= input.nextInt();
                }
            }
            
            System.out.println("Enter of the matrix B :");
            
            for (i=0; i<=2; i++){
             for (j=0; j<=2; j++){
                 System.out.print("Enter of the value " + i + " , " + j + " : ");
                 matrixB[i][j]= input.nextInt();
                }
            }
            
            for (i=0; i<=2; i++){
             for (j=0; j<=2; j++){
                 matrixC [i][j]= matrixA[i][j]-matrixB[i][j];
                }
            }
            
            System.out.println("The result of matrix substraction ");
    for (i=0;i<=2;i++){
            for (j=0;j<=2;j++) {
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.println("");
            
        }
    }
    
}
