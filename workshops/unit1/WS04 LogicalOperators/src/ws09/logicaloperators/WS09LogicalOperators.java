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
  int[] monthsOfTheYear;
        String[] months;
        float[] weightsByYear;
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the name of coops---");
                n = input.nextInt();
                n = 5;
            
        monthsOfTheYear = new int[12];
        months = new String[24];
        weightsByYear = new float[12];
        
        monthsOfTheYear[0] = 7;
        monthsOfTheYear[1] = 7;
        monthsOfTheYear[0] = 7;
        monthsOfTheYear[0] = 7;
        monthsOfTheYear[0] = 7;
        monthsOfTheYear[0] = 7;
        monthsOfTheYear[0] = 7;
        
        for(int i = 0 ; i < n ; i++){
             System.out.print("Enter the name of coops---" + (i+1) );
             eggsByCoop[1] = input.nextInt();
        }
            
        for(int egss : eggsByCoop){
            System.out.print("EGGS OF COOP ARE " + eggs);
            
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print("EGGS OF COOP ARE " + (i+1) );
