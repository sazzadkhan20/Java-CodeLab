public class EvenOdd
{
	public static void main(String [] args)
	{
		int i;
		
		System.out.print("Even numbers are: ");
		for(i=1; i<=100; i++)
		{ 
	      if(i%2==0)
		  { 
	        System.out.print(i+"\t");
		  }
		}
		  System.out.print("\n\n\n\n");
		  // System.out.println();
		  
		  System.out.print("Odd numbers are: ");
		  for(i=1; i<=100; i++)
		  {
			  if(i%2!=0)
			  {
				  System.out.print(i+"\t");
			  }
		  }
	}
}
				  