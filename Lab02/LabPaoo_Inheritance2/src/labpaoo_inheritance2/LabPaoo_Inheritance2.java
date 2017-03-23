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
public class LabPaoo_Inheritance2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        BasicAutomationPlugin plugin = new WordAutomationPlugin();
        try
        {
            plugin.OpenApp();
            plugin.DoAction();
            plugin.CloseApp();
        }
        catch(Exception e)
        {
            System.out.println("Eroare: " + e.getMessage());
        }
     //   BasicAutomationPlugin wordPlugin = new WordAutomationPlugin();
        
    }
    
}
