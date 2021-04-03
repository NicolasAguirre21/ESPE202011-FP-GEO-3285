/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixoperation;

import ec.edu.espe.matrix.BasicMatrix;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class MatrixOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    
        int[][] a;
        int[][] b;
        int[][] c;
        int m ;
        int n ;
       
        
        System.out.println("Enter the matrix dimensions");
        System.out.println(" m ");
        m = input.nextInt();
        System.out.println(" n ");
        n = input.nextInt();

        a = new int[n][m];
        b = new int[n][m];
        c = new int[n][m];
       
        
        System.out.println(" Enter the matrix dimensions A");
        addDimensionMatrices(n, m, a, input);
        System.out.println(" Enter the matrix dimensions B");
        addDimensionMatrices(n, m, b, input);
         
     
        System.out.println("The additon ");
        System.out.println(" matrix A ");

        readMatrix(n, m, a);

        System.out.println("\n Matrix B ");
        readMatrix(n, m, b);

        System.out.println("\n is ");
        readMatrix(n, m, c);
        
          System.out.println("");
        
       System.out.println("The subtraction ");
       System.out.println(" matrix A ");

        readMatrix(n, m, a);

        System.out.println("\n Matrix B  ");
        readMatrix(n, m, b);

        System.out.println("\n is ");
        readMatrix(n, m, c);
        
        System.out.println("");
        
        System.out.println("The multiplication");
        System.out.println(" matrix A ");

        readMatrix(n, m, a);

        System.out.println("\n  Matrix B ");
        readMatrix(n, m, b);

        System.out.println("\n is ");
        readMatrix(n, m, c);
        
        System.out.println("");
        
       System.out.println("The division");
       System.out.println(" matrix A ");

        readMatrix(n, m, a);

        System.out.println("\n Matrix B  ");
        readMatrix(n, m, b);

        System.out.println("\n is ");
        readMatrix(n, m, c);
        
        System.out.println("");
    }

    public static void readMatrix(int m, int n, int[][] matrix) {
        for (int i = 0; i < n ; i++) {
            System.out.println("");
            for (int j = 0; j < m ; j++) {
                System.out.print("\t "+ matrix[i][j]);
            }
        }
    }

    public static void addDimensionMatrices(int m, int n, int[][] a, Scanner input) {
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("a" + (i + 1) + (j + 1));
                a[i][j] = input.nextInt();
            }

        }
        
}
    }