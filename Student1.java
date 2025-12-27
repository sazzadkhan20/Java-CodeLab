import java.util.Scanner;

public class Student1

{
	private String name;
	private String idnumber;
	Scanner ScNum=new Scanner(System.in);
	{ 
      System.out.println("Please Enter Course Max Value ");
	}	  
	
	private String [] courses=new String[ScNum.nextInt()];
	Student1(String n,String id)
	{
		name=n;
		idnumber=id;
	}
	public void setname(String n)
	{
		name=n;
	}
	public void setidnumber(String i)
	{ 
	   idnumber=i;
	}
	public String getname()
	{
		return name;
	}
	public String getid()
	{
		return idnumber;
	}
	public void Registration(String c)
	{
		boolean flag=false;
		for(int i=0; i<courses.length; i++){
		if(courses[i]==null)
		{
			courses[i]=c;
			flag=true;
			break;
		}
		}
		if (flag==true)
		{
			System.out.println(c+" Course Successfully Registred");
		}
		
	}
	public void Addcourse(String c)
	{
		boolean flag=false;
		for(int i=0; i<courses.length; i++){
		if(courses[i]==null)
		{
			courses[i]=c;
			flag=true;
			break;
		}
		}
		if (flag==true)
		{
			System.out.println(c+" Course Successfully Added ");
		}
	}
	public void Dropcourse(String c)
	{
		boolean flag=false;
		for(int i=0; i<courses.length; i++)
		{
		if(courses[i]!=null)
		{
		if(courses[i].equals(c))
		{
			courses[i]=null;
			flag=true;
			break;
		}
		}
		}
		if (flag==true)
		{
			System.out.println(c+ " Course Successfully Drop ");
		}
		else
		{
		System.out.println(c+ "Course Not Found,Can not Drop this Course");
		}		
	}
			
	
	public void showInfo()
	{
		System.out.println("Name: "+getname());
		System.out.println("ID: "+getid());
		System.out.print("All Courses: ");
		for(int i=0; i<courses.length; i++)
		{
			if(courses[i]!=null)
			{
				System.out.print(courses[i] +" ,");
				
			}
				
	}
	
	System.out.println("\n------------\n------------");
	}
}


	
		