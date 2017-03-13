/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labpaoo_cr21b_l3;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author catalin
 */
public class LabPaoo_CR21B_L3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    
        System.out.println("Hello World");
//        Scanner s = new Scanner(System.in);        
//        String sirCitit = s.nextLine();        
//        System.out.println("Sirul citit de la tastatura este: " + sirCitit);
        FileInputStream inputStream = null;
        try
        {
            inputStream = new FileInputStream("/home/catalin/test_1.txt");
            Scanner fileScanner = new Scanner(inputStream);
            String readLine = fileScanner.nextLine();  
            System.out.println("Am citit: " +  readLine);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Eroare la deschiderea fisierului " + e.getMessage());
            e.printStackTrace();
        }
        catch (NoSuchElementException e)
        {
            System.out.println("Eroare la procesarea fisierului " + e.getMessage());
            e.printStackTrace();
            
        }
        catch(Exception e)
        {
            System.out.println("Eroare la procesarea fisierului " + e.getMessage());
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if (inputStream != null)
                    inputStream.close();
            }
            catch(IOException e)
            {
                System.out.println("Fisierul nu este deschis." + e.getMessage());
            }
        }
    }
    
}
