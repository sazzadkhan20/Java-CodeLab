import java.lang.*;

public class MainPhoneBook
{
	public static void main(String [] args)
	{
		
		PhoneBook ph=new PhoneBook(10000);
		ph.addContact(new ContactNum("Sazzad","01748585992"));
		ph.addContact(new ContactNum("Sad","01958654554"));
		ph.addContact(new ContactNum("Raj","01869485898"));
		ph.show();
		ph.deleteContact("Sad");
		ph.show();
		ph.serachContact("01869485898");
		ph.updateContact("Sazzad");
		ph.show();
		
		
		
		
		
		
		
		
		
		
		
		
		/*double a=5,b=10;
		double c;
		c=Math.pow((a*a)+(b*b),2);
		System.out.println(c);
		double d=Math.sqrt((a*a)+(b*b));//Math.cbrt(a)-> ghonomul formula
		System.out.println(d);*/
		 
	}
}
	
