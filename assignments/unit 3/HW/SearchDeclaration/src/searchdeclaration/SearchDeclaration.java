/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchdeclaration;

import Search.BasicSearch;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class SearchDeclaration {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // DONE
        Scanner input = new Scanner(System.in);
        System.out.println("NICOLAS AGUIRRE");
        int[] elements= { 3, 5, 7, 9 , 11, 14, 34, 56, 64, 43, 32, 43};
        int n = elements.length;
        int search;
        int x;
        int mid;
        int result;
        
        System.out.println("Please enter the element");
        x = input.nextInt();
        search = BasicSearch.search(elements, x);
        if (search == -1 ){
            System.out.println("Element not present ");
            
        }else{
             System.out.println("Element present " + x);
             }
        
        
        System.out.println("Please enter the element");
        x = input.nextInt();
         result = BasicSearch.binarySearch(elements,0 , n-1 , x);
        if (result == -1 ){
            System.out.println("Element not present");
            
        }else{
             System.out.println("Element present " + result);
             }
        
        }
        
    }
    

