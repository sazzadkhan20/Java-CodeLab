public class OverDraftAccount extends SavingsAccount
{
	private double limit;
	
	OverDraftAccount(String BHN,int AN,double bl,int i,double limit)
	{
		super(BHN,AN,bl,i);
		this.limit=limit;
		
	}
	public void setlimit(double limit)
	{
		this.limit=limit;
	}
	public double getlimit()
	{
		return limit;
	}
	public void cashWithdraw(int amount)
	{
		if(amount<=limit+super.getbalance())
		{
			super.setbalance(super.getbalance()-amount);
			System.out.println("Successfully tk Withdrawn");
		}
		else
		{
			System.out.println("Transaction Failed");
		}
	}
		public void showInfo()
		{
			super.showInfo();
			System.out.println("Tk Withdraw limit: "+getlimit());
			
		}
		
	}