import java.awt.*;
import java.applet.*;
/*
<applet code="q4banner" width=250 height=250>
</applet>
*/
public class q4banner extends Applet 
implements Runnable{
   String str = " This is a simple Banner. ";
   String str2=" This is an moving Banner ";
   Thread t ;
   boolean b;
   public void init() {
      setBackground(Color.gray);
      setForeground(Color.yellow);
   }
   public void start() {
      t = new Thread(this);
      b = false;
      t.start();
   }
   public void run () {
      char ch;
      for( ; ; ) {
      try {
         repaint();
         Thread.sleep(250);

         ch = str.charAt(0);
         str = str.substring(1, str.length())+str2;
         str = str + ch;
      }
      catch(InterruptedException e) {}
      }
   }
   public void paint(Graphics g) {
      g.drawString(str, 1, 150);
   }
}