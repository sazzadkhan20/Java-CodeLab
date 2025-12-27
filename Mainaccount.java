import java.lang.*;

public class Mainaccount
{
	public static void main(String [] args)
	{
		SavingsAccount SA=new SavingsAccount("MD. SAZZAD KHAN",12369,5000,10);
		SA.showInfo();
		SA.cashWithdraw(1000);
		SA.cashDeposit(500);
		SA.showInfo();
		OverDraftAccount OA=new OverDraftAccount("MD. SAD KHAN",369758,10000,10,2000);
		OA.cashWithdraw(5000);
		OA.showInfo();
		FixedDepositAccount FDA=new FixedDepositAccount(5,10);
		FDA.setBalance();
		FDA.cashWithdraw();
		FDA.showInfo();
		FixedDepositAccount FDA1=new FixedDepositAccount();
		FDA1.showInfo();
	}
}