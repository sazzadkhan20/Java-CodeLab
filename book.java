public class book
{
	private String bookName;
   private String bookAuthor; 
    private String bookId ;
   private String bookType ;
   private int bookCopy ;// how many copy ;
   static int bookCounter=0;
   book()
   {
	   System.out.println("E-cons");
   }
   book(String n,String a,String i,String t,int c)
   {
	   set_bookName(n);
	   set_bookAuthor(a);
	   set_bookId(i);
	   set_bookType(t);
	   set_bookCopy(c);
	   bookCounter++;
	}
   public void set_bookName(String n)
   {
	   bookName=n;
   }
    public void set_bookAuthor(String a)
   {
	   bookAuthor=a;
   }
    public void set_bookId(String i)
   {
	   bookId=i;
   }
    public void set_bookType(String t)
   {
	   bookType=t;
   }
    public void set_bookCopy(int c)
   {
	   bookCopy=c;
   }
    public String get_bookName()
   {
	   return bookName;
   }
   public String get_bookAuthor()
   {
	   return bookAuthor;
   }
   public String get_bookId()
   {
	   return bookId;
   }
   public String get_bookType()
   {
	   return bookType;
   }
   public int get_bookCopy()
   {
	   return bookCopy;
   }
   public void ShowBookInfo()
   {
	   System.out.println("Book Name : "+get_bookName());
	   System.out.println("Book Author : "+get_bookAuthor());
	   System.out.println("Book ID : "+get_bookId());
	   System.out.println("Book Type : "+get_bookType());
	   System.out.println("Book Copy : "+get_bookCopy());
	   System.out.println("-----------\n-----------");
   }
   public void AddBookCopy(int x)
   {
	   set_bookCopy((get_bookCopy()+x));
	  // get_bookCopy()=get_bookCopy()+x;
	   System.out.println(get_bookName()+" Book New Copy added "+x+"\n\nAnd Now "+get_bookName()+" Book Copy is "+get_bookCopy());
   }
  public static void totalNumberOfUniqueBooks()
   {
	   System.out.println("Total Number Of Unique Books are : "+bookCounter);
   }
}
	   