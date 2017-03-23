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
public interface ICalculator extends INumberAdder, INumberMultiplier 
{    
   public double Sub(double firstNumber, double secondNumber);    
   public double Div(double firstNumber, double secondNumber);  
}
