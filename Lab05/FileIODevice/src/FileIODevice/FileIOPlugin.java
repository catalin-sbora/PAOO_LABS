/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileIODevice;
import Interfaces.*;
/**
 *
 * @author Grafica
 */
public class FileIOPlugin implements ISimpleAppPlugin{
    
    FileInput inputDevice = new FileInput();
    FileOutput outputDevice = new FileOutput();
    
    @Override
    public String getPluginName() {
        return "filePlugin";
    }

    @Override
    public IInputDevice getInputDevice() {
       return inputDevice;
    }

    @Override
    public IOutputDevice getOutputDevice() {
        return outputDevice;
    }
    
}
