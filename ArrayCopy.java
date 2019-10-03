import java.io.*;
class ArrayCopy
{
public static void main(String args[])throws IOException {
	int a[]=new int[10];
	int b[]=new int[10];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the size");
int n=Integer.parseInt(br.readLine());
System.out.println("enter the array");
for(int i=0;i<n;i++)
a[i]=Integer.parseInt(br.readLine());
for(int i=0;i<n;i++)
{
b[i]=a[i];
}
System.out.println("array after copying");
for(int i=0;i<n;i++)
System.out.println(b[i]);
}
}