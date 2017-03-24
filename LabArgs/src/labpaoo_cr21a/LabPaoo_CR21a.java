/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labpaoo_cr21a;

import java.util.*;
import TestPackage.*;

/**
 *
 * @author catalin
 */
public class LabPaoo_CR21a 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int n = args.length;
        for (int i = 0; i < n; i++)
        {
            System.out.println("Parametrul cu index-ul " + i + " este: " + args[i] );
        }
        
        for (String arg : args) 
        {
            System.out.println("Parametrul este: " + arg);
        }
        
        Scanner s = new Scanner(System.in);        
        String readData = s.nextLine();
        String readDataSecond = s.nextLine();
        
        System.out.println("am citit prima linie: " + readData );
        System.out.println("am citit a doua linie " + readDataSecond);
        
    }
    
}
