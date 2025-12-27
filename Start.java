import java.lang.*;

public class Start
{
	public static void main(String [] args)
	{
		Box obj1= new Box();
		Box obj2= new Box(-10,21,69);
		obj1.show_Box();
		obj2.set_length(10);
		obj2.set_wigth(23);
		obj2.show_Box();
		System.out.println("Value1: "+(obj1.get_length()+obj1.get_wigth()));
		System.out.println("Value2: "+(obj2.get_length()+obj2.get_wigth()));
	}
}