import java.io.*;
enum Employee
{
 monthly,hourly;
}

public class que2
{
 Employee salary(char ch)
  {
    if(ch=='m')
     return Employee.monthly;
    else
     return Employee.hourly;
  }
 public static void main(String args[])throws IOException
  {
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    Employee em[]=new Employee[10];
    for(int i=0;i<10;i++);
     {
       System.out.println("Enter the mode of your payment whether salaried or hourly");
       char ch1=(char)(br.readLine());
       em[i].salary(ch1);
     }
  }
}