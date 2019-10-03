class Box
{
int a;
int b;
int c;
 Box(int a,int b,int c)
 {
  this.a=a;this.b=b;this.c=c;
 }
 public String toString()
 {
  return "a: "+a+" b: "+b+" c: "+c;
 }
}
class Box2
{
 public static void main(String args[])
 {	
  Box ob=new Box(3,4,5);
  System.out.println(ob);
 }
}