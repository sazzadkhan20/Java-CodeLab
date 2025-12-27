interface A
{
	public static final int a=5;
	abstract void eat();
}
interface B
{
	abstract void eat();
}
class C implements A,B
{
	@Override
	public void eat()
	{
		System.out.println("Ami Sesh");
	}
}
public class InterfaceTest
{
	public static void main(String [] args)
	{
		C obj=new C();
		obj.eat();
		A ob=new C();
		ob.eat();
	}
}