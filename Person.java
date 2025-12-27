public class Person
{
	private String name;
	private int age;
	Person(String n,int a)
	{
		name=n;
		age=a;
	}
	public void sayHello()
	{
		System.out.println("My Name is "+name+" and I am "+age+" years old ");
	}
	public void haveBirthday()
	{
		age++;
	}
		
	
}