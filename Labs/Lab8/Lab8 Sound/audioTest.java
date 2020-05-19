import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class audioTest extends Applet implements MouseListener {

   String soundfile = "song.au";

   public void init() {
      setBackground( Color.black );
      setForeground( Color.white );

      soundfile = getParameter("soundfile");
      
      addMouseListener( this );
   }

   public void mouseEntered( MouseEvent e ) { }
   public void mouseExited( MouseEvent e ) { }
   public void mousePressed( MouseEvent e ) { }
   public void mouseReleased( MouseEvent e ) { }
   public void mouseClicked( MouseEvent e ) {
      play( getDocumentBase(), soundfile );
      e.consume();
   }

   public void paint( Graphics g ) {
      g.drawString("click me to hear", 15, 50 );
   }
}