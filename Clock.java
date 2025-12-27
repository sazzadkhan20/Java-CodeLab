public class Clock
{
	private int hours;
	private int minutes;
	private int seconds;
	Clock()
	{
		hours=12;
		minutes=0;
		seconds=0;
	}
	public Clock(int h,int m,int s)
	{
		
		if(h>=0 && h<=23){
		hours=h;}
		if(m>=0 && m<=59){
		minutes=m;}
		if(s>=0 && s<=59){
		seconds=s;}
		
	}
	public Clock(int s)
	{
		double a=s/3600;
		if(a<24.0 && a>=0.0){
		hours=s/3600;
		minutes=(s%3600)/60;
		seconds=(s%3600)%60;
		}
		if(a>=24.0)
		{
			int n=s/86400;
			 s=s-86400*n;
		     hours=s/3600;
		     minutes=(s%3600)/60;
		     seconds=(s%3600)%60;
			
		}
		
		
	}
	public void setClock(int s) 
	{
		double a=s/3600;
		if(a<24.0 && a>=0.0){
		hours=s/3600;
		minutes=(s%3600)/60;
		seconds=(s%3600)%60;
		}
		if(a>=24.0)
		{
			int n=s/86400;
			
			s=s-86400*n;
			hours=s/3600;
		    minutes=(s%3600)/60;
		    seconds=(s%3600)%60;
			
		}
		
	}
	public void setHours(int h)
	{
		if(h>=0 && h<=23)
		{
		hours=h;}
	}
	public void setMinutes(int m)
	{
		if(m>=0 && m<=59){
		minutes=m;}
	}
	public void setSeconds(int s)
	{
		if(s>=0 && s<=59){
		seconds=s;}
	}
	public int getHours()
	{
		return hours;
	}
	public int getMinutes()
	{
		return minutes;
	}
	public int getSeconds()
	{
		return seconds;
	}
	public void tick()
	{
      seconds++;
	  if(seconds>59)
	  {
		  seconds=0;
		  minutes++;
		  if(minutes>59)
		  {
			minutes=0;
			hours++;
			 if(hours>23)
			 {
				 hours=0;
			 }
			 
		  }
		  
	}
	}
    public void addClock(Clock obj)
	{
      seconds=seconds+obj.seconds+((minutes+obj.minutes)*60)+((hours+obj.hours)*3600);
	  setClock(seconds);
	}
	@Override
	public String toString()
	{
		//return String.format("%s:%s:%s",hours,minutes,seconds);
		return (getHours()+":"+getMinutes()+":"+getSeconds());
	}
    public void tickDown()
	{
      seconds--;
	  if(seconds<0)
	  {
		  seconds=59;
		  minutes--;
		  if(minutes<0)
		  {
			  minutes=59;
			  hours--;
			  if(hours<0)
			  {
				  hours=23;
			  }
		  }
	  }
	}
    public Clock subtractClock(Clock obj)
	{
      Clock temp=new Clock();
	  if(seconds>obj.seconds){
	  temp.seconds=seconds-obj.seconds;}
	  else
	  {temp.seconds=obj.seconds-seconds;}
     if(minutes>obj.minutes){
	  temp.minutes=minutes-obj.minutes;}
	  else
	  {temp.minutes=obj.minutes-minutes;}
     if(hours>obj.hours){
	  temp.hours=hours-obj.hours;}
	  else
	  {temp.hours=obj.hours-hours;}
     return temp;
	
	}	
	
}