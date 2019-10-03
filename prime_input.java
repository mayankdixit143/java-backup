import java.io.*;
class prime_input
{
public static void main(String arg[])throws IOException
{
 BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the no");
int a=Integer.parseInt(b1.readLine());
System.out.println("prime no in the given range is");
for(int i=2;i<a;i++)
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