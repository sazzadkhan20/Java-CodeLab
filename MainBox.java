import java.lang.*;

import java.util.Scanner;

public class MainBox
{
	public static void main(String [] args)
	{
		Scanner scNum=new Scanner(System.in);
		Scanner scStr=new Scanner(System.in);
		int size=scNum.nextInt();
		Box [] Boxes=new Box[size];
		//input
		for(int i=0; i<Boxes.length; i++)
		{
			double l=scNum.nextDouble();
			double w=scNum.nextDouble();
			double h=scNum.nextDouble();
			Boxes[i]=new Box(l,w,h);
			//Boxes[i]=new Box(scStr.nextDouble(),scStr.nextDouble(),scStr.nextDouble());
		}
		//output
		for(int i=0; i<Boxes.length; i++)
		{
			Boxes[i].show_Box();
		}
	}
}