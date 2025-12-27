public class SavingsAccount extends Account
{
	private int interestrate;
	SavingsAccount()
	{ 
	
	}
	SavingsAccount(String BankHolderName,int AccountNumber,double balance,int interestrate)
	{ 
	  super(BankHolderName,AccountNumber,balance);
	   this.interestrate=interestrate;
	
	}
	public void setinterestrate(int interestrate)
	{
		this.interestrate=interestrate;
	}
	public int getinterestrate()
	{
		return interestrate;
	}
	public void showInfo()
	{
		super.showInfo();
		System.out.println("Interset Rate: "+getinterestrate());
		
	}
}
	
	