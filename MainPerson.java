import java.lang.*;

import java.util.Scanner;

public class MainPerson
{
	public static void main(String [] args)
	{
		Scanner ScNum=new Scanner(System.in);
		Scanner ScStr=new Scanner(System.in);
		int a=ScNum.nextInt();
		String b=ScStr.nextLine();
		Person obj1=new Person(b,a);
		obj1.sayHello();
		obj1.haveBirthday();
		obj1.sayHello();
	}
}