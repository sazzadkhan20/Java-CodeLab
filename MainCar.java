public class MainCar
{
	public static void main(String [] args)
	{
		Car C1=new Car("BMW","BW-508",2022);
		C1.startCar();
		C1.accelerate(50);
		C1.deaccelerate(10);
		System.out.println("Car Current Speed :"+C1.checkSpeed());
	}
}