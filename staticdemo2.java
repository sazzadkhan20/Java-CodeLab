import java.lang.*;
class static2
{
	static int count;
	static
	{
		count=0;
	}
	 static2()
	 {
		 count++;
	 }
	 void totalstatic()
	 {
		 System.out.println("Total Static: "+count);
		 System.out.println("-----------");
		 
	 }

	
		
}
public class staticdemo2
{
	static 
	{
		System.out.println("Static Block 2");
	}
	static 
	{
		System.out.println("Static Block 1");
	}
	
	
	public static void main(String [] args)
	{
		System.out.println("Main Method");
		static2 S1=new static2();
		S1.totalstatic();
		static2 S2=new static2();
		S2.totalstatic();
		static2 S3=new static2();
		S3.totalstatic();
		static2 S4=new static2();
		S4.totalstatic();
		
	}
	static 
	{
		System.out.println("Static Block 3");
	}
	
}