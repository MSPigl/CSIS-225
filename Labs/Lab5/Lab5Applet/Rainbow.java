import java.applet.*;
import java.awt.*;
/**
 * @author Matt Pigliavento, Ronald Matos
 * @version Spring 2017
 */
public class Rainbow extends Applet {

   int width, height;
   int N = 30;          // the number of colors created
   Color[] spectrum;    // an array of elements, each of type Color
   public void init() {
      width = getSize().width;
      height = getSize().height;
      setBackground( Color.black );
 
      spectrum = new Color[ N ];

      // Generate the colors and store them in the arrays.
      for ( int i = 1; i <= N; ++i ) {
         // The three numbers passed to the Color() constructor
         // are RGB components in the range [0,1].
         // The casting to (float) is done so that the divisions will be
         // done with floating point numbers, yielding fractional quotients.

         // As i goes from 1 to N, this color goes from almost pure green to pure red.
         spectrum[ i-1 ] = Color.getHSBColor((float)i * (float)0.03, (float)1.0, (float)1.0);
      }
   }

   public void paint( Graphics g ) {

      int step = 180 / N;
      for ( int i = 0; i < N; ++i ) {
         g.setColor( spectrum[ i ] );
         g.fillArc(0, 0, 2*width, 2*height, 90+i*step, step+1 );

      }
   }
}


