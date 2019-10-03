import java.io.*;
class myexception extends Exception
{
public static void main(String args[])throws IOException
{
int n,a[],b=0,i;
System.out.println("total numbers");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
n=Integer.parseInt(br.readLine());
a=new int[n];
for(i=0;i<n;i++)
{
System.out.println("enter the numbers");
a[i]=Integer.parseInt(br.readLine());
}
for(i=0;i<n;i++)
{
try
{
System.out.println("i="+i);
if(a[i]>0)
b=b+a[i];
else
throw new ArithmeticException("negative number");
}
catch(ArithmeticException e)
{
System.out.println(e);
System.out.println("enter another number");
a[i]=Integer.parseInt(br.readLine());
i--;
}
}
System.out.println("sum is"+b+"i="+i);
}
}
