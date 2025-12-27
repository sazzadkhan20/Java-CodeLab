import java.lang.*;

public class Arr
{
	public static void main(String [] args)
	{
		int [] arr=new int []{10,23,45,59,65};
		int p=2,n=22,a;
		System.out.print("Original: {");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.print("}");
		System.out.print("New : {");
		for(int i=0; i<arr.length; i++)
		{
			if(i==p){
				a=arr[i];
				arr[i]=n;
			System.out.print(arr[i]+","+a+",");
			}
			else{ System.out.print(arr[i]+",");}
		}
		System.out.print("}");
		
	}
}
