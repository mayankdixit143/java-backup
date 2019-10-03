import java.awt.*;
import java.applet.*;
/*<applet code="myapplet" width=200 height=300>
</applet>
*/
public class myapplet extends Applet
{
String msg;
public void init()
{
msg="my applet";
}
public void paint(Graphics g)
{
g.drawString(msg,20,20);
}
}