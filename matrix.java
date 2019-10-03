import.java.io*;
class matrix
{ BufferedReader br=new BufferedReader(new InputStreamReader(system.in));
int a[][]=new int[m][n];
int b[][]=new int[m][n];
int c[][]=new int[m][n];
void input()
{
system.out.println("enter rows");
int m=Integer.parseInt(br.readline());
System.out.println("enter columns");
int n=Integer.parseInt(br.readline());
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
system.out.println("enter elements of first array");
int s=Integer.parseInt(br.readLine());
a[i][j]=s;
}
}
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
system.out.println("enter elements of second array");
int k=Integer.parseInt(br.readLine());
a[i][j]=k;
}
}
void add()
{
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
c[i][j]=a[i][j]+b[i][j];
}
}
void display()
{
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
system.out.print("c[i][j]+" ");
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
void mult()
{
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
c[i][j]=0;
for(int k=0;k<n;k++)
{
c[i][j]=c[i][j]+a[i][j]*b[i][j];
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
c[i][j]=c[j][i];
}
}
}
}
class mainmatrix
{
public static void main(String arg[])throws IOexception
{
matrix m;
m.input();

do{

system.out.println("enter your choice");
System.out.println("1.addition");
System.out.println("2.subtraction");
System.out.println("3.multiplication");
System.out.println("4.transpose");
int c=Integer.parseInt(br.readLine());
switch(c)
{
case 1:
m.addition();
m.display();
break;
case 2:
m.diff();
m.display();
break;
case 3:
m.mult();
m.display();
break;
case 4:
m.transpose();m.display();
break;
}
System.out.println("do you want to enter more")
int ch=Integer.parseInt(br.readLine());
}
while(ch==1)
}
while(ch

