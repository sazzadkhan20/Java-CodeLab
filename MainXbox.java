import java.lang.*;

import java.util.Scanner;

public class MainXbox
{
	public static void main(String [] args)
	{
		Scanner scNum=new Scanner(System.in);
		Scanner scStr=new Scanner(System.in);
		System.out.println("Please Enter Boxes number");
		BoxList boxlist=new BoxList(scNum.nextInt());
		/*XBox b1=new XBox(1,2,3);
		XBox b2=new XBox(2,2,4);*/
		System.out.println("Please Enter a Box Length,Width,Hight ");
		boxlist.insertBox(new XBox(scNum.nextDouble(),scNum.nextDouble(),scNum.nextDouble()));
		System.out.println("Please Enter another Box Length,Width,Hight ");
		boxlist.insertBox(new XBox(scNum.nextDouble(),scNum.nextDouble(),scNum.nextDouble()));
		boxlist.showAllBox();
		boxlist.TotalArea();
	}
}