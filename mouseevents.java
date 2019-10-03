import java.awt.*;
import java.awt.event.*;
import java.applrt.*;
/*applet code="mouse" width=300 height=100>
</applet>
*/
public class mouse extends Applet implements MouseListener
{
String msg="";
int mouseX=0,mouseY=0;
public void init()
{
addMouseListener(this);
}
public void mouseClicked(MouseEvent me)
{
mouseX=0;
mouseY=10;
msg="Mouse clicked";
repaint();
}

public void mouseEntered(MouseEvent me)
{
mouseX=0;
mouseY=10;
msg="Mouse entered";
repaint();
}


public void mouseExited(MouseEvent me)
{
mouseX=0;
mouseY=10;
msg="Mouse exited";
repaint();
}

public void mouseClicked(MouseEvent me)
{
mouseX=0;
mouseY=10;
msg="Mouse clicked";
repaint();
}

public void mousePressed(MouseEvent me)
{
mouseX=0;
mouseY=10;
msg="Mouse pressed";
repaint();
}


public void mouseReleased(MouseEvent me)
{
mouseX=0;
mouseY=10;
msg="Mouse released";
repaint();
}

public void paint(Graphics g)
g.drawString(msg, mouseX, mouseY);
}
}