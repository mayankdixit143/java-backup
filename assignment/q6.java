import java.io.*;
public class q6
{
 static int mult(int n,int m)
  {
   if(m==0)
     return 0;
   else
     return n+mult(n,m-1);
  }
 public static void main(String a[])throws IOException
  {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter the two numbers");
   int n1=Integer.parseInt(br.readLine());
   int m1=Integer.parseInt(br.readLine());
   System.out.println("The result is : " +(mult(n1,m1)));
  }
}