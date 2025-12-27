import java.lang.*;

import java.util.Scanner;

public class Mainbook
{
	public static void main(String [] args)
	{
		Scanner ScNum = new Scanner(System.in);
		Scanner ScArr = new Scanner(System.in);
		System.out.println("Please Enter array Size");
		int size =ScNum.nextInt();
		book [] Books = new book[size];
		//input
		System.out.println("Please Enter the Proper Data");
		for(int i=0; i<Books.length; i++)
		{
			System.out.println("Please Enter Book Name: ");
			String n=ScArr.nextLine();
			System.out.println("Please Enter Book Author: ");
			String a=ScArr.nextLine();
			System.out.println("Please Enter Book ID: ");
			String m=ScArr.nextLine();
			System.out.println("Please Enter Book Type: ");
			String t=ScArr.nextLine();
			System.out.println("Please Enter Book Copy: ");
			int c=ScNum.nextInt();
			Books[i] = new book(n,a,m,t,c);
			Books[i].bookCounter++;
			System.out.println("Please Enter Data One More Time ");
		
		}
		//output
		for(int i=0; i<Books.length; i++)
		{
			Books[i].ShowBookInfo();
			
		}
		book.totalNumberOfUniqueBooks();
		System.out.println("Please Enter the Array Index Number but not exceed "+(Books.length-1)+" Number and Enter Stored Book New Copy Number");
		Books[ScNum.nextInt()].AddBookCopy(ScNum.nextInt());
	}
}