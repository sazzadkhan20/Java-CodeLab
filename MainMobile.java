import java.lang.*;

import java.util.Scanner;

public class MainMobile 
{
	public static void main(String [] args)
	{
		Scanner ScNum = new Scanner(System.in);
		Scanner ScArr = new Scanner(System.in);
		System.out.println("Please Enter array Size");
		int size =ScNum.nextInt();
		Mobile [] Mobiles = new Mobile[size];
		//input
		System.out.println("Please Enter the Proper Data");
		for(int i=0; i<Mobiles.length; i++)
		{
			System.out.println("Please Enter Mobile Owner Name: ");
			String n=ScArr.nextLine();
			System.out.println("Please Enter 11 Digit BD Mobile Number: ");
			String a=ScArr.nextLine();
			if(a.length()!=11)
			{
				System.out.println("You Enter a Invalid Phone Number,Please Enter a 11 Digit BD Number ");
				 a=ScArr.nextLine();
				 if(a.length()!=11)
				 {
				 System.out.println("You Enter a Invalid Phone Number,Please Enter Last time a 11 Digit BD Number ");
				 a=ScArr.nextLine();
				 }
					
			}
			System.out.println("Please Enter Mobile Balance : ");
			double m=ScNum.nextDouble();
			if(m<0)
			{
				System.out.println("You Enter Invalid Mobile Balance Number,Please Enter a Positive Number ");
				 m=ScNum.nextDouble();
			}
			System.out.println("Please Enter Mobile OS Name : ");
			String t=ScArr.nextLine();
			System.out.println("Please Enter Mobile is  Lock or not,if mobile lock then please Rigth true,otherwise you rigth false ");
			boolean c=ScNum.nextBoolean();
			Mobiles[i] = new Mobile(n,a,m,t,c);
			System.out.println("Please Enter Data One More Time ");
		
		}
		//output
		for(int i=0; i<Mobiles.length; i++)
		{
			Mobiles[i].ShowInfo();
			
		}
		System.out.println("Please Enter Array Index number but not exceed "+(Mobiles.length-1));
		int b=ScNum.nextInt();
		if(Mobiles[b].get_lock()==false)
		{
        System.out.println("Please ENTER  Mobile Recharge Amount ");
        Mobiles[b].Recharge(ScNum.nextDouble());	
		}
		else
		{
			System.out.println("Recharge Not Successfull Please First Unlock Your Mobile ");
		}
		System.out.println("Please Enter Array Index number but not exceed "+(Mobiles.length-1));
		int d=ScNum.nextInt();
		if(Mobiles[d].get_lock()==false)
		{
		System.out.println("Please ENTER  Call duration time in minitues ");
        Mobiles[d].CallSomeone(ScNum.nextDouble());
		}	
        else
		{
			System.out.println("Phone Call is not Possible First You Unlock Your Phone ");
		}
			
	}
	}