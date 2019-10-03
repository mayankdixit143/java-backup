import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* <applet code="simplekey" width=300 height=100>
</applet>
*/
public class simplekey extends Applet implements KeyListener
{
String msg="";
int X=10,Y=20;
public void init()
{
addKeyListener(this);
}
public void keyPressed(KeyEvent ke)
{showStatus("key down");
int simplekey=ke.getKeyCode();
switch(simplekey)
{
case KeyEvent.VK_F1:
msg+="<F1>";
break;
case KeyEvent.VK_F2:
msg+="<F2>";
break;
case KeyEvent.VK_F3:
msg+="<F3>";
break;
case KeyEvent.VK_PAGE_DOWN:
msg+="<PgDn>";
break;
case KeyEvent.VK_PAGE_UP:
msg+="<PgDn>";
break;
case KeyEvent.VK_LEFT:
msg+="<left arrow>";
break;
case KeyEvent.VK_RIGHT:
msg+="<right arrow>";
break;
}
repaint();

}
public void keyReleased(KeyEvent ke)
{
showStatus("key up");
}
public void keyTyped(KeyEvent ke)
{
msg +=ke.getKeyChar();
repaint();
}
public void paint(Graphics g)
{
g.drawString(msg,X,Y);
}
}
