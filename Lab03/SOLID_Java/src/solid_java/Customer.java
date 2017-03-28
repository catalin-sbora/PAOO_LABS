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
public class Customer 
{
    private int customerId;
    private String customerFistName;
    private String customerLastName;
    

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerFistName() {
        return customerFistName;
    }

    public void setCustomerFistName(String customerFistName) {
        this.customerFistName = customerFistName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }
    /*
        Dubla responsabilitate. 
        Afisarea informatiilor nu trebuie facuta din interiorul clasei 
        folosite pentru reprezentare.
    */
    
    public void printCustomer()
    {
        System.out.println("Customer details: " + customerId + "; " + customerFistName);
    }
    
}
