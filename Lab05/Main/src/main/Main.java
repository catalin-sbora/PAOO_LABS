package main;
import Interfaces.*;
public class Main 
{
    static IInputDevice getInputDevice()
    {
        return null;
    }
    
    static IOutputDevice getOutputDevice()
    {
        return null;
    }
    
    public static void main(String[] args) 
    {
       String pluginToUse = "standardPlugin";
       ISimpleAppPlugin currentPlugin = null;
       PluginsManager pluginsManager = new PluginsManager();
       pluginsManager.loadPlugins("/plugins");
        
       if(args.length > 0)
       {
         pluginToUse = args[0];  
       }
           
            for (ISimpleAppPlugin plugin : pluginsManager.getPluginsList()) {
                if(plugin.getPluginName().compareTo(pluginToUse) == 0) {
                    currentPlugin = plugin;
                    break;
                }
            }
        
       IInputDevice inputDevice = currentPlugin.getInputDevice();
       
       IOutputDevice outputDevice = currentPlugin.getOutputDevice();
       
       if (inputDevice != null && outputDevice != null)
       {
           String s = inputDevice.read();
           outputDevice.write(s);
       }
    }
    
}
