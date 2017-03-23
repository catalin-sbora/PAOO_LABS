/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labpaoo_inheritance2;

/**
 *
 * @author catalin
 */
public class ExcelAutomationPlugin extends BasicAutomationPlugin {
    
    @Override
    public void OpenApp() 
    {
        this.OpenApp("Excel");
    }
    @Override
    protected void DoActionTwo()
    {
        System.out.println("Action two on excel");
    }
    
}
