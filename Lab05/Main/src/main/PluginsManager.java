/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;  
import java.net.URL;  
import java.net.URLClassLoader;
import java.util.ArrayList;
import Interfaces.ISimpleAppPlugin;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 *
 * @author Grafica
 */
public class PluginsManager {
   private List<ISimpleAppPlugin> pluginsList = new ArrayList<ISimpleAppPlugin>();
    
    private ISimpleAppPlugin loadPlugin(File jarFile)
    {
        ISimpleAppPlugin retPlugin = null;
        try
        {
            System.out.println("Looking for plugins in: " + jarFile.getAbsolutePath());                    
            URI jarURI = jarFile.toURI();
            ClassLoader loader = URLClassLoader.newInstance(new URL[]{jarURI.toURL()}, getClass().getClassLoader());
            List<String> classesInJar = getJARClasses(jarFile.getAbsolutePath());
            for(String currentClassName : classesInJar)
            {
                System.out.println("Checking class: " + currentClassName);
                Class currentClass = Class.forName(currentClassName, true, loader);
                //if the class implements our plugin interface
                if (ISimpleAppPlugin.class.isAssignableFrom(currentClass))
                {
                    System.out.println("Seems like class " + currentClassName + " is a plugin");
                    //we create an instance for the plugin
                    retPlugin = (ISimpleAppPlugin)currentClass.getConstructor().newInstance();
                    break;
                }                    
            }

        }
        catch(Exception  e)
        {
            retPlugin = null;
            System.out.println("Failed to load plugin from: " + jarFile.getAbsolutePath() + "; " + e.getMessage());
        }
        
        return retPlugin;
    }
    
    private List<String> getJARClasses(String jarPath) throws FileNotFoundException, IOException
    {
        List<String> classNames = new ArrayList<String>();
        ZipInputStream zip = new ZipInputStream(new FileInputStream(jarPath));
        for (ZipEntry entry = zip.getNextEntry(); entry != null; entry = zip.getNextEntry()) 
        {
            if (!entry.isDirectory() && entry.getName().endsWith(".class")) 
            {            
                String className = entry.getName().replace('/', '.'); // including ".class"
                classNames.add(className.substring(0, className.length() - ".class".length()));
            }
        }
        
        return classNames;
    }
    
    public void loadPlugins(String directory)
    {
        File pluginsDir = new File(System.getProperty("user.dir") + directory);
        FilenameFilter fileFilter = new FilenameFilter(){
            @Override
            public boolean accept(File dir, String name) 
            {
                if (name.endsWith(".jar"))
                    return true;
                return false;
            }
        };
        
        
        for (File jar : pluginsDir.listFiles(fileFilter)) 
        {
           ISimpleAppPlugin plugin = loadPlugin(jar);
           if (plugin != null)
           {
                pluginsList.add(plugin);
           }            
        }
    }
    
    public List<ISimpleAppPlugin> getPluginsList()
    {
        return pluginsList;
    } 
}
