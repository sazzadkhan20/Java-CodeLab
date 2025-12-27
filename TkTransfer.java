import java.lang.*;

public class TkTransfer
{
	private int ano;
	private double balance;
	
	public TkTransfer()
	{
		System.out.println("Empty TkTransfer");
	}
	public TkTransfer(int ano, double balance)
	{
		System.out.println("Param TkTransfer");
		this.ano = ano;
		this.balance = balance;
	}
	public void setAno(int ano)
	{
		this.ano = ano;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public int getAno()
	{
		return ano;
	}
	public double getBalance()
	{
		return balance;
	}
	public void display()
	{
		System.out.println("TkTransfer no: "+ano);
		System.out.println("Balance: "+balance);
	}
	public void deposit(double amount)
	    
	{
		System.out.println("Deposit Method");
		if(amount>0 && (balance+amount)<=50000)
		{
			balance = balance+amount;
			System.out.println("Transaction " + amount + " Successful!");
		}
		else
		{
			System.out.println("Transaction failed!");
		}	
		
	}
	public void withdraw(double amount)
	{       
	        System.out.println("Withdraw Method");
		if(amount>0 && amount<= balance && (balance-amount)>=500)
		{
			balance = balance-amount;
			System.out.println("Transaction " + amount + " Successful!");
		}
		else
		{
			System.out.println("Transaction failed!");
		}		
		
	}
    public void transfer(TkTransfer a, double amount) 
	{       
	        System.out.println("Transfer Method");
        if (amount > 0 && amount <= balance && (balance - amount) >= 500 && (a.balance + amount)<=50000 ) 
		{
           balance = balance - amount;
           a.balance = a.balance + amount;
           System.out.println("Transaction " +amount+ " Successful!");
		   
        }   
	    else 
	    {
           System.out.println("Transaction failed!");
        }
    }

}