import java.lang.*;
public class Cons
{
public static void main(String [] args)
{ System.out.println(Byte.SIZE);
System.out.println(Byte.MIN_VALUE);
System.out.println(Byte.MAX_VALUE);
System.out.println(Byte.parseByte("20")+10);
System.out.println(Integer.SIZE);
System.out.println(Integer.MIN_VALUE);
System.out.println(Integer.MAX_VALUE);
System.out.println(Integer.parseInt("20")+10);
//primitive to object
int x=10;
Integer y=Integer.valueOf(x);
System.out.println(y);
Integer z=x;//Integer.valueOf(x)->autoboxing

System.out.println(z);
//object to primitive
/*Double d = new Double (10.25);
double a=d.doubleValue();
System.out.println(a);*/
//primitive to String
int p=10;
String s=Integer.toString(p);

System.out.println(s);
//String to primitive
String s1="123";
int q=Integer.parseInt(s1);

System.out.println(q);
//String to primitive another process
String s2="145";
int w=Integer.valueOf(s2);

System.out.println(w);
}
}