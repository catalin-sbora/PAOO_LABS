/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StandardIODevice;
import Interfaces.*;
/**
 *
 * @author Grafica
 */
public class StandardIOPlugin implements ISimpleAppPlugin{
    
    InputDevice inputDevice = new InputDevice();
    OutputDevice outputDevice = new OutputDevice();
    
    @Override
    public String getPluginName() {
      return "standardPlugin";
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
