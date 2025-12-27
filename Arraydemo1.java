import java.lang.*;
import java.util.Scanner;
public class Arraydemo1
{
	public static void main(String [] args)
	{
		/*int [] numbers=new int [5];
		int [] temp;
		temp=numbers;
		temp[2]=10;
		for(int i=0; i<numbers.length; i++)
		{
			System.out.println(temp[i]);
		}*/
		//int [] numbers=new int []{10,8,9,311,5};
		/*int [] numbers={10,8,9,311,5};
		int [] temp;
		temp=numbers;
		temp[2]=10;
		for(int i=0; i<numbers.length; i++)
		{
			System.out.println(temp[i]);
		}*/
	    Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		double [] numbers=new double[size];
		
		//input
		for(int i=0; i<numbers.length; i++)
		{
			numbers[i]=sc.nextDouble();
			//System.out.print("");
		}
		numbers[2]=10;
		//Output
		System.out.print("{ ");
		for(int i=0; i<numbers.length; i++)
		{
			System.out.print(numbers[i]);
			if(i<(numbers.length-1))
			{
				System.out.print(",");
			}
			if(i<(numbers.length))
			{
				System.out.print(" ");
			}
		}
		System.out.print("}");
		/*int i=14.26;
		double b=i;
		System.out.print(b);
		float j=14.26;
		double a=j;
		System.out.print(a);
		double w=14;
		int c=w;
		System.out.print(c);
		//int i=14.09;
		double j=14f;
		//float w=14.29;
		//System.out.print(i);
		System.out.print(j);
		//System.out.print(w);*/
		
    }
}