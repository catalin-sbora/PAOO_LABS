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
public class ComplexComputing 
{
    private ICalculator calculator = null;
    
    public ComplexComputing(ICalculator calc)
    {
        this.calculator = calc;
    }
    
    public double doComputing()
    {
        double result = 0;
        if (calculator != null)
        {
          result = calculator.Add(10, 30);
          result = calculator.Sub(10, result);
          result = calculator.Mul(10, result);
                  
        }
        return result;
    }
}
