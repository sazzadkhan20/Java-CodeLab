import java.lang.*;

public class MergeArray
{
	public static void main(String [] args)
	{
		int [] arr1=new int []{5,23,1,89};
		int [] arr2=new int []{3,78,12,3};
		int [] arr3=new int []{12,14,98,36};
		int [] arr=new int [arr1.length+arr2.length+arr3.length];
		for(int i=0; i<arr.length; i++)
		{
			if(i<arr1.length)
			{
				arr[i]=arr1[i];
				System.out.println(arr[i]);
			}
			if(i<(arr2.length+arr2.length) && i>=arr1.length)
			{
				arr[i]=arr2[(i-arr1.length)];
				System.out.println(arr[i]);
			}
			if(i<(arr2.length+arr2.length+arr3.length) && i>=(arr1.length+arr2.length))
			{
				arr[i]=arr3[(i-(arr1.length+arr2.length))];
				System.out.println(arr[i]);
			}
			
			
			
		}
			
		
	}
}