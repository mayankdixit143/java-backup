import java.io.*;
class cud
{
void show (String n,double b)
{
  
 if(bal<0)
 System.out.println(" -->");
System.out.println(n + " $" + b);

 }
}

class pck
{
public static void main(String args[]) throws IOException
{
cud obj;
BufferedReader br =new BufferedReader (new InputStreamReader (System.in));
System.out.println("ENTER SIZE OF ARRAY:");
int n = Integer.parseInt(br.readLine());
double a[]=new double[n];
String b[]=new String[n];
for(int j=0;j<n;j++)
{
System.out.println("ENTER NAME AND BALANCE :");
String s=br.readLine();
double d= Double.parseDouble(br.readLine());
a[j]=d;
b[j]=s;
}
for(int i=0;i<n;i++)
{
 obj.show(b[i],a[i]);
}

}
}       