import java.awt.*;
import java.applet.*;
/*
<applet code="simplebanner" width=300 height=50>
</applet>
*/

public class simplebanner extends Applet implements Runnable
{
String msg="a simple moving banner.";
Thread t=null;
int state;
boolean stopflag;
public void init()
{
setBackground(Color.cyan);
setForeground(Color.red);
}
public void start()
{
t=new Thread(this);
stopflag=false;
t.start();
}
public void run()
{
char ch;
for(; ;)
{
try{
repaint();
Thread.sleep(250);
ch=msg.charAt(0);
msg=msg.substring(1,msg.length());
msg+=ch;
if(stopflag)
break;
}catch(InterruptedException e)
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
g.drawString(msg,50,30);
}
}