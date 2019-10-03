import java.io.*;
class factorial
{
	public static void main(String args[])throws IOException
	{int n,fact=1;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter the no");
        n=Integer.parseInt(br.readLine());
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
}
System.out.println("factorial of "+n+" is: "+fact);
}
} 