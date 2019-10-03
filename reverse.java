import java.io.*;
class reverse
{
public static void main(String arg[])
{
 System.out.println(arg[0]);
int n=Integer.parseInt(arg[0]);

int reverse=0;
while(n!=0)
{
reverse=reverse*10;
reverse=reverse+n%10;
n=n/10;
}

System.out.println("reversed no is"+reverse);

}

}