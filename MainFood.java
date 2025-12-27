public class MainFood
{
	public static void main(String [] args)
	{
	  FoodList F1=new FoodList(15);
	  F1.insertFood(new Food("Pasta","P-101",10,10));
	  F1.insertFood(new Food("Burger","B-102",10,10));
	  F1.insertFood(new Food("Pizza","Pa-103",10,10));
	  F1.searchFood("B-102");
	  F1.showinfo();
	  F1.removeFoodById("Pa-103");
	  F1.showinfo();
	}
	
}