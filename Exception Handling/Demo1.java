import java.util.Scanner;
import java.io.IOException;
import java.util.*;


public class Demo1
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
        try{		
		int a =sc.nextInt();
		int b =sc.nextInt();
		if(b==0){throw new ArithmeticException("Divided by zero not applicble");}
		if(b==10){throw new DividedByTenException("Divided by Ten not applicble");}
		if(b<0){throw new DividedByNegativeException("Divided by Negative not applicble");}
		
		System.out.println(a/b);
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