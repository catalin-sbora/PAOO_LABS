package graphicapp;
import Interfaces.*;
import java.util.List;
import java.util.Scanner;

public class DrawApplication 
{

    private int doMenu(List<IGraphicAppPlugin> pluginsList)
    {
        int retVal = 0;
            for (int i=0; i < pluginsList.size(); i++)
            {
                System.out.println(" " + (i+1) +". " + pluginsList.get(i).getPluginDescription());
            }
            Scanner scan = new Scanner(System.in);
            retVal = scan.nextInt();                

        return retVal;
    }

    public void run() 
    {
        PluginsManager pluginsManager = new PluginsManager();
        pluginsManager.loadPlugins("/plugins");
        List<IGraphicAppPlugin> pluginsList = pluginsManager.getPluginsList();
        
        while (true) 
        {
            int optiune = doMenu(pluginsList);			
            if(optiune>=1 && optiune <= pluginsList.size())
            {
               IGraphicAppPlugin selectedPlugin = pluginsList.get(optiune - 1);
               IShape selectedShape = selectedPlugin.getShape();
               if (selectedShape != null)
               {
                   selectedShape.draw();
               }
            }
            else
            {
                System.out.println("Selectie invalida");
                break;
            }				

        }

    }
	
}
