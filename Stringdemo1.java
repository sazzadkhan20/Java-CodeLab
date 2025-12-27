import java.lang.*;
public class Stringdemo1
{
	public static void main(String args [])
	{
     String S1="Hello";
	 String S2="hello  World";
	 int a=5;
	 int b=5;
	 String S3=new String("Hello");
	 String S4=new String("World");
	 //S1=S1+" "+S4;
	 /*S1=S1+" "+S2+" And Bangladesh";
	 S1=S1.concat("").concat(S2).concat("Bangladesh").concat(" I Live In BD").concat(S2);
	 S3=S3+" "+S4;
	 System.out.println(S1==S2);
	 System.out.println(S1==S3);
	 System.out.println(a==b);
	 System.out.println(S1);
	 System.out.println(S2);
	 System.out.println(S1.equals(S3));
	 System.out.println(S1.length());
	 System.out.println(S1.charAt(10));
	 System.out.println(S1.compareTo(S2));
	 System.out.println(S1.indexOf('M'));
	 System.out.println(S1.substring(5));
	 System.out.println(S1.substring(7,12));
	 System.out.println(S1.toUpperCase());
	 System.out.println(S1.toLowerCase());
	 System.out.println(S1.toUpperCase(0,6));
	 System.out.println(S1.toLowerCase(8,13));*/
	System.out.println(S1.charAt(S1.length()-1));
	 System.out.println(S2.indexOf("Wor"));
	 System.out.println(S1.substring(S1.indexOf("l"),S1.length()));
	 System.out.println(S2.substring(0,7));
	 System.out.println(S2.substring(3));
	 System.out.println(S1.compareTo(S2));
	}
}