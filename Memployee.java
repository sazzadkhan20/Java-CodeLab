import java.lang.*;
class Employee
{
	String name;
	int id;
	double salary;
	boolean isManager;
	public void giveRise(double amount)
	{
		salary+=amount;
	}
	public void promote()
	{
		isManager=true;
	}
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("ID : "+id);
		System.out.println("Salary: "+salary);
		System.out.println("Manager : "+isManager);
	}
}
public class Memployee
{
	public static void main(String [] args)
	{
		Employee e1=new Employee();
		e1.name="Sazzad";
		e1.id=1;
		e1.salary=50000;
		e1.promote();
		e1.giveRise(3000);
		e1.display();
	}
}
		