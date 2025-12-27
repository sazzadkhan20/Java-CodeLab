public class Library
{
	private String libName;
	private String librarian;
	private String libAddress;
	private book [] booklist;
	public Library()
	{
		System.out.println("Books Help Enhance Knowledge");
		libName="No Name";
		librarian="No Name";
		libAddress="No Address";
		booklist=new book[1000];
	}
	public Library(String libName,String librarian,String libAddress,int size)
	{
		System.out.println("Books Help Enhance Knowledge");
		this.libName=libName;
		this.librarian=librarian;
		this.libAddress=libAddress;
		booklist=new book[size];
	}
	public void setLibName(String ln)
	{
	    libName=ln;
	}
	public void setLibrarian(String li)
	{
	    librarian=li;
	}
	public void setLibAddress(String la)
	{
	    libAddress=la;
	}
	public String getLibName()
	{
	   return libName;
	}
	public String getLibrarian()
	{
	   return librarian;
	}
	public String getLibAddress()
	{
	   return libAddress;
	}
	public void AddNewBook(book b)
	{
		boolean flag=false;
		for(int i=0; i<booklist.length; i++)
		{
			if(booklist[i]==null)
			{
				booklist[i]=b;
				flag=true;
				break;
			}
		}
			if(flag)
			{
				System.out.println("Book Successfully Store into Library");
			}
			else
			{
				System.out.println("Book does not Store into Library");
			}
	}
	public void DeleteBookByObject(book b)
	{
		boolean flag=false;
		for(int i=0; i<booklist.length; i++)
		{
			if(booklist[i]!=null && booklist[i]==b)
			{
				booklist[i]=null;
				flag=true;
				break;
			}
		}
			if(flag)
			{
				System.out.println("Book Successfully Remove into Library");
			}
			else
			{
				System.out.println("Book does not Remove into Library");
			}
	}
	public void DeleteBookByName(String bn)
	{
		boolean flag=false;
		for(int i=0; i<booklist.length; i++)
		{
			if(booklist[i]!=null && booklist[i].get_bookName().equals(bn))
			{
				booklist[i]=null;
				flag=true;
				break;
			}
		}
			if(flag)
			{
				System.out.println(bn+" Book Successfully Remove into Library");
			}
			else
			{
				System.out.println(bn+" Book does not Remove into Library");
			}
	}
	public void AddNewBookCopy(book b,int copy)
	{
		boolean flag=false;
		for(int i=0; i<booklist.length; i++)
		{
			if(booklist[i]==null)
			{
				booklist[i]=b;
				booklist[i].set_bookCopy(booklist[i].get_bookCopy()+copy);
				flag=true;
				break;
			}
		}
			if(flag)
			{
				System.out.println("Book Copy Successfully Store into Library");
			}
			else
			{
				System.out.println("Book Copy does not Store into Library");
			}
	}
	public void AddOldBookCopy(String bn,int copy)
	{
		boolean flag=false;
		for(int i=0; i<booklist.length; i++)
		{
			if(booklist[i]!=null && booklist[i].get_bookName().equals(bn))
			{
				booklist[i].set_bookCopy(booklist[i].get_bookCopy()+copy);
				flag=true;
				break;
			}
		}
			if(flag)
			{
				System.out.println(bn+" Book Copy Successfully Store into Library");
			}
			else
			{
				System.out.println(bn+" Book Copy does not Store into Library");
			}
	}
	public void showLibInfo()
	{
		System.out.println("Library Name: "+getLibName());
		System.out.println("Librarian Name: "+getLibrarian());
		System.out.println("Library Address: "+getLibAddress());
		for(int i=0; i<booklist.length; i++)
		{
			if(booklist[i]!=null)
			{
			booklist[i].ShowBookInfo();
			}
		}
	}
	
	
	
	
}