public class Mobile
{
	private String mobileOwnerName;
    private String mobileNumber ; 
    private double mobileBalance; 
    private String mobileOSName ;
    private boolean lock=true;
	Mobile()
	{
		System.out.println("E-Cons");
	}
	Mobile(String n,String Mn,double b,String o,boolean l)
	{
		Set_mobileOwnerName(n);
		Set_mobileNumber(Mn);
		Set_mobileBalance(b);
		Set_mobileOSName(o);
		Set_lock(l);
	}
	public void Set_mobileOwnerName(String n)
	{
		mobileOwnerName=n;
	}
	public void Set_mobileNumber(String Mn)
	{
		mobileNumber=Mn;
	}
	public void Set_mobileBalance(double b)
	{
		mobileBalance=b;
	}
	public void Set_mobileOSName(String o)
	{
		mobileOSName=o;
	}
	public void Set_lock(boolean l)
	{
		 lock=l;
	}
	public String get_mobileOSName()
	{
		return mobileOSName;
	}
	public String get_mobileOwnerName()
	{
		return mobileOwnerName;
	}
	public double get_mobileBalance()
	{
		return mobileBalance;
	}
	public String get_mobileNumber()
	{
		return mobileNumber;
	}
	public boolean get_lock()
	{
		return lock;
	}
	public void ShowInfo()
	{
		System.out.println("Mobile Owner Name : "+get_mobileOwnerName());
	   System.out.println("Mobile Number : "+get_mobileNumber());
	   System.out.println("Mobile Balance : "+get_mobileBalance());
	   System.out.println("Mobile OS Name : "+get_mobileOSName());
	   System.out.println("Your Mobile is Lock : "+get_lock());
	   System.out.println("-----------\n-----------");
	}
		public void Recharge(double amount)
		{
			Set_mobileBalance(get_mobileBalance()+amount);
			//get_mobileBalance()=get_mobileBalance()+amount;
	       System.out.println(amount+" TK Successfull Recharged in "+get_mobileNumber()+" Now Current Mobile Balance is "+get_mobileBalance()+" If you know your Balance then dail on *566#,Thank you ");
		}
		public void CallSomeone(double timeDuration) // per minute cost= 0.5 taka
		{
			Set_mobileBalance(get_mobileBalance()-(timeDuration*0.5));
			//get_mobileBalance()=get_mobileBalance()-(timeDuration*0.5);
			System.out.println(" You Speak on phone in "+timeDuration+" Miniteus, Now Your Current Balance is "+get_mobileBalance());
		}

}