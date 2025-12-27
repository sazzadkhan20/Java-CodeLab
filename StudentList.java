import java.util.Scanner;

public class StudentList
{
	private Student1 [] Studentlist;
	Scanner ScStr=new Scanner(System.in);
	public StudentList()
	{
		Studentlist=new Student1[15000];
	}
	public StudentList(int size)
	{
		Studentlist=new Student1[size];
	}
	public void insertStudent(Student1 S)
	{
		boolean flag=false;
		for(int i=0; i<Studentlist.length; i++)
		{
			if(Studentlist[i]==null)
			{
				Studentlist[i]=S;
				System.out.println("Please Select Your Courses \nOffered Course LiSt is:Phy-1,Che-1,OOP1,OOp2,Math-1,Math-2,Math-3\nPlease Select One Course Only One Time\n");
		        Studentlist[i].Registration(ScStr.nextLine());
		        System.out.println("Please Select Another Course From Avobe LiSt");
		        Studentlist[i].Registration(ScStr.nextLine());
		        System.out.println("Please Select Another Course From Avobe LiSt");
		        Studentlist[i].Registration(ScStr.nextLine());
		        System.out.println("Please Select Another Course From Avobe LiSt");
		        Studentlist[i].Registration(ScStr.nextLine());
		        System.out.println("Please Select One Course From Avobe LiSt,Which Course You Want To Add Your Resigtration");
		        Studentlist[i].Addcourse(ScStr.nextLine());
		        System.out.println("Please Select One Course From Avobe LiSt,Which Course You Want To Drop Your Resigtration");
		        Studentlist[i].Dropcourse(ScStr.nextLine());;
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("Student Successfully Admitted\n\n");
		}
	}
	public void removeStudentById(String Id)
	{
		boolean flag=false;
		for(int i=0; i<Studentlist.length; i++)
		{
			
			if(Studentlist[i]!=null && Studentlist[i].getid().equals(Id))
			{
				Studentlist[i]=null;
				flag=true;
				break;
			}
			
		}
		if(flag==true)
		{
			System.out.println("Student Successfully Removed In Versity Portal");
		}
		else
		{
			System.out.println("SORRY Input Id Not Match Any Students,Please Try one more time");
	    }
	}
	public void showStudentList()
	{
		
		for(int i=0; i<Studentlist.length; i++)
		{
			if(Studentlist[i]!=null)
			{
				Studentlist[i].showInfo();
				
			}
		}
	}
	
}