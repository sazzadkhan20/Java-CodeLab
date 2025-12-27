abstract class Shape
{
	private double length,width;
	Shape(double l,double w)
	{
		length=l;
		width=w;
	}
    
	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
	public abstract double calculateArea();
}
class Triangle extends Shape
{
	Triangle(double l,double w)
	{
		super(l,w);
	}
	public double calculateArea()
	{
		return 0.5*getLength()*getWidth();
	}
}
class Rectangle extends Shape
{
	Rectangle(double l,double w)
	{
		super(l,w);
	}
	public double calculateArea()
	{
		return getLength()*getWidth();
	}
}
class Circle extends Shape
{
	Circle(double r)
	{
		super(r,r);
	}
	public double calculateArea()
	{
		return Math.PI*getLength()*getWidth();
	}
	public double calculateCircumference()
	{
		return 2*Math.PI*getLength();
	}
}
class Square extends Shape
{
	Square(double a)
	{
		super(a,a);
	}
	public double calculateArea()
	{
		return getLength()*getWidth();
	}
	public double calculatePerimeter()
	{
		return 4*getLength();
	}
}
public class AbstractionTest2
{
	public static void main(String [] args)
	{
		Shape S;
		S=new Triangle(7,9);
		System.out.println("Triangle Area: "+S.calculateArea());
		S=new Rectangle(9,13);
		System.out.println("Rectangle Area: "+S.calculateArea());
		S=new Circle(3);
		System.out.println("Circle Area: "+S.calculateArea());
		Circle C=new Circle(4);
		System.out.println("Circle Circumference: "+C.calculateCircumference());
		S=new Square(6);
		System.out.println("Square Area: "+S.calculateArea());
		Square Sq=new Square(3);
		System.out.println("Square Perimeter: "+Sq.calculatePerimeter());
	}
}