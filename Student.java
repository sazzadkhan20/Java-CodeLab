import java.lang.*;
class MStudent 
{
	private String Name;
	private String id;
	//private String department;
	private float cgpa;
	MStudent(String N,String i,float c)
	{
		Name=N;
		id=i;
		cgpa=c;
	}
	public String get_Name()
	{
		return Name;
	}
	public String get_id()
	{
		return id;
	}
	public float get_cgpa()
	{
		return cgpa;
	}
	public void Showinfo()
	{
		System.out.println("Name: "+get_Name());
		System.out.println("Student Id: "+get_id());
		System.out.println("Student CGPA: "+get_cgpa());
	}
}
public class Student
{
	public static void main(String [] args)
	{
		MStudent S=new MStudent("MD. SAZZAD KHAN","22-49172",3.93f);
		S.Showinfo();
	}
}
	