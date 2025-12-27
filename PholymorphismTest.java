/*class Person
{
	public void display()
	{
		System.out.println("Parent Class");
	}
}
class Teacher extends Person
{
	@Override
	public void display()
	{
		System.out.println("Teacher Class");
	}
}
class Student extends Person{
	
	@Override
	public void display()
	{
		System.out.println("Student Class");
	}
	/*public void tt()
	{
		System.out.println("ABC");
	}*/
/*}
public class PholymorphismTest
{
	public static void main(String [] args)
	{
		Person P1=new Person();
		P1.display();
		Person P2;
		P2=new Teacher();
		P2.display();
		Person P3=new Student();
		P3.display();
		//P3.tt();
		
	}
}*/
class Shape
{
	double area()
	{
		return 0;
	}
}
class Rectangle extends Shape
{
	double length,width;
	Rectangle(double l,double w)
	{
		length=l;
		width=w;
	}
	@Override
	double area()
	{
		System.out.print("Area of Rectangle: ");
		return length*width;
	}
}
class Triangle extends Shape
{
	double height,base;
	Triangle(double h,double b)
	{
		height=h;
		base=b;
	}
	@Override
	double area()
	{
		System.out.print("Area of Triangle: ");
		return 0.5*height*base;
	}
}
public class PholymorphismTest
{
	public static void main(String [] args)
	{
		Shape [] S=new Shape[2];
		 S[0]=new Rectangle(11,12);
		
	     S[1]=new Triangle(5,7);
		for(int i=0; i<S.length; i++)
		{
			System.out.println(S[i].area());
		}
		
	}
}
		