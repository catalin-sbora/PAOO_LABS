/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labpaoo_inheritance;

/**
 *
 * @author catalin
 */
public class LabPaoo_Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        ComplexComputing cc1 = new ComplexComputing(new CalculatorImpl());
        ComplexComputing cc2 = new ComplexComputing(new UnsignedCalculatorImpl());
       
        try
        {
            System.out.println("CC1 = " + cc1.doComputing());
            System.out.println("CC2 = " + cc2.doComputing());

            /*System.out.println( "ADD: " +  calc.Add(10, 20));
            System.out.println( "Sub: " +  calc.Sub(10, 20));
            System.out.println( "Mul: " +  calc.Mul(10, 20));
            System.out.println( "Div: " +  calc.Div(10, 20));*/
                    
            
        }
        catch(Exception e)
        {
            System.out.println("A aparut o eroare la procesarea datelor");
        }
        
    }
    
}
