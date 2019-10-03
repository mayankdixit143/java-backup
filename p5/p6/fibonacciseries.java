package p5.p6;
import java.io.*;
import java.util.*;
class fibonacci4 extends fib
{
   void fibon()
   {
   System.out.println("fibonacci series is");
   int a=0,b=1;
   int sum=0;
   System.out.print(a+" ");
   System.out.print(b+" ");
   while(n-2>0)
   {
   sum=a+b;
   a=b;
   b=sum;
   n--;
   System.out.print(sum+" ");
 }
}
}
class fibonacciseries
{
 public static void main(String args[])
{
fibonacci4 o1=new fibonacci4();
o1.getinput();
o1.fibon();
}
}