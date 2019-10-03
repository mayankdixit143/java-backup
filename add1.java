import java.io.*;
class add1
{
public static void main(String args[]) throws IOException
{
int sum=0,i;
BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
for(i=0;i<Integer.parseInt(args[0]);i++)
{
System.out.println("enter the no");
int x=Integer.parseInt(b1.readLine());
sum=sum+x;
}
System.out.println("the sum of the entered"+sum);
}
}