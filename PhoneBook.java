public class PhoneBook
{
	private ContactNum [] ContactNums;
	public PhoneBook(int size)
	{
		ContactNums=new ContactNum[size];
	}
	public void addContact(ContactNum c)
	{
		boolean flag=false;
		for(int i=0; i<ContactNums.length; i++)
		{
			if(ContactNums[i]==null)
			{
				ContactNums[i]=c;
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("Contact Number Successfully added");
		}
		else
		{
			System.out.println("Contact list Fulled");
		}
	}
	public void deleteContact(String n)
	{
		boolean flag=false;
		for(int i=0; i<ContactNums.length; i++)
		{
			if(ContactNums[i]!=null && ContactNums[i].getname().equals(n))
			{
				System.out.println("Deleted Name And Number Is:");
				System.out.println("Name : "+ContactNums[i].getname());
		        System.out.println("Contact Number : "+ContactNums[i].getnumber());
				ContactNums[i]=null;
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("Contact Number Successfully deleted");
		}
		else
		{
			System.out.println("Contact Number Does not Exist");
		}
	}
	public void serachContact(String c)
	{
	  boolean flag=false;
		for(int i=0; i<ContactNums.length; i++)
		{
			if(ContactNums[i]!=null && ContactNums[i].getnumber().equals(c))
			{
			    System.out.println("Serach Name : "+ContactNums[i].getname());
		        System.out.println("Serach Contact Number : "+ContactNums[i].getnumber());
		        System.out.println("-----------/n----------");
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("Contact number does not Exist");
		}
	}
	public void updateContact(String c)
	{
	   boolean flag=false;
		for(int i=0; i<ContactNums.length; i++)
		{
			if(ContactNums[i]!=null && ContactNums[i].getname().equals(c))
			{
				ContactNums[i].setnumber("+88"+ContactNums[i].getnumber());
				ContactNums[i].setname(ContactNums[i].getname().toUpperCase());
				System.out.println("Update Name : "+ContactNums[i].getname());
		        System.out.println("Update Contact Number : "+ContactNums[i].getnumber());
		        System.out.println("-----------/n----------");
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("Contact Number Successfully Updated");
		}
		else
		{
			System.out.println("Contact number does not exist");
		}
	}
	public void show()
	{
		for(int i=0; i<ContactNums.length; i++)
		{
			if(ContactNums[i]!=null)
			{
				ContactNums[i].showInfo();
				
			}
		}
	}
}