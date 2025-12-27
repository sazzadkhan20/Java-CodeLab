import java.lang.*;

public class StringDemo2
{
	public static void main(String [] args)
	{
		String s1="Sazzad Khan ad K";
		String s2=new String("   sazzad khan    ");
		char [] s3={'s','a','z','z','a','d'};
		System.out.println(s3);
		for(char x : s3)
		{ 
			System.out.print(x);
		}
		System.out.println("\n"+("Sazzad Khan").contains("dKha"));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.isEmpty());
		System.out.println(s1.startsWith("Saz"));
		System.out.println(s1.endsWith("Kh"));
		System.out.println(s1.charAt(10));
		System.out.println(s1.indexOf("ad K"));
		System.out.println(s2.trim());
		System.out.println(s1.lastIndexOf("ad K"));
		System.out.println(s1.codePointAt(0));
		System.out.println(s1.compareTo("Sazzad hs"));
		System.out.println(s1.substring(1,5));
		System.out.println(s1.replace("ad K","k"));
		//String [] s4=s1.split(" ");
		for(String x: s1.split(" ") )
		{
			System.out.println(x);
		}
		StringBuffer s5=new StringBuffer("Md. Sazzad Khan ");
		System.out.println(s5.append(123));
		System.out.println(s5);
		s5.reverse();
		System.out.println(s5);
		//s5.delete(0,5);
		//System.out.println(s5);
		s5.setLength(6);
		System.out.println(s5);
		String S1="madam";
		StringBuffer S2=new StringBuffer(S1);
		String S3=S2.reverse().toString();
		if(S1.equals(S3))
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}