public class Account
{
	private String BankHolderName;
	private int AccountNumber;
	private double balance;
	
	public Account()
	{
		System.out.println("E-Cons");
		this.BankHolderName="No set name";
		this.AccountNumber=-1;
		this.balance=0.0;
	}
	public Account(String BankHolderName,int AccountNumber,double balance)
	{
		this.BankHolderName=BankHolderName;
		this.AccountNumber=AccountNumber;
		this.balance=balance;
	}
	public void setBankHolderName(String BankHolderName)
	{
		this.BankHolderName=BankHolderName;
	}
	public void setAccountNumber(int AccountNumber)
	{
		this.AccountNumber=AccountNumber;
	}
	public void setbalance(double balance)
	{
		this.balance=balance;
	}
	public String getBankHolderName()
	{
		return BankHolderName;
	}
	public int getAccountNumber()
	{
		return AccountNumber;
	}
	public double getbalance()
	{
		return balance;
	}
	public void cashWithdraw(int amount)
	{
		if(getbalance()>=1000 && amount>=500)
		{ 
	      setbalance(getbalance()-amount);
		  System.out.println("Successfully tk Withdrawal"+getAccountNumber()+" Account");
		}
		else
		{
			System.out.println("Transaction failed ");
		}
	}
	public void cashDeposit(int amount)
	{
		if(amount>=500)
		{
			setbalance(getbalance()+amount);
			System.out.println("Successfully tk deposit "+getAccountNumber()+" account ");
		}
		else{
			System.out.println("Transaction failed");
			
		}	
		}
		public void showInfo()
		{
			System.out.println("Account Holder Name: "+ getBankHolderName());
			System.out.println("Account Number: "+getAccountNumber());
			System.out.println("Current Balance: "+getbalance());
			
		}
}