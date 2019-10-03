import java.net.*;
import java.io.*;
import java.util.*;

class UCDemo
{
  public static void main(String args[])throws IOException
  {
    int c;
    URL hp=new URL("www.rajgurucollege.com");

    URLConnection hpCon=hp.openConnection();

    long d=hpCon.getDate();
    if(d==0)
      System.out.println("NoP Date Information");
    else
      System.out.println("Date: "+new Date(d));
    System.out.println("Content-type: "+hpCon.getContentType());

    d=hpCon.getExpiration();
    if(d==0)
      System.out.println("No Expiration Information");
    else
      System.out.println("Expires: "+new Date(d));

    d=hpCon.getLastModified();
    if(d==0)
      System.out.println("No Last-Modified Information");
    else
      System.out.println("Last-Modified "+new Date(d));
    long len=hpCon.getContentLengthLong();

    if(len==-1)
      System.out.println("Content Length Unavailable");
    else
      System.out.println("Content-Length: "+len);
    if(len!=0)
     {
       System.out.println("=== Content ===");
       InputStream input=hpCon.getInputStream();
       while(((c=input.read())!=-1))
       {
         System.out.println((char)c);
       }
       input.close();
     }
    else
      System.out.println("No Content Available");
   }
}
