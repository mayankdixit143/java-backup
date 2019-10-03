import java.io.*;
class prime
{
public static void main (string args[])throws IOException
{
int fac=1;
BufferedReader b1=new BufferedReader(new inputStreamReader(system.in));
System.out.println("enter the no");
int a=Integer.parseInt(b1.readLine());
for(int i=2;i<2;i++)
{
if(a%i!=0)
flag= 1;
break;
}
if(flag==1)
System.out.print("not prime no");
else
System.out.print("prime no");
}
}