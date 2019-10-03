import java.io.*;
class myexception{
public static void main(String args[])throws IOException
{
int a,b;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter dividend");
a=Integer.parseInt(br.readLine());
System.out.println("enter divisor");
b=Integer.parseInt(br.readLine());
try{
int c=a/b;
}
catch(ArithmeticException e)
{
System.out.println("you entered 0.please enter another number");
}
System.out.println("exiting");
}
}



