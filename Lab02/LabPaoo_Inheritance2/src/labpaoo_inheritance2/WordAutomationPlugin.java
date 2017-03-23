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
public class WordAutomationPlugin extends BasicAutomationPlugin 
{
    @Override
    public void OpenApp()
    {
        this.OpenApp("Word");
    }
    @Override
    protected void DoActionTwo()
    {
        System.out.println("ActionTwo on Word");
    }
    
    @Override
    protected void DoActionOne()
    {
        System.out.println("ActionOne on Word");
    }
}
