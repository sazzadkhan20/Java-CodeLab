public class MainEmployee
{
	public static void main(String [] args)
	{
		Employee E1=new Employee("MD SAZZAD KHAN","22-49172-3",56000);
		E1.showInfo();
		E1.RequestPromotion();
		E1.RequestPromotion();
		System.out.println("Employee Name: "+E1.getName()+" and Id-"+E1.getId()+ ",Now Your Current Position :"+E1.checkCurrentPosition());
		E1.showInfo();
		//E1.requestRaiseSalary();
		//E1.RaiseSalary(10000);
		Employee E2=new Employee("MD SAZID KHAN","22-59831-4",56000);
		E2.showInfo();
		System.out.println("Employee Name: "+E2.getName()+" and Id-"+E2.getId()+ ",Now Your Current Position :"+E2.checkCurrentPosition());
		//E2.RaiseSalary(10000);
		E2.showInfo();
	}
}