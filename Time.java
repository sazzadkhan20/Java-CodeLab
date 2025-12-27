public class Time
{
	private int hours;
	private int minutes;
	private double seconds;
	public Time(int h,int m,double s)
	{
		if(h>=0 && h<=23)
		{
		hours=h;}
		//else{System.out.println("Invalid data\n");}
		if(m>=0 && m<=59){
		minutes=m;}
		//else{System.out.println("Invalid data\n");}
		if(s>=0 && s<=59){
		seconds=s;}
		//else{System.out.println("Invalid data\n");}
	}
	public int getHours()
	{
		return hours;
	}
	public int getMinutes()
	{
		return minutes;
	}
	public double getSeconds()
	{
		return seconds;
	}
	public void showTime()
	{
		System.out.print(getHours()+":"+getMinutes()+":"+getSeconds()+"\n\n");
	}
	public void addTwoTime(Time obj)
	{
		int a=getHours()*3600;
		int b=getMinutes()*60;
		double c=a+b+getSeconds();
		
		int d=obj.getHours()*3600;
		int e=obj.getMinutes()*60;
		double f=d+e+obj.getSeconds();
		System.out.println("Two Time Addition In Second: "+(f+c)+" s ");
		
	}
	public void subTwoTime(Time obj)
	{
		int a=getHours()*3600;
		int b=getMinutes()*60;
		double c=a+b+getSeconds();
		
		int d=obj.hours*3600;
		int e=obj.minutes*60;
		double f=d+e+obj.seconds;
		if(f>c){
		System.out.println("Two Time Objects Time Difference In Second: "+(f-c)+" s ");}
		else{
		System.out.println("Two Time Objects Time Difference In Second: "+(c-f)+" s ");}
		
	}
	
}