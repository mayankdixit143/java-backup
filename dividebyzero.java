import java.io.*;
class dividebyzero
{
public static void main(String args[]) throws IOException
{ 
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter value");
int a=Integer.parseInt(br.readLine());
System.out.println("enter denom");
int b=Integer.parseInt(br.readLine());
int c;
try{
c=a/b;
}
catch(ArithmeticException e)
{
System.out.println(e+ "attempt to divide by zero");
}
}
}