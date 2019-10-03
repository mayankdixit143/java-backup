package pck1;
import java.io.*;
class test extends try1
{
void disp()
{
System.out.println("same package subclass");
System.out.println(def);
//System.out.println(pri); not accessible
System.out.println(prot);
System.out.println(pub);
}
}
class testnon
{
try1 t=new try1();
void disp()
{System.out.println("same package non subclass");
System.out.println(t.def);
//System.out.println(t.pri); not accessible
System.out.println(t.prot);
System.out.println(t.pub);
}
}
class main1
{
public static void main(String args[])
{
	test t1=new test();
	t1.disp();
	testnon t2=new testnon();
	t2.disp();
}
}