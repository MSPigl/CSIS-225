import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Keyboard extends JApplet
implements KeyListener, MouseListener, MouseWheelListener {

    int width, height;
    int x, y;
    String s = "";
    int scroll = 0;

    public void init() {
        width = getSize().width;
        height = getSize().height;
        setBackground( Color.black );
        setFocusable(true);

        x = width/2;
        y = height/2;

        addKeyListener( this );
        addMouseListener( this );
        addMouseWheelListener( this );
    }

    public void keyPressed( KeyEvent e ) { }

    public void keyReleased( KeyEvent e ) { }

    public void keyTyped( KeyEvent e ) {
        char c = e.getKeyChar();
        if ( c != KeyEvent.CHAR_UNDEFINED ) {
            s = s + c;
            repaint();
            e.consume();
        }
    }

    public void mouseEntered( MouseEvent e ) { }

    public void mouseExited( MouseEvent e ) { }

    public void mousePressed( MouseEvent e ) { }

    public void mouseReleased( MouseEvent e ) { }

    public void mouseClicked( MouseEvent e ) {
        x = e.getX();
        y = e.getY();
        s = "";
        repaint();
        e.consume();
    }

    public void mouseWheelMoved( MouseWheelEvent e ) {
        scroll = e.getWheelRotation();
        repaint();
    }

    public void paint( Graphics g ) {
        g.setColor( Color.gray );
        g.drawLine( x, y, x, y-10 );
        g.drawLine( x, y, x+10, y );
        g.setColor( Color.green );
        g.drawString( s, x, y );
        if ( scroll != 0) {
            g.setColor(Color.BLACK);
            g.fillRect(0,0,height,width); 
            scroll = 0;
        }
    }
}