abstract class MobileUser
{
	public void call()
	{
		System.out.println("Call Me");
	}
	public abstract void sendMessage();
}
class Rahim extends MobileUser
{
	/*public void calllater()
	{
		System.out.println("Call Later");
	}*/
	@Override
	public void sendMessage()
	{
		System.out.println("Hi, I am Rahim");
	}
}
class Karim extends MobileUser
{
	@Override
	public void sendMessage()
	{
		System.out.println("Hi, I am Karim");
	}
	
}
public class AbstractionTest
{
	public static void main(String [] args)
	{
		MobileUser ms;
		ms=new Rahim();
		ms.call();
		ms.sendMessage();
		//ms.calllater();
		ms=new Karim();
		ms.sendMessage();
		ms.call();
	}
}
		