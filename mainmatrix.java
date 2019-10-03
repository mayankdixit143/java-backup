import java.io.*;
class matrix
{       int m,n;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int a[][]=new int[10][10];
	int b[][]=new int[10][10];
	int c[][]=new int[19][10];
	void input() throws IOException
	{
		System.out.println("enter rows");
		 m=Integer.parseInt(br.readLine());
		System.out.println("enter columns");
		 n=Integer.parseInt(br.readLine());
		for(int i=0;i<m;i++)
			{
			for(int j=0;j<n;j++)
				{
				System.out.println("enter elements of first array");
				int s=Integer.parseInt(br.readLine());
				a[i][j]=s;
				}
			}

		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
			System.out.println("enter elements of second array");
			int k=Integer.parseInt(br.readLine());
			b[i][j]=k;
			}
		}
	}
	void add()
	{
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
		c[i][j]=a[i][j]+b[i][j];
		System.out.println(c[i][j]+" ");
			}
		}
	}
	void display()
	{
	for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}
	void diff()
	{
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
		c[i][j]=a[i][j]-b[i][j];
		}
	}
}
	void mult()
	{
	for(int i=0;i<m;i++)
		{
		for(int j=0;j<n;j++)
		{
			c[i][j]=0;
			for(int k=0;k<n;k++)
			{
			c[i][j]=c[i][j]+a[i][j]*b[i][k];
			}
		}
		}
	}
	void transpose()
	{
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
		a[i][j]=a[j][i];
		System.out.println(a[i][j]);
		}
	}
	}
}
class mainmatrix
{ 	 	
	public static void main(String arg[])throws IOException
	{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int ch;		
matrix m=new matrix();
		m.input();

		do
		{

			System.out.println("enter your choice");
			System.out.println("1.addition");
			System.out.println("2.subtraction");
			System.out.println("3.multiplication");
			System.out.println("4.transpose");
			int x=Integer.parseInt(br.readLine());
			switch(x)
			{
				case 1:
				{
					m.add();
					//m.display();
					break;
				}
				case 2:
				{	
					m.diff();
					m.display();
					break;
				}		
				case 3:
				{	
					m.mult();
					m.display();
					break;
				}
				case 4:
				{
				m.transpose();
				//m.display();
				break;
				}
		}
	System.out.println("do you want to enter more");
	ch=Integer.parseInt(br.readLine());
	}
	while(ch==1);
	}
}

