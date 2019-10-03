import java.io.*;
import java.awt.*;
import java.applet.*;
/*
<applet code="SimpleBanner" width=500 height=100>
</applet>
*/

public class SimpleBanner extends Applet implements Runnable
{
 String msg=" A simple moving banner.";
 Thread t=null;
 int state;
 boolean stopflag;
 
 public void init()
  {
   setBackground(Color.red);
   setForeground(Color.black);
  }
 
 public void start()
  {
   t=new Thread(this);
   stopflag=false;
   t.start();
  }
 
 public void run()
  {
   for( ; ; )
    {
     try
      {
       repaint();
       Thread.sleep(500);
       if(stopflag)
        break;
      }
    catch(InterruptedException e)
      {}
    }
  }

 public void stop()
  {
   stopflag=true;
   t=null;
  }
 
 public void paint(Graphics g)
  {
   char ch;
   ch=msg.charAt(0);
   msg=msg.substring(1,msg.length());
   msg+=ch;
   g.drawString(msg,150,55);
  }
}