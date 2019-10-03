import java.io.*;
class NewThread implements Runnable
{
String name;
Thread t;
NewThread(String threadname, int j)
{
name=threadname;
t=new Thread(this,threadname);
t.setPriority(j);
System.out.println("new thread:"+t +"Priority ="+t.getPriority());
t.start();
}
public void run()
{
try{
for(int i=5;i>0;i--)
{
System.out.println(name+":"+i);
Thread.sleep(1000);
}
}
catch(InterruptedException e)
{
System.out.println(name+"interrupted");
}
System.out.println(name+"exiting.");
}
}
class Multithreaddemo
{
public static void main(String args[])
{
new NewThread("one",10);
new NewThread("two",1);
new NewThread("three",1);
try
{
Thread.sleep(10000);
}
catch(InterruptedException e)
{
System.out.println("main thread interrupted");
}
System.out.println("main thread exiting");
}
}

