public class Main
{
	static{ System.out.println("House of Dead");}
	
	public static void main(String []ars)
	{
		Warrior obj = new Warrior();
        Warrior obj2 = new Warrior();
		obj.show();
		obj.revive();
		obj2.show();
		System.out.println("Game End");
	}
	
}
/*public class Main
{
	static{ System.out.println("Road Rash");}
	
	public static void main(String []ars)
	{
		Warrior obj = new Warrior();
		obj.show();
		obj.revive();
        Warrior obj2 = new Warrior();
		System.out.println("Game End");
        obj2.show();
	}      

}*/

