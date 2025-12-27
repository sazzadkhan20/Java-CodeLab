public class LibraryManagementSystem
{
	public static void main (String [] args)
	{
		Library L1=new Library("AC Library","Md. Azizur Rahman","Nikunjo-2,Dhaka",10000);
		L1.AddNewBook(new book("Dark-Side","Md. X","125655666","Horror",15));
		L1.AddNewBook(new book("Joker","Md. Z","98755455","History",5));
		L1.AddNewBook(new book("Howker","Md. Y","7845545","Geographical",20));
		L1.AddNewBook(new book("Old Man","Md. W","3659955","Funny",7));
		L1.showLibInfo();
		L1.DeleteBook("Howker");
		L1.showLibInfo();
		L1.AddNewBookCopy(new book("Strenger","Md. P","4575235","Interesting",23),21);
		L1.showLibInfo();
		L1.AddOldBookCopy("Joker",11);
		L1.showLibInfo();
		
	}
}