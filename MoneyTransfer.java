public class MoneyTransfer
{
	private double balance;
	private String Name;
	private String AccountNumber;
	public MoneyTransfer(String n,String An,double b)
	{
		Name=n;
		AccountNumber=An;
		balance=b;
	}
	public void setName(String n)
	{
		Name=n;
	}
	public void setAccountNumber(String An)
	{
		AccountNumber=An;
	}
	public void setbalance(double b)
	{
		balance=b;
	}
	public String getName()
	{
		return Name;
	}
	public String getAccountNumber()
	{
		return AccountNumber;
	}
	public double getbalance()
	{
		return balance;
	}
	public void cashWithdraw(double amount)
	{
		if(getbalance()>=1000 && amount>=500 && amount%500==0)
		{
		setbalance(getbalance()-amount);
		System.out.println("Account Number: "+getAccountNumber()+"\nWithdraw Money Amount: "+amount+" and TK Successfully Withdrawal");
		}
		else
		{
			System.out.println("Transaction Failed ");
		}	
		
	}
	public void cashDeposit(double amount)
	{
		if(amount>=500)
		{
		setbalance(getbalance()+amount);
		System.out.println("Account Number: "+getAccountNumber()+"\nTk Successfull deposit "+getAccountNumber());
		}
		else{
			System.out.println("Transaction Failed");
		}
	}
	public void cashTransfer(int amount,MoneyTransfer obj)
	{
		if(getbalance()>=amount && amount>=500){
		setbalance(getbalance()-amount);
		System.out.println("Tk Successfully Transfer to "+obj.getAccountNumber()+" Your Account Number is: "+getAccountNumber());
		obj.setbalance(obj.getbalance()+amount);
		}
		else{
			System.out.println("Transaction Failed");
		}
		
	}
	public void showInfo()
	{
		System.out.println("Name : "+getName());
		System.out.println("Account Number : "+getAccountNumber());
		System.out.println("Balance : "+getbalance());
		System.out.println("-------------\n----------");
	}
	
}