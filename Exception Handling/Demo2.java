import java.util.Scanner;
import java.io.IOException;
import java.util.*;


public class Demo2
{
	public static  void  division(int a,int b) throws IOException//throws use korle obossoi je method e eta use kora hobe oi method ke jekhan theke call deya hobe oikhane obbossoi exception handle korte hobe ta na hole compile time error hote pare nao pare but IOException compile time error catch kore tai ekhane compile error ashbe but ArithmeticException/NumberFormatException run time e show korbe
	{
		System.out.println(a/b);
	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		//division(2,3);
        try{		
		int a =sc.nextInt();
		int b =sc.nextInt();
		if(b==0){throw new ArithmeticException("Divided by zero not applicble");}
		if(b==10){throw new DividedByTenException("Divided by Ten not applicble");}
		if(b<0){throw new DividedByNegativeException("Divided by Negative not applicble");}
		division(a,b);
		//System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e)
		{
			System.out.println(e.getMessage());
		}
		catch(DividedByTenException e)
		{
			System.out.println(e);
		}
		catch(DividedByNegativeException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}