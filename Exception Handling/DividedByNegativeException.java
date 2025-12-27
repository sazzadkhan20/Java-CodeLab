public class DividedByNegativeException extends Exception
{
	public DividedByNegativeException(){}
	public DividedByNegativeException(String s)
	{
		super(s);
	}
	public String toString()
	{
		return "Exception execute: "+super.getMessage();
	}
}