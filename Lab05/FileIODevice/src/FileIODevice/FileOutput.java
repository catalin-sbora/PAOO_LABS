/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileIODevice;
import Interfaces.*;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
/**
 *
 * @author Grafica
 */
public class FileOutput implements IOutputDevice{

    @Override
    public void write(String s) {
       FileOutputStream outputStream = null;

        try
        {
            outputStream = new FileOutputStream("simpleApp.txt");
            PrintWriter writer = new PrintWriter(outputStream);
            
            writer.print(s);
            writer.flush();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Eroare la deschiderea fisierului " + e.getMessage());
        }
        catch (NoSuchElementException e)
        {
            System.out.println("Eroare la procesarea fisierului " + e.getMessage());
            
        }
        catch(Exception e)
        {
            System.out.println("Eroare la procesarea fisierului " + e.getMessage());
            
        }
        
        if(outputStream != null) {
            try
            {
                outputStream.close();
            }
            catch(IOException e)
            {
                System.out.println("Fisierul nu este deschis." + e.getMessage());
            }
        }
    }
    
}
