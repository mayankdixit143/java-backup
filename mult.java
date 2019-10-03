import java.io.*;
class Q
{
	int n;
	boolean valueset=false;
	synchronized int get()
	{
	while(!valueset)
		
		try
			{
			wait();
			}
		catch(InterruptedException e)
		{
		System.out.println("InterruptedException caught");
		}
		System.out.println("got:"+n);
		valueset=false;
		notify();
		return n;
	}

synchronized void put(int n)
{
	while(valueset)	

	try
		{
		wait();
		}
	catch(InterruptedException e)
	{
	System.out.println("Interrupted exception caught");
	}
this.n=n;

valueset=true;
System.out.println("put:"+n);
notify();
}
}
class producer implements Runnable
{
	Q q;
	producer(Q q)
	{
	this.q=q;
	new Thread(this,"producer").start();
	}
public void run()
{
int i=0;
while(true)
{
q.put(i++);
}
}
}
class consumer implements Runnable{
Q q;
consumer(Q q)
{
this.q=q;
new Thread(this,"Consumer").start();
}
public void run()
{
while(true)
{
q.get();
}
}
}
class mult{
public static void main(String args[])
{
Q q=new Q();
new producer(q);
new consumer(q);
System.out.println("press Control-c to stop");
}
}
