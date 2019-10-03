import java.io.*;
class newthread implements Runnable
{
 Thread t;
 newthread()
  {
   t=new Thread(this,"Demo Thread");
   t.start();
  }
 public void run()
  {
   try
   {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter the range upto where you want to find the prime numbers");
   int n=Integer.parseInt(br.readLine());
   System.out.println("Enter the value of x and y");
   int x=Integer.parseInt(br.readLine());
   int y=Integer.parseInt(br.readLine());
   for(int i=2;i<n;i++)
    {
     int flag=1;
     for(int j=2;j<i;j++)
      {
       if(i%j==0)
        flag=0;
      }
     if (flag!=0)
       System.out.println("prime no: " +i);  
    }
   if (x == 0)
    System.out.println("The power of x and y is : " +1);
   else
   {
    int answer = x;
    int increment = x;
    int i, j;
    for(i = 1; i < y; i++)
    {
     for(j = 1; j < x; j++)
     {
        answer += increment;
     }
     increment = answer;
    }
    System.out.println("The power of x and y is : " +answer);
   }
   }
   catch(IOException e){}
  }
}

public class q1
{
 public static void main(String args[])
  {
   new newthread();
  }
}
