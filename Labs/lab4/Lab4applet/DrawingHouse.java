import java.awt.*;
import javax.swing.*;

/**
 * Write a description of class DrawingHouse here.
 * 
 * @author Matt Pigliavento, Chris Fall, Javier Rodriguez 
 * @version 02/20/2017
 */
public class DrawingHouse extends JApplet
{
    // instance variables 
    protected int width, height;

    /**
     * Called by the browser or applet viewer to inform this JApplet that it
     * has been loaded into the system. It is always called before the first 
     * time that the start method is called.
     */
    public void init()
    {
        // this is a workaround for a security conflict with some browsers
        // including some versions of Netscape & Internet Explorer which do 
        // not allow access to the AWT system event queue which JApplets do 
        // on startup to check access. May not be necessary with your browser. 
        JRootPane rootPane = this.getRootPane();    
        rootPane.putClientProperty("defeatSystemEventQueueCheck", Boolean.TRUE);

        // provide any initialisation necessary for your JApplet
        width = getSize().width;
        height = getSize().height;
        setBackground(Color.white);
    }

    /**
     * Called by the browser or applet viewer to inform this JApplet that it 
     * should start its execution. It is called after the init method and 
     * each time the JApplet is revisited in a Web page. 
     */
    public void start()
    {
        // provide any code requred to run each time 
        // web page is visited
    }
    
    /** 
     * Called by the browser or applet viewer to inform this JApplet that
     * it should stop its execution. It is called when the Web page that
     * contains this JApplet has been replaced by another page, and also
     * just before the JApplet is to be destroyed. 
     */
    public void stop()
    {
        // provide any code that needs to be run when page
        // is replaced by another page or before JApplet is destroyed 
    }
    
    public void paint(Graphics g)
    {
        // creates a new Color object
        Color lightBlue = new Color(135,206,235);
        
        // draws the sky
        g.setColor(lightBlue);
        g.fillRect(0, 0, width, height/3 + 20);
        
        // draws the sun
        g.setColor(Color.yellow);
        g.fillOval(20, 20, 50, 50);
        
        // draws the house
        g.setColor(Color.black);
        g.fillRect(width - 200, 120, 100, 100);
        
        // draws the windows of the house
        g.setColor(Color.white);
        g.drawRect(width - 180, 140, 20, 30);
        g.drawLine(width - 180, 155, width - 160, 155);
        g.drawLine(width - 170, 140, width - 170, 170);
        g.drawRect(width - 140, 140, 20, 30);
        g.drawLine(width - 140, 155, width - 120, 155);
        g.drawLine(width - 130, 140, width - 130, 170);
        
        // draws the roof
        int[] x = {width - 220, width - 150, width - 80};
        int[] y = {120, 80, 120};
        g.setColor(Color.green);
        g.fillPolygon(x, y, 3);
    }
    
    /**
     * Called by the browser or applet viewer to inform this JApplet that it
     * is being reclaimed and that it should destroy any resources that it
     * has allocated. The stop method will always be called before destroy. 
     */
    public void destroy()
    {
        // provide code to be run when JApplet is about to be destroyed.
    }
    
    /**
     * Returns information about this applet. 
     * An applet should override this method to return a String containing 
     * information about the author, version, and copyright of the JApplet.
     *
     * @return a String representation of information about this JApplet
     */
    public String getAppletInfo()
    {
        // provide information about the applet
        return "Title:   Drawing House\nAuthor:   Matt Pigliavento \nA simple " + 
               "applet example description. ";
    }
    
    /**
     * Returns parameter information about this JApplet. 
     * Returns information about the parameters than are understood by this JApplet.
     * An applet should override this method to return an array of Strings 
     * describing these parameters. 
     * Each element of the array should be a set of three Strings containing 
     * the name, the type, and a description.
     *
     * @return a String[] representation of parameter information about this JApplet
     */
    public String[][] getParameterInfo()
    {
        // provide parameter information about the applet
        String paramInfo[][] = {
                 {"firstParameter", "1-10", "description of first parameter"},
                 {"status", "boolean", "description of second parameter"},
                 {"images",   "url",     "description of third parameter"}
        };
        return paramInfo;
    }
}