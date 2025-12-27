import java.lang.*;

public class PrimeArray
{
	public static void main(String [] args)
	{
		int [] arr=new int []{5,23,1,89,10,11,9,157,126};
		System.out.println("Prime number arrays element: ");
		for(int i=0; i<arr.length; i++)
		{
			boolean flag=false;
			for(int j=2; j<arr[i]; j++)
			{
				if(arr[i]%j==0)
				{
					flag=true;
					
				}
				
			}
			if(flag==false)
			{
				if(arr[i]!=1)
				{
					System.out.println(arr[i]);
				}
				
			}
			
			
		}
		
	}
}