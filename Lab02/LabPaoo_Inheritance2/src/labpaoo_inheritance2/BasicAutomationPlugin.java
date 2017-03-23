/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labpaoo_inheritance2;

import java.io.InvalidClassException;

/**
 *
 * @author catalin
 */
public class BasicAutomationPlugin {
    
    protected String appName = "";
    public void OpenApp() throws InvalidClassException
    {
        System.out.println("No app. selected");
        throw new InvalidClassException("No application selected");
    }
    protected void OpenApp(String appName)
    {
        this.appName = appName;
        System.out.println("OPEN APP " + appName);
    }
    
    public void CloseApp()
    {
        System.out.println("Close application "  + appName);
    }
    
    protected void DoActionOne()
    {
        System.out.println("Action One on base. Should never be called");
    }
    protected void DoActionTwo()
    {
        System.out.println("Action two on base. Should never be called");
    }
    
    public void DoAction() 
    {
        DoActionOne();
        DoActionTwo();
    }
    
}
