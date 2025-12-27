import java.lang.*;

public class InstanceOf
{
	public static void main(String [] args)
	{
		Animal a=new Animal();
		Person1 p=new Person1();
		Teacher1 t=new Teacher1();
		System.out.println(a instanceof Animal);
		System.out.println(p instanceof Person1);
		System.out.println(t instanceof Teacher1);
		System.out.println(p instanceof Animal);
		System.out.println(t instanceof Animal);
		System.out.println(p instanceof Teacher1);
		System.out.println(a instanceof Person1);
		
	}
	
}
		