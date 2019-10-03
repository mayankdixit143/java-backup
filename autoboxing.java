import java.io.*;

class boxing
{
static int temp,x,y;
void swap(int a,int b)
{

x=temp;
x=y;
y=temp;
System.out.println("inside swap function");
System.out.println("x="+x+"y="+y);
}


public static void main(String args[])
{boxing b;

b.swap(10,20);
System.out.println("x="+x+"y="+y);
}
}
