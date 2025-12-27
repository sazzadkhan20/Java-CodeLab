public class DividedByTenException extends Exception
{
	public DividedByTenException(){}
	public DividedByTenException(String s)
	{
		super(s);
	}
	public String toString()
	{
		return "Exception execute: "+super.getMessage();
	}
	
}