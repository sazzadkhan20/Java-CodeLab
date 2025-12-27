public class BoxList
{ 
    private XBox [] Boxes;
	BoxList()
	{
		Boxes=new XBox [3];
	}
	BoxList(int size)
	{
		Boxes=new XBox [size];
	}
	public void insertBox(XBox b)
    { 
	    boolean flag=false;
		for(int i=0; i<Boxes.length; i++)
		{
			if(Boxes[i]==null)
			{
			Boxes[i]=b;
			flag=true;
			//System.out.println("Box Successfully inserted");
			break;
			}
		}
		if(flag)
		{
			System.out.println("Box Successfully inserted");
		}
		else
		{
			System.out.println("Box List is Full,Can not save Box");
		}
	}
	public void showAllBox()
	{
		for(int i=0; i<Boxes.length; i++)
		{
			if(Boxes[i]!=null)
			{
			Boxes[i].show_XBox();
			}
		}
	}
	public void TotalArea()
	{
	  double TotalArea=0;
	  for(int i=0; i<Boxes.length; i++)
	  {
		  if(Boxes[i]!=null)
		  {
			  TotalArea+= Boxes[i].areaofBox();
		  }
	  }
	  System.out.println("Toatl Area of All Boxes is: "+TotalArea);
	}
		
	
	
}