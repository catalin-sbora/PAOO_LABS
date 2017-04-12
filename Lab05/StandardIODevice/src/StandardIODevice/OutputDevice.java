package StandardIODevice;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Interfaces.*;
/**
 *
 * @author Grafica
 */
public class OutputDevice implements IOutputDevice
{

    @Override
    public void write(String s) {
        System.out.println(s);
    }
    
}
