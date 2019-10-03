import java.io.*;
class prime2 
{
public static void main(String arg[])
{
 System.out.println(arg[0]);
int x=Integer.parseInt(arg[0]);
System.out.println("prime no in the given range is");
for(int i=2;i<x;i++)
{
int flag=1;
for(int j=2;j<i;j++)
{
if(i%j==0)
flag=0;
}
if (flag!=0)
System.out.println(i);
}
}
}