import java.lang.*;

import java.util.Scanner;
public class MainContact
{
	public static void main(String [] args)
	{
		Scanner ScNum = new Scanner(System.in);
		Scanner ScArr = new Scanner(System.in);
		System.out.println("Please Enter array Size");
		int size =ScNum.nextInt();
		Contact [] Contacts = new Contact[size];
		//input
		System.out.println("Please Enter the Proper Data");
		for(int i=0; i<Contacts.length; i++)
		{
			System.out.println("Please Enter Person Name: ");
			String n=ScArr.nextLine();
			System.out.println("Please Enter Person ID: ");
			String a=ScArr.nextLine();
			System.out.println("Please Enter Person Age: ");
			int m=ScNum.nextInt();
			System.out.println("Please Enter Person 11 Digit BD Mobile Number : ");
			String t=ScArr.nextLine();
			if(t.length()!=11)
			{
				System.out.println("You Enter a Invalid Phone Number,Please Enter a 11 Digit BD Number ");
				 t=ScArr.nextLine();
				 if(t.length()!=11)
				 {
				 System.out.println("You Enter a Invalid Phone Number,Please Enter Last time a 11 Digit BD Number ");
				 t=ScArr.nextLine();
				 }
					
			}
			System.out.println("Please Enter Person Gender : ");
			char c=ScArr.nextLine().charAt(0);
			Contacts[i] = new Contact(n,a,m,t,c);
			System.out.println("Please Enter Data One More Time ");
		
		}
		//output
		for(int i=0; i<Contacts.length; i++)
		{
			Contacts[i].ShowPersonInfo();
			
		}
        System.out.println("Please ENTER Array Index number but not exceed "+(Contacts.length-1));
        Contacts[ScNum.nextInt()].DetectMobileOperator();		
	}
}