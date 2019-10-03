import java.io.*;
class myclass extends exception
{
public static void main(String args[]) throws IOException
{int sum=0,count,i;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
try
{
throw NegativeNumberException("you rnterd negative no");
System.out.println("how many numbers you want to enter");
int n=Integer.parseInt(br.readLine());
while(count==n)
{
int a[]=Integer.parseInt(br.readLine());
if(a[i]>0)
count++;
if(count==n)
break;
}
for(i=0;i<n;i++)
{
sum=sum+a[i];
}
System.out.println("sum is"+sum);
}
catch(NegativeNumberException e)
{
System.out.println(e);
}
}
}
