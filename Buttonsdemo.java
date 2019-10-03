import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="Buttonsdemo" width=300 height=150>
</applet>
*/
public class Buttonsdemo extends Applet implements ActionListener 
{
 String msg=" ";
 Button one,two,three,four,plus,sub;
 public void init()
 {
  one=new Button ("1");
  two=new Button ("2");
  three=new Button ("3");
  four=new Button ("4");
  plus=new Button ("+");
  sub=new Button ("-");
 
  add(one);
  add(two);
  add(three);
  add(four);
  add(plus);
  add(sub);
  
  one.addActionListener(this);
  two.addActionListener(this);
  three.addActionListener(this);
  four.addActionListener(this);
  plus.addActionListener(this);
  sub.addActionListener(this);
 }

 public void actionPerformed(ActionEvent ae)
 {
  int sum;
  String str1=ae.getActionCommand();
  int c1=Integer.parseInt(str1);
  String str2= ae.getActionCommand();
  int c2=Integer.parseInt(str2);
  String str3=ae.getActionCommand();
  if(str3.equals("+"))
    sum=c1+c2;
  else
    sum=c1-c2;
  msg=Integer.toString(sum);
 repaint();
 }

 public void paint(Graphics g)
 {
  g.drawString(msg,6,100);
 }
}
    