/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid_java;

/**
 *
 * @author catalin
 */
public class CustomerWriter 
{
    public CustomerWriter(IOutputStream outStream)
    {
        
    }
    public void printCustomerDetails(Customer customerToWrite)
    {
        String outputString = "First Name: " + customerToWrite.getCustomerFistName();
        outputString += "Last Name: " + customerToWrite.getCustomerLastName();
        outputString += "Identifier: " + customerToWrite.getCustomerId();
        
    }
    
    public void printCustomerName(Customer customerToWrite)
    {
        String outputString = customerToWrite.getCustomerFistName() + " "+ customerToWrite.getCustomerLastName();

    }
    
    
}
