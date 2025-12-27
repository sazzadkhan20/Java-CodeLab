import java.lang.*;
class teacher
{
	String name,gender;
	int age;
	void showinfo()
	{
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
	}
}
public class xteacher
{
	public static void main(String [] args)
	{
		teacher obj1=new teacher();
		obj1.name="MD. SAZZAD KHAN";
		obj1.gender="Male";
		obj1.age=23;
		obj1.showinfo();
		teacher obj2=new teacher();
		obj2.name="cdhjsdfbhdb";
		obj2.gender="xbxb";
		obj2.age=122;
		System.out.println("Name: "+obj2.name);
		System.out.println("Gender: "+obj2.gender);
		System.out.println("Age: "+obj2.age);
	}
}
		
