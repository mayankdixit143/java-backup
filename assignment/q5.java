import java.io.*;
public class q5 {

String reverse = "";
	
	public String reverseString(String str){
		
		if(str.length() == 1){
			return str;
		} else {
			reverse += str.charAt(str.length()-1)
					+reverseString(str.substring(0,str.length()-1));
			return reverse;
		}
	}
	
	public static void main(String a[])throws IOException
      {
		q5 srr = new q5();
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the string");
                String str=br.readLine();
		System.out.println("Result: "+srr.reverseString(str));
	}
}
