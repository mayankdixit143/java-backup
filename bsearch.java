import java.io.*;
class bsearch
{ public static void main(String arg[])throws IOException
{	int mid=0;
	int flag=0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter the size of array");
	int n=Integer.parseInt(br.readLine());
	int a[]=new int[n];
	for(int i=0;i<n;i++)
		{
		System.out.println("enter elements of array");
		int p=Integer.parseInt(br.readLine());
		a[i]=p;
		}
	System.out.println("enter element to be searched");
	int k=Integer.parseInt(br.readLine());
	int beg=0;
	int end=n-1;
	while(beg<=end)
		{
		mid=(beg+end)/2;
		if(a[mid]==k)
		{
			flag=1;
			System.out.println("element found at"+(mid+1));
			break;
		}
		else if(k>a[mid])
		beg=mid+1;
		else
		end=mid-1; 
		}
if(flag==0)
System.out.println("element not found");
}
}