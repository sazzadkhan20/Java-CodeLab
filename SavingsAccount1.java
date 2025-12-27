public class SavingsAccount1 extends BankAccount
{
	private double interestrate;
	SavingsAccount1()
	{
		
	}
	SavingsAccount1(String n,String an,double b,double i)
	{
		interestrate=i;
		super(n,an,b);
	}
	public void double setInterestrate(double i)
	{
		interestrate=i;
	}
	public double getInterestrate()
	{
		return interestrate;
	}
	public void calculateInterest()
	{
		super.cashdeposit(getBalance()*(getInterestrate()/100));
	}
	public void cashWidthdraw(int amount)
	{
		if(amount>1000)
		{
		setBalance(getBalance()-amount);
		System.out.println("Cash Widthdraw");
		}
		else
		{
			System.out.println("Transaction Failed");
		}
	}
	public void showInfo()
	{
		super.showInfo();
		System.out.println("Interest Rate: "+getInterestrate());
	}
		
		