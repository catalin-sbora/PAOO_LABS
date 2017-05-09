/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrianglePlugin;
import Interfaces.*;
/**
 *
 * @author catalin
 */
public class TrianglePluginImpl implements IGraphicAppPlugin
{

    IShape shapeImpl = new Triangle();
    
    @Override
    public String getPluginName() {
        return "triangle";
    }

    @Override
    public String getPluginDescription() {
        return "Draw Triangle";
    }

    @Override
    public IShape getShape() {
        return shapeImpl;
    }
    
}
