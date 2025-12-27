import java.lang.*;
class Book
{
	private String Book_title;
	private String Book_author;
	private String Book_ISBN;
	Book(String t,String a,String i)
	{
		Book_title=t;
		Book_author=a;
		Book_ISBN=i;
	}
	public String get_Book_title()
	{
		return Book_title;
	}
	public String get_Book_author()
	{
		return Book_author;
	}
	public String get_Book_ISBN()
	{
		return Book_ISBN;
	}
	public void showinfo()
	{
		System.out.println("Book Title: "+get_Book_title());
		System.out.println("Writer Name of "+get_Book_title()+" Book: "+get_Book_author());
		System.out.println("Book ISBN: "+get_Book_ISBN());
}
}
public class Xbook
{
	public static void main(String [] args)
	{
		Book B=new Book("The Law Of Darkside","MD. SAZZAD KHAN","958-12-3-564-6-694");
		B.showinfo();
	}
}