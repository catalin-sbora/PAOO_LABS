/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CirclePlugin;
import Interfaces.IShape;
/**
 *
 * @author catalin
 */
public class Circle implements IShape
{

    @Override
    public void draw() {
        System.out.println("This is the method for drawing circles");
    }
    
}
