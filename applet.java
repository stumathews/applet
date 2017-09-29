/**
   Template for implementing an applet.
   Note that these are great for porting a java desktop application to the web. This is especially cool if you want the interface of the desktop app to mimic the applets as they both use the swing library and thus look the same and call the same code!
 */
import java.awt.*;
import javax.swing.*;

public class HelloWorldApplet extends JApplet
{
    /*This is the method that is called first when the applet gets created.
      It can be considered as the constructor of the JApplet object(though it isn't)*/        
    public void init()
    {
	Container container = getContentPane(); // Same like in a JFrame
	JLabel label = new JLabel("Hello World");
	container.add(label);
    }

    public void start()
    {
	// This is called when the applet actually starts, after the init() method
    }
    /**
    Most often the applet will want to draw itself and thus we override this method
    */
    public void paint( Graphics g )
    {
	// g.drawString("Hello World",0,0);
    }

    /** Applets can also respond to events, here is a inner clas that extends a MouseAdapter*/
    public class Mousehandler extends MouseAdapter
    {
	public void mouseClicked( MouseEvent e )
	{
	    // Deal with the event naturally here.

	    // Might want to repaint() to invoke the overridden paint() method...
	}
    }
}