import java.io.*;
class IllegalOperation extends Exception
{
 public String toString()
  {
   return "IllegalOperation";
  }
}

class q4 
{
 public static void main(String args[])throws IllegalOperation,IOException
 {
  int a,b,c=0;char ch;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the two numbers");
  a=Integer.parseInt(br.readLine());
  b=Integer.parseInt(br.readLine());
    System.out.println("Enter '+'.for addition");
    System.out.println("      '-'.for substraction");
    System.out.println("      '*'.for multiplication");
    ch=(char)(System.in.read());
    switch(ch)
     {
      case '+':c=a+b;
               break;
      case '-':c=a-b;
               break;
      case '*':c=a*b;
               break;
      default:System.out.println("Wrong choice");
              throw new IllegalOperation();
     }
  System.out.println("The result after operation performed is : "+c);
 }
}