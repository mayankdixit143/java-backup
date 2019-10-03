package pck2;
import pck1.*;
class m1 extends try1
{
void display()
{System.out.println("diferent package subclass");
//System.out.println(pri); not accessible
System.out.println(pub);
//System.out.println(def); not accessible
System.out.println(prot);
}
}
class m2
{
try1 t2=new try1();
void display()
{System.out.println("diferent package non subclass");
//System.out.println(t2.pri); not accessible
System.out.println(t2.pub);
//System.out.println(t2.def); not accessible
//System.out.println(t2.prot); non accessible
}
}
class main2
{
public static void main(String args[])
{
m1 m=new m1();
m.display();
m2 ob=new m2();
ob.display();
}
}
