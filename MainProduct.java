public class MainProduct
{
	public static void main(String [] args)
	{
		Product P1=new Product("Hand Wash","HW-102",60);
		P1.checkProductStock();
		P1.checkProductWarranty();
		P1.productReturnPolicy();
		P1.showInfo();
	}
}