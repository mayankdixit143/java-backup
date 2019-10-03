import java.io.*;
class linear_search
{
public static void main(String args[]) throws IOException
{
int array[][];
 array=new int[5][5];
array[0]=1;
array[1]=4;
array[2]=5;
array[3]=7;
array[4]=6;

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("ENter the no to be searched");
int search=Integer.parseInt(br.readLine());
for(int i=0;i<5;i++)
{
if(array[i]==search)
{
System.out.println("number found");
break;
}
else 
{
System.out.println("no not found");
break;
}


}

}

}