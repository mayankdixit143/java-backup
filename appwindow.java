import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class appwindow extends Frame
{
	String keymsg="this is a test";
	String mousemsg="";
int mousex=30, mousey=30;
public appwindow()
{
addKeyListener(new mykeyadapter(this));
addMouseListener(new mymouseadapter(this));
addWindowListener(new mywindowadapter());
}
public void paint(Graphics g)
{
g.drawString(keymsg,10,40);
g.drawString(mousemsg,mousex,mousey);
}
public static void main(String args[])
{
appwindow appwin=new appwindow();
appwin.setSize(new Dimension(300,200));
appwin.setTitle("an awt based program");
appwin.setVisible(true);
}
}
class mykeyadapter extends KeyAdapter
{
appwindow app;
public mykeyadapter(appwindow app)
{
this.app=app;
}
public void keyTyped(KeyEvent ke)
{
app.keymsg+=ke.getKeyChar();

app.repaint();
};
}
class mymouseadapter extends MouseAdapter{
appwindow app;
public mymouseadapter(appwindow app)
{
this.app=app;
}
public void mousePressed(MouseEvent me)
{
app.mousex=me.getX();
app.mousey=me.getY();
app.mousemsg="mouse down at"+app.mousex+","+app.mousey;
app.repaint();
}
}
class mywindowadapter extends WindowAdapter{
public void WindowClosing(WindowEvent we){
System.exit(0);
}
}