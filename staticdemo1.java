import java.lang.*;
class static1
{
	 String name,id;
	static String uniname="LU";
	static1(String name,String id)
	{
		this.name=name;
		this.id=id;
		//this.uniname=uniname;
	}
	void show()
	{
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
		System.out.println("UNIVERSITY Name: "+uniname);
		System.out.println("------------");
	}
		
}
public class staticdemo1
{
	public static void main(String [] args)
	{
		static1 S1=new static1("MD. ABUL","1235");
		static1 S2=new static1("MD. SAZZAD","1296");
		static1 S3=new static1("MD. RAJ","1245");
		static1 S4=new static1("MD. MANNAN","1288");
		S1.show();
		S2.show();
		S3.show();
		S4.show();
	}
}
		