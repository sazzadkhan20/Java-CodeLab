public class MainTime
{
	public static void main(String [] args)
	{
		Time T1=new Time(05,23,8);
		Time T2=new Time(98,22,45);
		Time T3=new Time(04,12,32);
		T1.showTime();
		T2.showTime();
		T3.showTime();
		T1.addTwoTime(T2);
		T2.subTwoTime(T3);
	}
	
}