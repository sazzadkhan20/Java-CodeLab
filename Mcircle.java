import java.lang.*;
class Circle
{
	private double redius;
	Circle(double redius)
	{
		if(redius>0)
		{
		this.redius=redius;
		}
		else
		{
			System.out.println("Your data is incorrect,please Enter positive number");
	}
	}
	public double get_redius()
	{
		return redius;
	}
	public double get_circumference()
	{
		return (2*3.1416*get_redius());
	}
	public double get_area()
	{
		return (3.1416*get_redius()*get_redius());
	}
}
public class Mcircle
{
	public static void main(String [] args)
	{
		Circle C=new Circle(12);
		System.out.println("Circle Circumference: "+C.get_circumference());
		System.out.println("Cricle Area: "+C.get_area());
	}
}