import java.lang.*;
 class Box{
	private double length;
	private double width;
	public double height;
	//Empty Constructor
	Box(){System.out.println("E-Constructor");}
	//Parameterized Constructor
	Box(double l,double w,double h){
		setLength(l);
		setWidth(w);
		height = h;
	}
	public void setLength(double l){
		if(l>=0){length = l;}
		else{System.out.println("Invalid Data, value is unchanged");}
	}
	public void setWidth(double w){
		if(w>=0){width = w;}
		else{System.out.println("Invalid Data, value is unchanged");}
	}
	
	public double getLength(){return length;}
	public double getWidth(){return width;}

	public void showBox(){
		System.out.println("Length: "+length);
		System.out.println("Width: "+width);
		System.out.println("Height: "+height);
	}
}
public class Start{
	public static void main(String[] args){
		Box b = new Box();
		Box b1 = new Box(-10,8,5);
		b.setLength(15);
		b.setWidth(-22);
		
		b.setWidth(22);
		
		b.showBox();
		b1.showBox();
		
		System.out.println(b.getLength()+b1.getLength());

	}
}
