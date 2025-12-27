public class ContactNum
{
	private String name;
	private String number;
	public ContactNum(String n,String nu)
	{
		name=n;
		number=nu;
	}
	public void setname(String n)
	{
		name=n;
	}
	public  void setnumber(String nu)
	{
		number=nu;
	}
	public String getname()
	{
		return name;
	}
	public String getnumber()
	{
		return number;
	}
	public void showInfo()
	{
		System.out.println("Name : "+getname());
		System.out.println("Contact Number : "+getnumber());
		System.out.println("-----------/n----------");
	}
}