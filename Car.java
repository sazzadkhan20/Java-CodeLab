public class Car
{
	private String make;
	private String model;
	private int year;
	private double speed;
	private boolean isRunning;
	public Car(String make,String model,int year)
	{
		this.make=make;
		this.model=model;
		this.year=year;
		this.speed=0;
		this.isRunning=false;
	}
	public void startCar()
	{
		if(!isRunning)
		{
			System.out.println(make+" "+model+" has started");
			isRunning=true;
		}
		else
		{
			System.out.println(make+" "+model+" has already started");
		}
	}
	public void stopCar()
	{
		if(isRunning)
		{
			speed=0;
			isRunning=false;
			System.out.println(make+" "+model+" has Stopped");
		
		}
		else
		{
			System.out.println(make+" "+model+" has already stopped");
		}
	}
	public void accelerate(double accAmountSpeed)
	{
		if(isRunning)
		{
			speed+=accAmountSpeed;
			System.out.println(make+" "+model+" is now going "+speed+" Km/h");
		}
		else
		{
			System.out.println(make+" "+model+" needs to be start before acceleration ");
		}
	}
	public void deaccelerate(double deaccAmountSpeed)
	{
		if(isRunning)
		{
			speed-=deaccAmountSpeed;
			System.out.println(make+" "+model+ " is now going "+speed+"Km/h ");
		}
		else
		{
			System.out.println(make+" "+model+" needs to be start before deacceleration ");
	}
	}
	public double checkSpeed()
	{
		return speed;
	}
	
}