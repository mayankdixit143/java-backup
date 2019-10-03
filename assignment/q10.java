import java.io.*;
class q10
{
 public static void main(String args[]) throws IOException
 {
  int count=0,i1=0,n;
  String a[]=new String[250];
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("enter the size of string");
  n=Integer.parseInt(br.readLine());  
  System.out.println("enter the string");
  for(int i=0;i<n;i++)
    a[i]=br.readLine();
  for(int i=0;i<n;i++)
   {i1=0;
    while(i1!=-1)
     {
       i1=a[i].indexOf('t',i1);
       if(i1== -1)
          break;
       else
        {
          if(a[i].substring(i1,i1+4)=="the ");
          count++;
          i1++;
        }
     }
   }
   System.out.println("The number of 'the' in the string is : "+count);
 } 
}