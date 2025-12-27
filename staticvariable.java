import java.lang.*;
class staticx
{
	private double length;
    private double width;
    public double height;
	public static int staticCount=0;
	//static block
	static 
	{
		staticCount+=10;
		
	}
	public static void staticMethod()
	{
		System.out.println("You are calling an static method");
		//length++;
		staticCount+=20;
	}
	static 
	{
		System.out.println("Static Block 1");
	}
	//empty constructor
	staticx()
	{
		System.out.println("E-Constructor");
    }
	staticx(double l,double w,double h)
	{
		set_l_w_h(l,w,h);
	}
	public void set_l_w_h(double l,double w,double h)
	{
		length=l;
		width=w;
		height=h;
	}
	public double get_length()
	{
		return length;
	}
	public double get_width()
	{
		return width;
	}
	public double get_height()
	{
		return height;
	}
	public void showinfo()
	{
		System.out.println("Length: "+length);
		System.out.println("width: "+width);
		System.out.println("Heigth: "+height);
		System.out.println("Total Static Count: "+staticCount);
	}
	static{
		System.out.println("Static Block 2");
		staticCount+=10;
	}
}
public class staticvariable
{
	public static void main(String args [])
	{
		System.out.println("Start the Program");
		staticx.staticMethod();
		System.out.println(Integer.parseInt("123")+5);
		System.out.println(staticx.staticCount);
		staticx.staticCount++;
		staticx S;
		S=new staticx(12.02,19,13.09);
        staticx M;
		M=S;
		System.out.println(M.staticCount);
		System.out.println(staticx.staticCount);
		M.showinfo();
	}
}
		
	
