/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aguirrenq11;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class AguirreNQ11 {

    /**
     * @param args the command line arguments
     */
    public static float average (float [] array) {
        // DONE
        
		float average, total = 0;  
		for (int i = 0; i < array.length; i++) {
			total = total + array[i];
		}	
		average = total / array.length; 
		return average; 
	}

	public static String search (int [] array, int value){
		for(int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				String answer = "The value " + value + " is in the position " + (i+1) + ".";
				return answer; 
			} 
		}
		String answer2 = "The value is not in this array. Please, try again.";
		return answer2;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// Arrays: 
		int [] numbers = new int[5]; 
		float [] arraysFloats = new float[3];
		int [] matrix = {12, 23, 34, 98, 87, 65, 0};
		// Input data in numbers and arraysFloats: 
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(" enter numbers " + (i+1));
			numbers[i] = input.nextInt();
		}
		System.out.println("");
		for (int i = 0; i < arraysFloats.length; i++) {
			System.out.println("Enter the float " + (i+1));
			arraysFloats[i] = input.nextFloat();
		}
		System.out.println("");
		float averageFloatArray = average(arraysFloats);
		System.out.println("Tvalue 2: " + averageFloatArray);
		
		System.out.println("");
		System.out.println("Enter arrays 3: ");
		int numberToSearch = input.nextInt();
		System.out.println(search(matrix, numberToSearch));
		input.close();
        
}
}


