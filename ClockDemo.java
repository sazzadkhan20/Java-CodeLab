public class ClockDemo
{
	public static void main(String [] args)
	{
		Clock firstClock=new Clock(3000);
		for(int i=1; i<=10; i++)
		{
			firstClock.tick();
			System.out.println(firstClock.getHours()+":"+firstClock.getMinutes()+":"+firstClock.getSeconds());
		}
		Clock secondClock=new Clock(5,32,36);
		for(int i=1; i<=10; i++)
		{
			secondClock.tick();
			System.out.println(secondClock.getHours()+":"+secondClock.getMinutes()+":"+secondClock.getSeconds());
		}
		firstClock.addClock(secondClock);
		System.out.println(firstClock);//firstClock.toString
		System.out.println(secondClock);//secondClock.toString
		Clock thirdClock=firstClock.subtractClock(secondClock);
		System.out.println(thirdClock);
		
	}
}