import java.awt.*;
import java.applet.*;
import java.net.*;
/*<applet code="bases" width=800 height=300>
</applet>
*/
public class bases extends Applet
{
public void paint(Graphics g)
{
String msg;
URL url=getCodeBase();
msg="Code base"+url.toString();
g.drawString(msg,10,20);
url=getDocumentBase();
msg="document base"+url.toString();
g.drawString(msg,10,40);
}
}