import java.io.*; 
 public class BoxList1
{
	private Box1 [] Boxes;
	private FileReader reader;	
	private BufferedReader bfr;
	public BoxList1(int size)
	{
		Boxes=new Box1[size];
		this.loadFromFile();
	}
	public void insertBox(Box1 b)
	{
		boolean flag=false;
		for(int i=0; i<Boxes.length; i++)
		{
			if(Boxes[i]==null)
			{
				Boxes[i]=b;
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Box Successfully inserted ");
		}
		else
		{
			System.out.println("Box List Is Full,Cannot Save Box ");
		}
		
	}
	
	public Box1[] getAllBoxes()
	{
	  return Boxes;	
	}
	
	/*public Box1[] getAllBoxes()
  {
    Box1[] allBoxes = new Box1[Boxes.length];
    for (int i = 0; i < Boxes.length; i++)
    {
		if(Boxes[i]!=null){
        allBoxes[i] = Boxes[i];
		}
    }
    return allBoxes;
  }*/
	
	public void showAllBoxes()
	{
		for(int i=0; i<Boxes.length; i++)
		{
			if(Boxes[i]!=null)
			{
			Boxes[i].showBox();
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
				TotalArea+=Boxes[i].getArea();
			}
		}
		System.out.println("Total Area of All Boxes: "+TotalArea);
		
	}
	public void removeBoxById(int Id)
	{
		boolean flag=false;
		for(int i=0; i<Boxes.length; i++)
		{
			if(Boxes[i]!=null)
			{
			if((Boxes[i].getBoxId())==Id)
			{
				Boxes[i]=null;
				flag=true;
				break;
			}
			}
		}
		if(flag)
		{
		System.out.println("Box Successfully Removed");
		}
		else
		{
			System.out.println("SORRY Input Id Not Match Any Boxes,Please Try one more time");
		}
				
		
	}
	public void loadFromFile(){
		try
		{
			File file = new File("MyBox1.txt");
			reader = new FileReader(file);			//creating the reader object to read from a file.
			bfr = new BufferedReader(reader);		//creating the BufferedReader object using the reader object to read the file content.
			//String singleLine;
            String singleLine;			//declaring two string variables to store the content after reading.
			
			while((singleLine=bfr.readLine())!=null)		//reading one line from the file, storing it in the variable temp and checking whether it is null or not. It will be null at the end of reading from the file.
			{
				
				 String sp[] = singleLine.split("/");
				 //int id = sp[0];
				 double length = Double.parseDouble(sp[0]);
				 double width = Double.parseDouble(sp[1]);
				 double height = Double.parseDouble(sp[2]);
				
				Box1 b = new Box1(length,width,height);
				this.insertBox(b);
				
			}
			
			reader.close();							
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
			//System.out.println(ioe);
		}
	}
}