import java.awt.*;
import java.applet.*;
/* 
<applet code="banner" width =200 height=100>
</applet>
*/
public class banner extends Applet implements Runnable
 {
  String msg ="A Simple Moving Banner";
  String msg1 = "Banner start moving";
  Thread t1=null;
  Thread t2=null;
  volatile boolean stopFlag;
 
 public void init()
{
 setBackground(Color.yellow);
 setForeground(Color.red);
 }
public void start()
 {
  t1= new Thread(this);
  t2=new Thread(this);
  stopFlag=false;
  
  t1.start();
  t2.start();
 }
 
public void run()
 { 
  
   for(; ;)
    {
      try
       { 
         repaint();
         Thread.sleep(250);
         if(stopFlag)
           break;
        
       }
  catch(InterruptedException e) {}
    }
}
public void stop()
 {
    stopFlag=true;
    t1=null;
    t2=null;
 }
public void paint(Graphics g)
 {
   char ch,ch1;
   
   ch1=msg1.charAt(0);
   msg1=msg1.substring(1,msg1.length());
   msg1+=ch1;
   g.drawString(msg1 ,60,40);
   ch=msg.charAt(0);
   msg=msg.substring(1,msg.length());
   msg+=ch;
   g.drawString(msg ,50,30);
   
 }
}
