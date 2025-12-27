public class MainRectangle
{
	private float length;
	private float width;
	public MainRectangle(float l,float w)
	{
		length=l;
		width=w;
	}
	public void calculatePerimeter()
	{
		System.out.println("Rectangle Perimeter: "+(2*(length+width)));
	}
	public void calculateDiagonal()
	{
		System.out.println("Rectangle Diagonal: "+(Math.sqrt((length*length)+(width*width))));
	}
	public static void main(String [] args)
	{
		MainRectangle R=new MainRectangle(25,12);
		R.calculatePerimeter();
		R.calculateDiagonal();
	}
}