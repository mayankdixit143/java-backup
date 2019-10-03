import java.io.*;
class arr
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a[]=new int[10];
System.out.println("enter the size of array");
int n=Integer.parseInt(br.readLine());
for(int i=0;i<n;i++)
{
System.out.println("enter the no to be stored in array");
a[i]=Integer.parseInt(br.readLine());
}
System.out.println("your array is");
for(int i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}
