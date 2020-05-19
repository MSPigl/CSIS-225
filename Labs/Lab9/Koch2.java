import java.lang.*;
import java.awt.*;
import java.applet.*;
   
public class Koch2 extends Applet
{
   Dimension win;
   int level;
  
   public void init()
   {
      win = size();
      setBackground(Color.white);

   }
   
   public void start()
   {
      level = 1;
   }
   
   public void paint(Graphics gc)
   {
      drawKoch(gc,level,0,win.height/2,win.width,win.height/2);
   }
   
   void drawKoch(Graphics gc, int depth, double x1, double y1, double x5, double y5)
   {     
      if (depth > 1) {
         double xoff = (x5 - x1) / 4.0;
         double yoff = (y5 - y1) / 4.0;
         double x2;
         double x3;
         double x4;
         double y2;
         double y3;
         double y4;
         if (yoff == 0.0) {
            x2 = x1 + xoff;
            x3 = x2 + xoff;
            x4 = x3 + xoff;
            y2 = y1 - xoff;
            y3 = y1 + xoff;
            
            drawKoch(gc,depth - 1,x1,y1,x2,y1);
            drawKoch(gc,depth - 1,x2,y1,x2,y2);
            drawKoch(gc,depth - 1,x2,y2,x3,y2);
            drawKoch(gc,depth - 1,x3,y2,x3,y1);             
            drawKoch(gc,depth - 1,x3,y1,x3,y3);  
            drawKoch(gc,depth - 1,x3,y3,x4,y3);
            drawKoch(gc,depth - 1,x4,y3,x4,y1);
            drawKoch(gc,depth - 1,x4,y1,x5,y1);
         }
         else {      
            x2 = x1 + yoff;
            x3 = x1 - yoff;
            y2 = y1 + yoff;
            y3 = y2 + yoff;
            y4 = y3 + yoff;
            
            drawKoch(gc,depth - 1,x1,y1,x1,y2);
            drawKoch(gc,depth - 1,x1,y2,x2,y2);
            drawKoch(gc,depth - 1,x2,y2,x2,y3);
            drawKoch(gc,depth - 1,x2,y3,x1,y3);  
            drawKoch(gc,depth - 1,x1,y3,x3,y3);              
            drawKoch(gc,depth - 1,x3,y3,x3,y4);
            drawKoch(gc,depth - 1,x3,y4,x1,y4);
            drawKoch(gc,depth - 1,x1,y4,x1,y5);
         }
            
      }
      else {
         gc.setColor(Color.blue);
         gc.drawLine((int)x1,(int)y1,(int)x5,(int)y5);
      }
   }
   
   public boolean handleEvent(Event e)
   {
      if (e.id == Event.MOUSE_UP) {
         level++;
         repaint();
         return true;
      }
      else return super.handleEvent(e);
   }   
}    
