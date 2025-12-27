import java.lang.*;

import java.util.Scanner;

public class Arraydemo2
{
	public static void main(String [] args)
	{
		/*Scanner scNum= new Scanner(System.in);
		Scanner scStr=new Scanner(System.in);
		int size=scNum.nextInt();
		char [] numbers=new char[size];
		for(int i=0; i<numbers.length; i++)
		{
			numbers[i]=scNum.next().charAt(0);

		}
		for(int i=0; i<numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}*/
		Scanner scNum= new Scanner(System.in);
		Scanner scStr=new Scanner(System.in);
		int size=scNum.nextInt();
		String [] numbers=new String[size];
		for(int i=0; i<numbers.length; i++)
		{
			numbers[i]=(scStr.nextLine()).substring(0,3);

		}
		for(int i=0; i<numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}
	}
}
		
