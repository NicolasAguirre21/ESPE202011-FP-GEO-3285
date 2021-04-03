/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.matrix;



/**
 *
 * @author Gabriel
 */
public class BasicMatrix {
    
        public static int computeSumMatrices(int n, int m, int [][] matrixA,int [][] matrixB, int [][] matrixC){
            for (int i = 0; i < n; i++){
                for (int j = 0; i < m; j++){
                    matrixC[i][j]= matrixA[i][j] + matrixB[i][j];
                }
            }
            return 0;
        }
         public static int computeSubtractMatrices(int n, int m, int [][] matrixA,int [][] matrixB, int [][] matrixC){
            for (int i = 0; i < n; i++){
                for (int j = 0; i < m; j++){
                    matrixC[i][j]= matrixA[i][j] - matrixB[i][j];
                      }
            }
            return 0;
            }
         public static int computeMultiplyMatrices(int n, int m, int [][] matrixA,int [][] matrixB, int [][] matrixC){
            for (int i = 0; i < n; i++){
                for (int j = 0; i < m; j++){
                    matrixC[i][j]= matrixA[i][j] * matrixB[i][j];
                      }
            }
            return 0;
            }
         public static int computeDivideMatrices(int n, int m, int [][] matrixA,int [][] matrixB, int [][] matrixC){
            for (int i = 0; i < n; i++){
                for (int j = 0; i < m; j++){
                    matrixC[i][j]= matrixA[i][j] / matrixB[i][j];
                      }
            }
            return 0;
        
}
         }


