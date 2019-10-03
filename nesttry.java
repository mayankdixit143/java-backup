class nesttry
{
public static void main(String args[])
{
	int c[]={1};
try
{
	int a=args.length;
	int b=42/a;
	System.out.println("a="+a);
try
{
	if(a==1)
	a=a/(a-a);
	if(a==2)
{

	c[42]=99;
}
}

	catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("array index out of bounds"+e);
}
}
catch(ArithmeticException e)
{
System.out.println("divide by zero"+e);
}


}
}
