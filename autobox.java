import java.io.*;
class autobox
{
public static void main(String args[]) throws IOException
{Integer iob,iob2;
int i;
iob=100;
System.out.println("original value of iob:"+iob);
++iob;
System.out.println("after ++iob:"+iob);
iob2=iob+(iob/3);
System.out.println("iob2 after expression:"+iob2);
i=iob+(iob/3);
System.out.println("i after expression"+i);
}
}