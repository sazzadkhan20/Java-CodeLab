import java.text.DecimalFormat;

public class AnonymousClass
{
	public static void main(String [] args)
	{
		ABC obj=new ABC(){
			@Override
			void display()
			{
				System.out.println("Anonymous Class");
			}
			
		};
		obj.display();
		//String s="bvgg";
		//System.out.println(s.charAt(10));
		DecimalFormat obj1=new DecimalFormat("0.00");
		double a=1.233555;
		System.out.println("a ="+obj1.format(a));
		
	}
}