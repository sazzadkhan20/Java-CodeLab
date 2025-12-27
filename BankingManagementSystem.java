public class BankingManagementSystem
{
	public static void main(String [] args)
	{
		Customer C1=new Customer("01750030406",10);
		Account a1=new Account("Md. Sazzad Khan",2213645,5000);
		//a1.showInfo();
		SavingsAccount sa1=new SavingsAccount("Md. Sazzad Khan",2213645,5000,7);
		//sa1.showInfo();
		FixedDepositAccount fd1=new FixedDepositAccount("Md. Sazzad Khan",2213645,5000,2,4);
		//fd1.showInfo();
		OverDraftAccount od1=new OverDraftAccount("Md. Sazzad Khan",22136455,5000,2,2000);
		//od1.showInfo();
		C1.insertAccount(a1);
		C1.insertAccount(sa1);
		C1.insertAccount(fd1);
		C1.insertAccount(od1);
		//C1.showAllAccount();
		//C1.showAllSavingsAccount();
		int AccNum=22136455;
		if(C1.getAccountByAccountNo(AccNum) instanceof OverDraftAccount)
		{
			OverDraftAccount od=(OverDraftAccount) C1.getAccountByAccountNo(AccNum);
		    od.setlimit(10000);
			od.showInfo();
			System.out.println(od.getinterestrate());
			System.out.println(od.getAccountNumber());
			//C1.getAccountByAccountNo(AccNum).showInfo();
		}
		else if(C1.getAccountByAccountNo(AccNum) instanceof SavingsAccount)
		{
			SavingsAccount Sa=(SavingsAccount) C1.getAccountByAccountNo(AccNum);
			//Sa.showInfo();
			//C1.getAccountByAccountNo(AccNum).showInfo();
		}
		else if(C1.getAccountByAccountNo(AccNum) instanceof FixedDepositAccount)
		{
			FixedDepositAccount Fd=(FixedDepositAccount) C1.getAccountByAccountNo(AccNum);
			//Fd.showInfo();
			//C1.getAccountByAccountNo(AccNum).showInfo();
		}
		else if(C1.getAccountByAccountNo(AccNum) instanceof Account)
		{
			//C1.getAccountByAccountNo(AccNum).showInfo();
		}
		//C1.showAllAccount();
	}
}