/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid_java;

import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author catalin
 */
public class FileWriterStream implements IOutputStream {

    @Override
    public void WriteString(String stringToWrite, Object destTarget) 
    {
        FileOutputStream outStream = (FileOutputStream)destTarget;
        PrintWriter writer = new PrintWriter(outStream);
        writer.print(stringToWrite);
    }
    
}
