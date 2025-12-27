public class BankAccount
{
	private String name;
	private String accountNum;
	private double balance;
	BankAccount(String n,String an,double b)
	{
		name=n;
		accountNum=an;
		balance=b;
	}
	public void setBalance(double b)
	{
		balance=b;
	}
	public String getName()
	{
		return name;
	}
	public String getAccountNum()
	{
		return accountNum;
	}
	public double getBalance()
	{
		return balance;
	}
	public void cashdeposit(double amount)
	{
		setBalance(getBalance()+amount);
		System.out.println("Cash Deposit");
	}
	public void showInfo()
	{
		System.out.println("Name: "+getName());
		System.out.println("Account Number: "+getAccountNum());
		System.out.println("Current Balance: "+getBalance());
		System.out.println("-----------");
	}
}