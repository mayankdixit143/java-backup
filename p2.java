import java.io.*;
class p1
{
String name;
double bal;
 
p1(String n , double b)
{
name=n;
bal=b;
}

void show ()
{
 if(bal<0)
 System.out.println(" -->");
System.out.println(name + " $" + bal);
 }
}

class p2
{
public static void main(String args[])
{
 p1 p= new p1[3];

p[0]=new p1( " s", 67);
p[1] =new p1(" fh",-32);
p[2]= new p1(" fuck",4500);

for(int i=0;i<3;i++)
p[i].show();
}

}
