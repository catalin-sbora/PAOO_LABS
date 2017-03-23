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
public class UnsignedCalculatorImpl implements ICalculator
{
    @Override
    public double Sub(double firstNumber, double secondNumber) 
    {
        double result = 0;
        if (firstNumber > secondNumber)
            result = firstNumber - secondNumber;
        else
            result = secondNumber - firstNumber;
        return result;
    }

    @Override
    public double Div(double firstNumber, double secondNumber) 
    {
        if (secondNumber != 0.0)
        {
            return firstNumber/secondNumber;
        }
        else
        {
            throw new IllegalArgumentException("The second number has to be != 0");
        }
    }

    @Override
    public double Add(double firstNumber, double secondNumber) 
    {
        return firstNumber + secondNumber;
    }

    @Override
    public double Mul(double firstNumber, double secondNumber) 
    {
        return firstNumber*secondNumber;
    }
}
