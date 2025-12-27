public class FixedDepositAccount extends Account
{
	private int tenureYear=1;
	private double interestrate;
	FixedDepositAccount()
	{
		System.out.println("FDA Empty Constractor");
	}
	FixedDepositAccount(String BankHolderName,int AccountNumber,double balance,int ty,double ir)
	{
		super(BankHolderName,AccountNumber,balance);
		tenureYear=ty;
		interestrate=ir;
	}
	public void setTenureYear(int ty)
	{
		tenureYear=ty;
	}
	public void setInterestrate(double ir)
	{
		interestrate=ir;
	}
	public int getTenureYear()
	{
		return tenureYear;
	}
	public double getInterestrate()
	{
		return interestrate;
	}
	public void setBalance()
	{
		super.setbalance(super.getbalance()+(super.getbalance()*((getTenureYear()*12)*getInterestrate()/100)));
		
	}
	public void cashWithdraw()
	{
		if(tenureYear==5)
		{
			System.out.println("Your Total TK: "+ super.getbalance());
			super.setbalance(0);
			System.out.println("Your Fixed Deposit colsed");
			
		}
		else
		{
			super.setbalance(super.getbalance());
		}
		
	}
	public void showInfo()
	{
		super.showInfo();
		System.out.println("Tenure Year: "+getTenureYear());
		
	}
}
	