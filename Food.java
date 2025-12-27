public class Food
{
	private String name;
	private String [] FoodIngredients;
	private String [] FoodNutritionalInfo;
	private int servingSize;
	private double calorieCount=0;
	public String  foodId;
	
	public Food(String name,String foodId,int s1,int s2)
	{
		this.name=name;
		this.foodId=foodId;
		FoodIngredients=new String[s1];
		FoodNutritionalInfo=new String[s2];
		
	}
	public String getName()
	{
		return name;
	}
	public String getFoodId()
	{
		return foodId;
	}
	public void insertFoodIngredients(String e)
	{
		boolean flag=false;
		for(int i=0; i<FoodIngredients.length; i++)
		{
			if(FoodIngredients[i]==null)
			{
				FoodIngredients[i]=e;
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println(e+" Ingredients Successfully Added into Food");
		}
		else
		{
			System.out.println(e+" Ingredients do not Added into Food");
		}
	}
	public void updateFoodIngredients(String e)
	{
		boolean flag=false;
		for(int i=0; i<FoodIngredients.length; i++)
		{
			if(FoodIngredients[i]!=null && FoodIngredients[i].equals(e))
			{
				FoodIngredients[i].toUpperCase();
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println(e+" Ingredients Successfully Updated into Food");
		}
		else
		{
			System.out.println(e+" Ingredients do not Update into Food");
		}
	}
	public void addFoodIngredients(String e)
	{
		boolean flag=false;
		for(int i=0; i<FoodIngredients.length; i++)
		{
			if(FoodIngredients[i]==null)
			{
				FoodIngredients[i]=e;
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println(e+" Ingredients Successfully More Added into Food");
		}
		else
		{
			System.out.println(e+" Ingredients do not More Added into Food");
		}
	}
	public void removeFoodIngredients(String e)
	{
		boolean flag=false;
		for(int i=0; i<FoodIngredients.length; i++)
		{
			if(FoodIngredients[i]!=null && FoodIngredients[i].equals(e))
			{
				FoodIngredients[i]=null;
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println(e+" Ingredients Successfully Remove into Food");
		}
		else
		{
			System.out.println(e+" Ingredients do not Remove into Food");
		}
	}
	public void insertFoodNutritionalInfo(String e,double c)
	{
		boolean flag=false;
		for(int i=0; i<FoodNutritionalInfo.length; i++)
		{
			if(FoodNutritionalInfo[i]==null)
			{
				FoodNutritionalInfo[i]=e;
				calorieCount+=c;
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println(e+" Nutritional Information Successfully Added into Food");
		}
		else
		{
			System.out.println(e+" Nutritional Information does not Add into Food");
		}
	}
	public void removeFoodNutritionalInfo(String e,double c)
	{
		boolean flag=false;
		for(int i=0; i<FoodNutritionalInfo.length; i++)
		{
			if(FoodNutritionalInfo[i]!=null && FoodNutritionalInfo[i].equals(e))
			{
				FoodNutritionalInfo[i]=null;
				calorieCount=calorieCount-c;
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println(e+" Nutritional Information Successfully Remove into Food");
		}
		else
		{
			System.out.println(e+" Nutritional Information does not Remove into Food");
		}
	}
	public void setServingSize(int a)
	{
		servingSize=a;
	}
	public int getServingSize()
	{
		return servingSize;
	}
    public double getCalorieCount()
	{
		return calorieCount*getServingSize();
	}
	public void glutenFree()
	{
		for(int i=0; i<FoodIngredients.length; i++)
		{
			if(FoodIngredients[i]!=null && FoodIngredients[i].contains("Fish"))
			{
				System.out.println(getName()+"  is Gluten Free Food");
				break;
			}
			else if(FoodIngredients[i]!=null && FoodIngredients[i].contains("Fruits"))
			{
				System.out.println(getName()+"  is Gluten Free Food");
				break;
			}
			else if(FoodIngredients[i]!=null && FoodIngredients[i].contains("Meat"))
			{
				System.out.println(getName()+"  is Gluten Free Food");
				break;
			}
			else if(FoodIngredients[i]!=null && FoodIngredients[i].contains("Vegetable"))
			{
				System.out.println(getName()+"  is Gluten Free Food");
				break;
			}
			else if(FoodIngredients[i]!=null && FoodIngredients[i].contains("Sea food"))
			{
				System.out.println(getName()+"  is Gluten Free Food");
				break;
			}
			else if(FoodIngredients[i]!=null && FoodIngredients[i].contains("Milk"))
			{
				System.out.println(getName()+"  is Gluten Free Food");
				break;
			}
			else if(FoodIngredients[i]!=null && FoodIngredients[i].contains("Potato"))
			{
				System.out.println(getName()+"  is Gluten Free Food");
				break;
			}
			else if(FoodIngredients[i]!=null && FoodIngredients[i].contains("Rice"))
			{
				System.out.println(getName()+"  is Gluten Free Food");
				break;
			}
			else
			{
				System.out.println(getName()+"  is not Gluten Free Food");
				 break;
			}
	}
	}
	public void showFoodInfo()
	{
		System.out.println("Food Name: "+getName());
		System.out.println(getName()+" Food Id: "+getFoodId());
		System.out.print(getName()+" Food All Ingredients are: ");
		for(int i=0; i<FoodIngredients.length; i++)
		{
			if(FoodIngredients[i]!=null)
			{
				System.out.print(FoodIngredients[i]+", ");
			}
		}
		System.out.print("\n\n"+getName()+" Food All Nutritional Information are: ");
		for(int i=0; i<FoodNutritionalInfo.length; i++)
		{
			if(FoodNutritionalInfo[i]!=null)
			{
				System.out.print(FoodNutritionalInfo[i]+", ");
			}
		}
		System.out.println("\n\n"+getName()+ " Food Total Calorie : "+getCalorieCount());
	}
	
	
}