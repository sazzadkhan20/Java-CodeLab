import java.lang.*;
class Triangle
{
	private int x,y,z;
	Triangle()
	{
		System.out.println("E-Cons");
	}
	Triangle(int a,int b,int c)
	{
		if(a>=0){
		x=a;}
		else
		{System.out.println(a+"is Invalid data");}
		if(b>=0){
		y=b;}
		else
		{System.out.println(b+"is Invalid data");}
		if(c>=0){
		z=c;}
		else
		{System.out.println(c+"is Invalid data");}
	}
	public void set_x_y_z(int x,int y,int z)
	{
		if(x>=0){
		this.x=x;}
		else
		{System.out.println(x+"is Invalid data");}
		if(y>=0){
		this.y=y;}
		else
		{System.out.println(y+"is Invalid data");}
		if(z>=0){
		this.z=z;}
		else
		{System.out.println(z+"is Invalid data");}
	}
	public int get_x()
	{
		return x;
	}
	public int get_y()
	{
		return y;
	}
	public int get_z()
	{
		return z;
	}
	public void showInfo()
	{
		System.out.println("Triangle 1st part length:"+get_x());
		System.out.println("Triangle 2nd part length:"+get_y());
		System.out.println("Triangle 3rd part length:"+get_z());
	}
	public void Testtriangle()
	{
		if ((x+y)>z && (x+z)>y && (y+z)>x){
		if(x==y && y==z)
		{
			System.out.println("Trinagle is Equilateral");
		}
		else if(x==y || y==z || z==x)
		{
			System.out.println("Trinagle is Isosceles");
		}
		else if (x!=y && y!=z && z!=x)
		{
			System.out.println("Trinagle is Scalene");
		}
		}
		else{
			System.out.println("Input Data is not a Triangle Parts");
		}
	}
}
public class Mtriangle
{
	public static void main(String [] args)
	{
		Triangle T1=new Triangle();
		Triangle T2=new Triangle(12,16,12);
		Triangle T3=new Triangle(6,2,3);
        Triangle T4=new Triangle(6,6,6);
        T1.set_x_y_z(8,3,7);
		T1.showInfo();
		T1.Testtriangle();
		T2.showInfo();
		T2.Testtriangle();
		T3.showInfo();
		T3.Testtriangle();
		T4.showInfo();
		T4.Testtriangle();
	}
}
	