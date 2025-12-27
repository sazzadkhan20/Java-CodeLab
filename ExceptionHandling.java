import java.util.Scanner;

public class ExceptionHandling
{
	public static void main(String [] args)
	{
		/*try
		{
		int x=10;
		int y=0;
		int result=x/y;
		System.out.println("Summation: "+result);
		}
		catch(ArithmeticException a)
		{
		System.out.println("Exception: "+a);
		}
		catch(NullPointerException p)
		{
		System.out.println("Exception: "+p);
		}
		catch(Exception a)
		{
		System.out.println("Exception: "+a);
		}
		
		finally
		{
		System.out.println("Last Line Of Code");
		}*/
		while(true)
		{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.print("Please Enter num1: ");
		int a=sc.nextInt();
		System.out.print("Please Enter num2: ");
		int b=sc.nextInt();
		System.out.print("Result: "+a+"/"+b+" = "+(a/b)+"\n\n");
		}
		catch(Exception e)
		{
			System.out.println("Exception: "+e);
			System.out.println("You must enter Integer.Please Try again\nPlease enter an num1: \n\n\n");
		}
		}
		
		
	}
}