/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileIODevice;

import Interfaces.*;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
/**
 *
 * @author Grafica
 */
public class FileInput implements IInputDevice{

    @Override
    public String read() {
        FileInputStream inputStream = null;
        String string = "";
        try
        {
            inputStream = new FileInputStream("simpleApp.txt");
            Scanner fileScanner = new Scanner(inputStream);

            string = fileScanner.nextLine();           
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
        
        if(inputStream != null) {
            try
            {
                inputStream.close();
            }
            catch(IOException e)
            {
                System.out.println("Fisierul nu este deschis." + e.getMessage());
            }
        }
        
        return string;
    }
    
}
