public class Product
{
	private String name;
	private String id;
	private double price;
	private boolean productAvailable;
	private boolean productWarranty;
	private boolean productDefect;
	private boolean returnPolicy=false;
	public Product(String n,String i,double p)
	{
		name=n;
		id=i;
		price=p;
		this.productAvailable=true;
		this.productWarranty=true;
		this.productDefect=false;
	}
	public void checkProductStock()
	{
		if(productAvailable)
		{
			System.out.println("Product is available in Stock");
		}
		else
		{
			System.out.println("Product is not available in Stock");
		}
			
	}
	public void checkProductWarranty()
	{
		if(productAvailable)
		{
		if(productWarranty)
		{
			System.out.println("Product have Warranty");
		}
		else{
			System.out.println("Product have not Warranty"); 
		}
		
        }
		else
		{
			System.out.println("Product is not available in Stock");
		}
			
	}
	public void productReturnPolicy()
	{
		if(productAvailable && productWarranty && productDefect)
		{
		 returnPolicy=true;
		}
		if(returnPolicy)
		{
			System.out.println("Product have Return Policy");
		}
		else{
			System.out.println("Product have not return policy");
		}
	}
	public void showInfo()
	{
		System.out.println("Product Name: "+name);
		System.out.println("Product Id: "+id);
		System.out.println("Product Price: "+price);
	}
		

}