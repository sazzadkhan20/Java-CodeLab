public class Order
{
	private String orderNumber;
	private String name;
	private String [] orderList;
	private double totalCost=0;
	private double orderDeliveryChargePerProduct=15;
	public Order(String orderNumber,String name,int size)
	{
		this.orderNumber=orderNumber;
		this.name=name;
		orderList=new String[size];
	}
	public void orderChoice(String o)
	{
		int amount=0;
		if(("Shirt").equals(o))
		{
			amount=1000;
		}
		if(("Pant").equals(o))
		{
			amount=700;
		}
		if(("T-Shirt").equals(o))
		{
			amount=800;
		}
		if(("Panjabi").equals(o))
		{
			amount=1500;
		}
		if(("Shoes").equals(o))
		{
			amount=2000;
		}
		if(("Bag").equals(o))
		{
			amount=2500;
		}
		boolean flag=false;
		for(int i=0; i<orderList.length; i++)
		{
			if(orderList[i]==null)
			{
				orderList[i]=o;
				totalCost=(totalCost+orderDeliveryChargePerProduct+amount);
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println(o+" Product Successfully Recieve Order and take this Order in your order List,If you want to order other products you have to select 1st ");
		}
		else
		{
			System.out.println("Product does not take Order");
		}
	}
	public void addOrder(String o)
	{
		int amount=0;
		if(("Shirt").equals(o))
		{
			amount=1000;
		}
	if(("Pant").equals(o))
		{
			amount=700;
		}
		if(("T-Shirt").equals(o))
		{
			amount=800;
		}
		if(("Panjabi").equals(o))
		{
			amount=1500;
		}
		if(("Shoes").equals(o))
		{
			amount=2000;
		}
		if(("Bag").equals(o))
		{
			amount=2500;
		}
		boolean flag=false;
		for(int i=0; i<orderList.length; i++)
		{
			if(orderList[i]==null)
			{
				orderList[i]=o;
				totalCost=(totalCost+orderDeliveryChargePerProduct+amount);
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println(o+" Product Successfully Add your Order List,If you want to Add order other products you have to select 1st ");
		}
		else
		{
			System.out.println("Product does not Add Order List");
		}
	}
	public void removeOrder(String o)
	{
		int amount=0;
		if(("Shirt").equals(o))
		{
			amount=1000;
		}
		if(("Pant").equals(o))
		{
			amount=700;
		}
		if(("T-Shirt").equals(o))
		{
			amount=800;
		}
		if(("Panjabi").equals(o))
		{
			amount=1500;
		}
		if(("Shoes").equals(o))
		{
			amount=2000;
		}
		if(("Bag").equals(o))
		{
			amount=2500;
		}
		boolean flag=false;
		for(int i=0; i<orderList.length; i++)
		{
			if(orderList[i]!=null && orderList[i].equals(o))
			{
				orderList[i]=null;
				totalCost=(totalCost-orderDeliveryChargePerProduct-amount);
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println(o+" Product Successfully Remove in your order List,If you want to order other products you have to select 1st ");
		}
		else
		{
			System.out.println("Product Order does not  Remove");
		}
	}
	public void showOrderInfo()
	{
		System.out.println("\n\nCustomer Name: "+name);
		System.out.println(name+" Customer Order Number: "+orderNumber);
		System.out.print(name+" Customer Order List of Products : ");
		for(int i=0; i<orderList.length; i++)
		{
			if(orderList[i]!=null)
			{
			System.out.print(orderList[i]+", ");
			}
		}
		System.out.println("\n"+name+" Customer Total Cost of Order : "+totalCost);
	}
}