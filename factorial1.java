import java.io.*;
class factorial1
{
public static void main(String args[]) throws IOException
{
int fac=1;
BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the value");
int a=Integer.parseInt(b1.readLine());
for(int i=a;i>0;i--)
{
fac=fac*i;
}
System.out.println("the factorial of the no"+fac);
}
}