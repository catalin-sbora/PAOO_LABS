/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CirclePlugin;
import Interfaces.*;
/**
 *
 * @author catalin
 */
public class CirclePluginImpl implements IGraphicAppPlugin
{
    private Circle shapeImpl = new Circle();

    @Override
    public String getPluginName() 
    {
        return "circle"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPluginDescription() 
    {
        return "Draw Circle";
    }

    @Override
    public IShape getShape() 
    {
        return shapeImpl;
    }
    
}
