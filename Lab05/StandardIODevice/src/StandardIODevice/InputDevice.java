package StandardIODevice;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Interfaces.*;
import java.util.Scanner;
/**
 *
 * @author Grafica
 */
public class InputDevice implements IInputDevice
{
    @Override
    public String read() {
        String string;
        Scanner keyboard = new Scanner(System.in);
        string = keyboard.nextLine();
        return string;
    }
}
