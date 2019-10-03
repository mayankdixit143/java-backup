import java.io.*;
import java.net.*;
class writeserver
{
	
	public static int serverport=49152;
	public static int clientport=49153;
	public static int buffer_size=1024;
	public static DatagramSocket ds;
	public static byte buffer[]=new byte[buffer_size];
	public static void TheServer() throws Exception
	{
	int pos=0;
	while(true)
	{
		char c=(char)System.in.read();
		switch(c)
		{
			case '1':
			{
System.out.println("Local host"+InetAddress.getLocalHost());
			System.out.println("server quits:");
			ds.close();
			
			return;
			}
			case '\r':
			break;
			case '\n':
System.out.println("Local host"+InetAddress.getLocalHost());
			ds.send(new DatagramPacket(buffer,pos,InetAddress.getLocalHost(),clientport));
			pos=0;
			break;
			default:
				buffer[pos++]=(byte)c;
		}
	}
}
public static void TheClient()throws Exception
{
	while(true)
		{
		DatagramPacket p=new DatagramPacket(buffer,buffer.length);
System.out.println("before receive");
		ds.receive(p);
System.out.println("after receive");
		System.out.println(new String(p.getData(),0,p.getLength()));
		}
}
public static void main(String args[]) throws Exception
{
if(args.length==1)
{
ds=new DatagramSocket(serverport);
TheServer();
}
else
{ds=new DatagramSocket(clientport);

TheClient();
}
}
}

