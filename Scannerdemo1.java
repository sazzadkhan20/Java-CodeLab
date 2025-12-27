import java.lang.*;
import java.util.Scanner;
public class Scannerdemo1
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		
		int age=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(age);
		System.out.println(b);
		System.out.println("Your age is: "+sc.nextInt());
	}
}