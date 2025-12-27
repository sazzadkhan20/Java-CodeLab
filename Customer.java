public class Customer
{
	private String phoneNum;
	private Account [] accounts;
	public Customer(String pn,int size)
	{
		phoneNum=pn;
		accounts=new Account[size];
	}
	public void insertAccount(Account a)
	{
		boolean flag=false;
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i]==null)
			{
				accounts[i]=a;
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Account Created Successfully");
		}
		else
		{
			System.out.println("Account isnot Created");
		}
	}
	public void showAllSavingsAccount()
	{
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i]!=null)
			{
				if(!(accounts[i] instanceof  OverDraftAccount))
				{						
					if(accounts[i] instanceof SavingsAccount)
					{
						accounts[i].showInfo();
					}
				}
			}
		}
	}
	public Account getAccountByAccountNo(int a)
	{
		Account an=null;
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i]!=null && accounts[i].getAccountNumber()==a)
			{
				 an= accounts[i];
				break;
			}
		}
		return an;
	}
	
	public void showAllAccount()
	{
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i]!=null)
			{
				//System.out.println(accounts[i].getAccountNumber());
			     accounts[i].showInfo();
				System.out.println("------------");
			}
		}
	}
	
}