import java.lang.*;

import java.util.Scanner;

public class MainStudent1
{
	public static void main(String [] args)
	{
		Scanner ScNum=new Scanner(System.in);
		Scanner ScStr=new Scanner(System.in);
		StudentList Sl=new StudentList(15000);
		
		Sl.insertStudent(new Student1("MD. SAZZAD KHAN","22-49172-3"));
		Sl.insertStudent(new Student1("MD. Raj KHAN","22-49583-3"));
		Sl.insertStudent(new Student1("MD. SAZID KHAN","22-48539-1"));
		Sl.showStudentList();
		Sl.removeStudentById("22-49522-3");
		Sl.showStudentList();
		/*Student1 St=new Student1("MD. SAZZAD KHAN","22-49172-3");
		System.out.println("Please Select Your Courses \nOffered Course List is:Phy-1,Che-1,OOP1,OOp2,Math-1,Math-2,Math-3\nPlease Select One Course Only One Time\n");
		St.Registration(ScStr.nextLine());
		System.out.println("Please Select Another Course From Avobe List");
		St.Registration(ScStr.nextLine());
		System.out.println("Please Select Another Course From Avobe List");
		St.Registration(ScStr.nextLine());
		System.out.println("Please Select Another Course From Avobe List");
		St.Registration(ScStr.nextLine());
		System.out.println("Please Select One Course From Avobe List,Which Course You Want To Add Your Resigtration");
		St.Addcourse(ScStr.nextLine());
		System.out.println("Please Select One Course From Avobe List,Which Course You Want To Drop Your Resigtration");
		St.Dropcourse(ScStr.nextLine());
		St.showInfo();*/
		
	}
	
}
/*public class MainStudent1
{
	public static void main(String [] args)
	{
		Student1 St=new Student1("MD. SAZZAD KHAN","22-49172-3");
		
		St.Registration("Math-1");
		St.Registration("Phy-1");
		St.Registration("Che-1");
		St.Registration("OOP1");
		St.Addcourse("OOP2");
		St.Dropcourse("OOP1");
		St.showInfo();
		
		Student1 St2=new Student1("MD. Raj KHAN","22-49589-3");
		
		St2.Registration("Math-2");
		St2.Registration("OOP2");
		St2.Registration("Php");
		St2.Registration("Phy-2");
		St2.Addcourse("Che-1");
		St2.Dropcourse("OOP2");
		St2.showInfo();
		
	}
	
}*/