import java.awt.*;
import javax.swing.*;

/**
 * Class DrawingShapes - write a description of the class here
 * 
 * @author Darren Lim 
 * @version 1.1
 */
public class DrawingShapes extends JApplet
{
    // instance variables - replace the example below with your own
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
        setBackground( Color.black );

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

    /**
     * Paint method for applet.
     * 
     * @param  g   the Graphics object for this applet
     */
    public void paint(Graphics g)
    {
      // As we learned in the last lesson,
      // the origin (0,0) is at the upper left corner.
      // x increases to the right, and y increases downward.

      g.setColor( Color.red );
      g.drawRect( 10, 20, 100, 15 );
      g.setColor( Color.pink );
      g.fillRoundRect( 240, 160, 40, 110, 7, 7 );

      g.setColor( Color.blue );
      g.drawOval( 50, 225, 100, 50 );
      g.setColor( Color.orange );
      g.fillOval( 225, 37, 50, 25 );

      g.setColor( Color.yellow );
      g.drawArc( 10, 110, 80, 80, 90, 180 );
      g.setColor( Color.cyan );
      g.fillArc( 140, 40, 120, 120, 90, 45 );

      g.setColor( Color.magenta );
      g.fillArc( 150, 150, 100, 100, 90, 90 );
      g.setColor( Color.black );
      g.fillArc( 160, 160, 80, 80, 90, 90 );

      g.setColor( Color.green );
      g.drawString( "Wow!", 50, 150 );

      g.setColor( Color.white );
      g.draw3DRect( 200, 350, 35, 58, true);
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
        return "Title:   Drawing Shapes\nAuthor:   Darren Lim \nA simple " + 
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
