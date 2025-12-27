import java.lang.*;
public class MainTkTransfer

{
   public static void main(String [] args)
	
   {
	  TkTransfer x = new TkTransfer();
	
	  x.setAno (123);
	  x.setBalance(10000.00);
	
	  x.getAno ();
	  x.getBalance();
	  
	  x.display();
	  System.out.println("");
	  
	  x.deposit(2000.00);
	  x.display();
	  System.out.println("");
	  
	  x.withdraw(1000.00);
	  x.display();
	  System.out.println("");
	  
	  System.out.println("");
	  
	  
	  TkTransfer y = new TkTransfer();
	
	  y.setAno (567);
	  y.setBalance(8000);
	
	  y.getAno ();
	  y.getBalance();
	  y.display();
	  System.out.println("");
	  
	  y.deposit(2000.00);
	  y.display();
	  System.out.println("");
	  
	  y.withdraw(1000);
	  y.display();
	  System.out.println("");
	  
	  System.out.println("");  
	  
	  x.display();
	  y.display();
	  x.transfer(y,5000);
	  x.display();
	  y.display();
   }
  
}