class Person
{ 
private String name;
private int age;
Person(String n, int a)
{
	name=n;
	age=a;
}
public void set_name(String n)
{
name=n;	
}
public void set_age(int a)
{age=a;
}
public String get_name()
{
	return name;
}
public int get_age()
{
	return age;
}
public void show()
{
	System.out.println("Name : "+get_name());
	System.out.println("Age: "+get_age());
}
}