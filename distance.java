import java.io.*;
class distance
{
int feet,inch;
	public static void main(String args[]) throws IOException 
	{ int feet, inch;
	distance temp= new distance();
	temp.incr();

	distance d1=new distance();
	d1.compute();
	distance d2=new distance();
	d2=d1;
	distance d3=new distance(d1);
	d2.compute();
	d3.compute();
}
distance()
{
inch=feet=0;
}
distance(int x)
{
inch++;
feet++;

}
distance(int y,int z)
{
this.feet=y;
this.inch=z;
}
distance(distance temp)
{
}
void compute()throws IOException
{
	float dist;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter the feet");
	int feet=Integer.parseInt(br.readLine());
	System.out.println("enter the inches");
	int inch=Integer.parseInt(br.readLine());
	while(inch>12)
	{	
	if(inch>=12)
		{
		feet+=1;
		inch=inch-12;
		}
}

	System.out.println("result is"+feet+"."+inch);

}
distance incr()
{
inch++;
feet++;
return this;
}

}