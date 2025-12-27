public class Weather
{
	private double temperature;
	private double humidity;
	private double windSpeed;
	public Weather(double temperature,double humidity,double windSpeed)
	{
		this.temperature=temperature;
		this.humidity=humidity;
		this.windSpeed=windSpeed;
	}
	public void checkWeather()
	{
		if(temperature>(-40) && temperature<0)
		{
			System.out.println("Very Cool Temperature");
		}
		if(temperature>0 && temperature<25)
		{
			System.out.println("Cool Temperature");
		}
		if(temperature>25 && temperature<40)
		{
			System.out.println("Normal Temperature");
		}
		if(temperature>40 && temperature<52)
		{
			System.out.println(" Hot Temperature");
		}
		if(temperature>52)
		{
			System.out.println("Very Hot Temperature");
		}
		if(temperature>=20 && temperature<=30 && humidity>=80 && humidity<=90)
		{
			
			System.out.println("Weather Wet and Cool");
		}
		else
		{
			System.out.println("Weather Not wet and Cool");
		}
		if(temperature>=(25) && temperature<=40 && humidity>=20 && humidity<=35)
		{
			System.out.println("Hot and dry Weather");
		
		}
		else
			{
				System.out.println("Weather Not Hot and Dry");
			}
			if(windSpeed>=20)
			{
				System.out.println("Weather is Windy");
			}
			else
			{
				System.out.println("Weather is not Windy");
			}
	}
	public void showInfo()
	{
		System.out.println("Temperature: "+temperature);
		System.out.println("Humidity:"+humidity+"%");
		System.out.println("Wind Speed: "+windSpeed);
	}		
		
	}
	