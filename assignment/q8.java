import java.io.*;
class bank
{
 String name,branch;
 bank()
  {
   name=" ";
   branch=" ";
  }
 void input() throws IOException,NullPointerException
  {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("enter bank name");
   name=br.readLine();
   System.out.println("enter branch name ");
   branch=br.readLine();
  }
 void display()
  {
   System.out.println("Bank name is: "+name);
   System.out.println("Branch name is: "+ branch);
  }
}
 
class account extends bank
{
 String name1;
 long no;
 account()
 { 
  super();
  name1=" ";
  no=0;
  }
 void input() throws IOException,NullPointerException
  {
   super.input();
   BufferedReader cr=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("enter account holder");
   name1=cr.readLine();
   System.out.println("enter account no ");
   no=Integer.parseInt(cr.readLine());
   }
 void display()
{
  super.display();
  System.out.println("Account holder name is: "+name1);
   System.out.println("Account no is: "+ no);
  }
}

class q8
{
 public static void main(String args[])throws IOException,NullPointerException
  {
   account[] b=new account[10];
   for(int i=0;i<10;i++)
    b[i]=new account();
   for(int i=0;i<10;i++)
   {
    System.out.println("enter details of "+(i+1) + " customer");
    b[i].input();
   }
  for(int i=0;i<10;i++)
  {
   System.out.println("Details of "+(i+1)+" customer is:");
   b[i].display();
  }
}
}