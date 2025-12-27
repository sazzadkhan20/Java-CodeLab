public class Rectangle
{
	private double length;
	private double width;
	Rectangle(double l,double w)
	{
		if (l>0)
		{
		length=l;
		}
		else
		{
			System.out.println("Your data is incorrect please enter positive number");
		}
		if(w>0)
		{
		width=w;
		}
		else{
			System.out.println("Your data is incorrect please enter positive number");
		}
	}
	public double get_length()
	{
		return length;
	}
	public double get_width()
	{
		return width;
	}
	public double show_area()
	{
	return (get_length()*get_width());
	}
}