import java.lang.*;
class Car
{
	private String Date_of_making;
	private String Model;
	private int Making_year;
	Car(String D,String M,int y)
	{
		Date_of_making=D;
		Model=M;
		Making_year=y;
	}
	public void set_Date_of_making(String D)
	{
		Date_of_making=D;
	}
	public void set_Model(String M)
	{ 
	  Model=M;
	}
	public void set_making_year(int y)
	{
		Making_year=y;
	}
	public String get_Date_of_making()
	{
		return Date_of_making;
	}
	public String get_Model()
	{
		return Model;
	}
	public int get_making_year()
	{
		return Making_year;
	}
	public void show()
	{
		System.out.println("Car Model: "+get_Model());
		System.out.println("Date of Car Making : "+get_Date_of_making());
		System.out.println("Year of Making Car : "+get_making_year());
	}
	
}
public class Xcar
{
	public static void main(String [] args)
	{
		Car C1=new Car("26 December","BMW-101",2022);
		C1.show();
	}
}