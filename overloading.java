import java.io.*;
class overloading
{ float sum;
	public static void main(String arg[])throws IOException
	{
	
	overloading o1=new overloading();
	o1.add(4,5);
	o1.add(2);	
}
	void add(double x,int y)
	{System.out.println(x);
	System.out.println(y);
	}
	void add(float x)
	{

	System.out.println(x);
	}
	
}