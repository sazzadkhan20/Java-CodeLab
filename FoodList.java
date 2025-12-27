public class FoodList
{
	private Food [] Foodlist;
	public FoodList(int size)
	{
		Foodlist=new Food[size];
	}
	public void insertFood(Food F)
	{
		boolean flag=false;
		for(int i=0; i<Foodlist.length; i++)
		{
			if(Foodlist[i]==null)
			{
				Foodlist[i]=F;
				Foodlist[i].insertFoodIngredients("Meat");
				Foodlist[i].insertFoodIngredients("Vegetable");
				Foodlist[i].insertFoodIngredients("potato");
				Foodlist[i].addFoodIngredients("Onion");
				Foodlist[i].updateFoodIngredients("Meat");
				Foodlist[i].removeFoodIngredients("potato");
				Foodlist[i].insertFoodNutritionalInfo("Vitamin",40);
				Foodlist[i].insertFoodNutritionalInfo("Protin",50);
				Foodlist[i].insertFoodNutritionalInfo("Glucose",5);
				Foodlist[i].insertFoodNutritionalInfo("Ieodin",25);
				Foodlist[i].removeFoodNutritionalInfo("Glucose",5);
				Foodlist[i].setServingSize(100);
				Foodlist[i].glutenFree();
				
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println(" Food Successfully Insert");
		}
		else
		{
			System.out.println(" Food does not Insert");
		}
	}
	public void searchFood(String id)
	{
		boolean flag=false;
		for(int i=0; i<Foodlist.length; i++)
		{
			if(Foodlist[i]!=null && Foodlist[i].getFoodId().equals(id))
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println(id+" Food id's  Found");
		}
		else
		{
			System.out.println(id+" Food id's Not Found");
		}
	}
	public void removeFoodById(String id)
	{
		boolean flag=false;
		for(int i=0; i<Foodlist.length; i++)
		{
			if(Foodlist[i]!=null && Foodlist[i].getFoodId().equals(id))
			{
				Foodlist[i]=null;
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println(id+" Food id's Food Successfully Remove");
		}
		else
		{
			System.out.println(id+" Food id's Food does not Remove");
		}
	}
	public void showinfo()
	{
		for(int i=0; i<Foodlist.length; i++)
		{
			if(Foodlist[i]!=null)
			{
				Foodlist[i].showFoodInfo();
			}
		}
	}
	
	
}