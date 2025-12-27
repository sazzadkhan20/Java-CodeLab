import java.lang.*;

class Student
{
	private String name;
	private String id;
	private String department;
	private float cgpa;
	Student()
	{
		System.out.println("E-Constructor");
	}
	Student(String n,String i,String d,float c)
	{
		name=n;
		id=i;
		department=d;
		cgpa=c;
	}
	public void set_name(String n)
	{
	   name=n;
	}
	public void set_id(String i)
	{
		id=i;
	}
	public void set_department(String d)
	{
		department=d;
	}
	public void set_cgpa(float c)
	{
		cgpa=c;
	}
	public String get_name()
	{
		return name;
	}
	public String get_id()
	{
		return id;
	}
	public String get_department()
	{
		return department;
	}
	public float get_cgpa()
	{
		return cgpa;
	}
	public void showInfo()
	{
		System.out.println("Name : "+get_name());
		System.out.println("ID : "+get_id());
		System.out.println("Department : "+get_department());
		System.out.println("CGPA : "+get_cgpa());
	}
}

public class Mstudent{
	public static void main(String [] args)
{
	Student S1=new Student();
	Student S2=new Student("MD. SAZZAD KHAN","22-49172-3","CSE",3.9f);
	S1.set_name("Md. Raju khan");
	S1.set_id("12-89187-1");
	S1.set_department("CSE");
	S1.set_cgpa(3.2f);
    S2.showInfo();
    S1.showInfo();
	
}
}