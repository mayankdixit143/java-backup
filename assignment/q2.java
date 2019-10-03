import java.io.*;
enum Salary
 {monthly,hourly;}
class Employee
{
 long id;String name;char c;Salary s1;
 void input()throws IOException,NullPointerException
  {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter id");
   id=Integer.parseInt(br.readLine());
   System.out.println("Enter name");
   name=(br.readLine());
   System.out.println("Enter 'm' if your salary is monthly otherwise Enter 'h'");
   c=(char)(System.in.read());
   if(c=='m')
    s1=Salary.monthly;
   if(c=='h')
    s1=Salary.hourly;
  }

 void display(int n)
  {
   System.out.println("The information of Employee " +(n+1)+ " : ");
   System.out.println("Name : "+name);
   System.out.println("ID : " +id);
   System.out.println("Your salary is paid : " +s1);
  }
}
 
class q2
{
 public static void main(String args[])throws IOException,NullPointerException
 {int i;
 Employee e[]=new Employee[5];
 for(i=0;i<5;i++)
  e[i]=new Employee();
 for(i=0;i<5;i++)
  {
   System.out.println("Enter the information of Employee " +(i+1));
   e[i].input();
  }
 for(i=0;i<5;i++)
  e[i].display(i);
 }
} 