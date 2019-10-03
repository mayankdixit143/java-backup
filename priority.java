class priority extends Thread
{
public void run()
{
System.out.println("running thread name is"+Thread.currentThread().getName());
System.out.println("running thread priority is"+Thread.currentThread().getpriority());
}
public static void main(String args[])
{
priority m1=new priority();
priority m2=new priority();
m1.setPriority(Thread.MIN_PRIORITY);
m2.setPriority(Thread.MAX_PRIORITY);
m1.start();
m2.start();
}
}