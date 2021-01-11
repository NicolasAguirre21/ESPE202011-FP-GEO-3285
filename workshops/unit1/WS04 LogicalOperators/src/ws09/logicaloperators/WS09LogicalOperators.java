/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws09.logicaloperators;

/**
 *
 * @author Gabriel
 */
public class WS09LogicalOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x = 30;
        if (x != 30) {
            System.out.println("x is equals to 30");
        } else {
            System.out.println("x is NOT equal to 30");
        }

        boolean y = x != 30;
        System.out.println("x != 30 --> " + (y));
        System.out.println("x == 30 --> " + (x == 30));
        System.out.println("x = 15 -->   " + (x = 15));
        System.out.println("x > 15 -->  " + (x > 15));
        System.out.println("x >= 15 --> " + (x >= 15));

        boolean comparison = false;
        boolean comparison2 = false;
        boolean comparison3 = false;
        comparison = x != 30;
        System.out.println("comparison -> " + comparison);

        comparison2 = x >= 15;
        System.out.println(" logical AND (&&)");
        comparison3 = comparison && comparison2;
        System.out.println("comparison1 ^ comparison2 --> " + (comparison3));
        comparison3 = comparison || comparison2;
        System.out.println("comparison1 v comparison2 --> " + (comparison3));

        System.out.println("not comparison --> " + !comparison);
        comparison = false;
        System.out.println("not comparison --> " + !comparison);
        comparison = true;
        System.out.println("not comparison --> " + !comparison);
        System.out.println("comparison2 -> " + comparison2);

        System.out.println(" logical AND (&&)");
        comparison3 = comparison && comparison2;
        System.out.println("comparison1 ^ comparison2 --> " + (comparison3));
        comparison3 = comparison || comparison2;
        System.out.println("comparison1 v comparison2 --> " + (comparison3));

        System.out.println("not comparison --> " + !comparison);
        comparison = false;
        System.out.println("not comparison --> " + !comparison);
        comparison = true;
        System.out.println("not comparison --> " + !comparison);

        System.out.println("Nicolas Aguirre AND TRUTH TABLE odd numbers -> &&  even numbers ->||");
        System.out.println("=================================================");
        boolean p;
        boolean q;

        p = true;
        q = true;
        System.out.println(" ( " + p + " v " + q + " ) " + (p || q));
        
        p = false;
        q = false;
        
        System.out.println(" ( " + p + " v " + q + " ) " + (p || q));
        
        p = true;
        q = false;
        
        System.out.println(" ( " + p + " v " + q + " ) " + (p || q));
        
        p = false;
        q = true;
        
        System.out.println(" ( " + p + " v " + q + " ) " + (p || q));
        
        
        
        
        
        
    }
    
}
