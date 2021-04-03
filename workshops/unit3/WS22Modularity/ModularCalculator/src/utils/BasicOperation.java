/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Gabriel
 */
public class BasicOperation {
    //additiom,substraction,division,multiplication
    
    public static float addTwoNumbers(float addend1, float addend2){
        float sum = 0;
        sum = addend1 + addend2;
        return sum;
    }
     public static float subtractTwoNumbers(float minuend, float substrahend){
        float substraction = 0;
        substraction = minuend - substrahend;
        return substraction;
    }
    public static float multiplyTwoNumbers(float multiplying, float multiplier){
        float multiplication = 0;
        multiplication = multiplying * multiplier;
        return multiplication;
    }  
    public static float divideTwoNumbers(float dividend, float divider){
        float division = 0;
        division = dividend / divider;
        return division;
    }  
    
}
