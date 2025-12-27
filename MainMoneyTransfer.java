import java.lang.*;

public class MainMoneyTransfer
{
	public static void main(String [] ars)
	{
	 System.out.println("Welcome To DBBL ");
	 MoneyTransfer Sazzad=new MoneyTransfer("MD. SAZZAD KHAN","2582092988",7500);
	 MoneyTransfer Sadid=new MoneyTransfer("MD. SADID KHAN","258209456368",9850);
	 Sazzad.showInfo();
	 Sadid.showInfo();
	 Sazzad.cashWithdraw(890);
	 Sazzad.cashDeposit(600);
	 Sadid.cashWithdraw(1000);
	 Sadid.cashDeposit(300);
	 Sazzad.showInfo();
	 Sadid.showInfo();
	 Sazzad.cashTransfer(500,Sadid);
	 Sazzad.showInfo();
	 Sadid.showInfo();
	 

	 
	}
}