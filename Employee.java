public class Employee
{
	private String name;
	private String id;
	private double salary;
	private boolean requestPromotion=false;
	private int seniorityLevel=1;
	//private boolean raiseSalary;
	public Employee(String name,String id,double salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
		//this.raiseSalary=false;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setId(String i)
	{
		id=i;
	}
	public void setSalary(double s)
	{
		salary=s;
	}
	public String getName()
	{
		return name;
	}
	public String getId()
	{
		return id;
	}
	public double getSalary()
	{
		return salary;
	}
	public void RequestPromotion()
	{
		int amount=25000;
		salary+=amount;
		requestPromotion=true;
		seniorityLevel++;
		System.out.println("Employee Name: "+getName()+" and Id-"+getId()+ " Congratulation,Your Promotion Requeat Granted");
	}
	public String checkCurrentPosition()
	{
		System.out.println("Employee Name: "+getName()+" and Id-"+getId()+ ",Now Your Seniority Level: "+seniorityLevel);
		if(seniorityLevel==1)
		{
			return "Lecturer";
		}
		else if(seniorityLevel==2)
		{
			return "Assistant Lecturer"; 
		}
		else if(seniorityLevel==3)
		{
			return "Professor"; 
		}
		else if(seniorityLevel==4)
		{
			return "Senior Professor";
		}
		else if(seniorityLevel==5)
		{
			return "DEAN of Department"; 
		}
		else
		{
		return "";
		}
	}
	/*public void requestRaiseSalary()
	{
		raiseSalary=true;
		System.out.println("Employee Name: "+getName()+" and Id-"+getId()+ " Congratulation, Your Salary increase Request is Granted");
	}
	
	public void RaiseSalary(double amount)
	{
		if(raiseSalary==true)
		{
		  setSalary(getSalary()+amount);
		  System.out.println("Employee Name: "+getName()+" and Id-"+getId()+" Now Your Current Monthly Salary is "+getSalary());
		}
		else
		{
			System.out.println("Employee Name: "+getName()+" and Id-"+getId()+" Sorry Your Request was not Granted");
		}
	}*/
	public void showInfo()
	{
		 System.out.println("Employee Name: "+getName());
		  System.out.println("Employee ID: "+getId());
		   System.out.println("Employee Monthly Salary: "+getSalary());
		   System.out.println("Employee Name: "+getName()+" and ID: "+getId()+",Now Current Position: "+checkCurrentPosition());
	}
}
		
	