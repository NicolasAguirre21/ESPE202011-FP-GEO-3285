/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws12.libraries;

/**
 *
 * @author Gabriel
 */
public class WS12Libraries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float squareRoot = 0.0F;
        float number = 0.0F;
        float power=0.0F;
        float base=0.0F;
        float exponent=0.0F;
        float absoluteValue=0.0F;
              
        
       number=9;
       squareRoot=(float)Math.sqrt(number);
        System.out.println("the square root of--" +number+ "-is-" + squareRoot );
       
       number=49;
       number=5;
       power=(float)Math.exp(number);
       System.out.println("the exponet--" +number+ "-is-" + power );
       
        base=3;
        exponent=2;
        power = (float)Math.pow(base, exponent);
        System.out.println(base+ " ^ "+ exponent + "=" + power);
        
        base=2;
        exponent=4;
        power = (float)Math.pow(base, exponent);
        System.out.println(base+ " ^ "+ exponent + "=" + power);
        
        base=78;
        exponent=5;
        
        
        absoluteValue = getAbsoluteValue(number);
        number = -5;
        absoluteValue = getAbsoluteValue(number);
                System.out.println("the absolutevalue of " + number + " is " + absoluteValue);
                
                number = 5;
        absoluteValue = getAbsoluteValue(number);
                System.out.println("the absolutevalue of " + number + " is " + absoluteValue);

        //calculator 78^5
    }
    public static float computePower(float base, float exponent){
        float power;
        power =0.0F;
        
        for (int i = 1; i <= (int)exponent ; i ++){
            power = power * base;
        }
        return power;
    }
    public static float getAbsoluteValue(float number){
        if (number < 0){
            return -number;
            
        }else{
            return number;
        }
//        if(number < 0);
//        number = number * -1;
//    return number;
//    }
//    return number;
    
}
}
