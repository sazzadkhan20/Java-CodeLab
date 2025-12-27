public class MainOrder
{
	
	public static void main(String [] args)
	{
		Order C1=new Order("1235485","MD. SAZZAD KHAN",50);
		C1.orderChoice("Shirt");
		C1.orderChoice("Pant");
		C1.orderChoice("Panjabi");
		C1.orderChoice("Shoes");
		C1.addOrder("T-Shirt");
		C1.removeOrder("Pant");
		C1.showOrderInfo();
	}
}