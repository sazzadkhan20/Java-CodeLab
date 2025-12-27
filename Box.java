public class Box
{
	private double length;
	private double wigth;
	private double hight;
	Box()
	{
		System.out.println("E-Constructor");
	}
	Box(double n,double m, double p)
	{ set_length(n);
	set_wigth(m);
	hight=p;
	}
	public void set_length(double l)
	{
		if(l>=0)
		{
		length=l;
		}
		else
		{
			System.out.println("Invalid Value,Please Enter The Positive Value");
		}
	}
	public void set_wigth(double w)
	{
      if(w>=0)
     {	
       wigth=w;
     }
	 else
	 {
		 System.out.println("Invalid Value,Please Enter The Positive Value");
	 }
	}
	public double get_length()
	{ return length;
	}
	public double get_wigth()
	{
		return wigth;
	}
	public double get_hight()
	{
	  return hight;
	}	  
	public void show_Box()
	{
		System.out.println("Length: "+get_length());
		System.out.println("Wigth: "+get_wigth());
		System.out.println("Hight: "+get_hight());
	    System.out.println("-----------");
		System.out.println("-----------");
	}
		
	
}