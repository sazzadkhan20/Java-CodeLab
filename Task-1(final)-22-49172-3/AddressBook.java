public class AddressBook
{
	private String ownerName;
	private Contact emergencyContact;
	private Contact [] Contacts;
	private int count=0;
	public AddressBook()
	{
		System.out.println("Address Book ");
		ownerName="No Name";
		emergencyContact=new Contact();
		Contacts=new Contact[0];
	}
	public AddressBook(String ownerName,int size)
	{
		this.ownerName=ownerName;
		Contacts=new Contact[size];
	}
	public String getOwnerName()
	{
		return ownerName;
	}
	public void setEmergencyContact(Contact ec)
	{
		count++;
	   boolean flag=false;
		for(int i=0; i<Contacts.length; i++)
		{
			if(Contacts[i]==null)
			{
				contacts[i]=ec;
				flag=true;
				break;
			}
		}
			if(flag)
			{
				System.out.println("Contact Information Successfully Store into Contact List");
			}
			else
			{
				System.out.println("Contact Information does not Store into Contact List");
			}
			emergencyContact=ec;
	}
	/*public Contact getEmergencyContact()
	{
		return emergencyContact;
	}*/
	public void setEmergencyContactByName(String na)
	{
		count++;
		boolean flag=false;
		//emergencyContact=emc;
		for(int i=0; i<Contacts.length; i++)
		{
			if(Contacts[i]!=null && Contacts[i].get_personName().equals(na))
			{
			   emergencyContact=contacts[i];
				flag=true;
				break;
			}
		}
			if(flag)
			{
				System.out.println(na+" Contact Information Successfully Store into Emergency Contact List");
			}
			else
			{
				System.out.println(na+" Contact Information does not Store into Emergency Contact List");
			} 
	}
	public void AddContact(Contact co)
	{
		boolean flag=false;
		for(int i=0; i<Contacts.length; i++)
		{
			if(Contacts[i]==null)
			{
				Contacts[i]=co;
				flag=true;
				break;
			}
		}
			if(flag)
			{
				System.out.println("Contact Information Successfully Store into Contact List");
			}
			else
			{
				System.out.println("Contact Information does not Store into Contact List");
			}
	}
	public void DeleteContact(Contact co)
	{
		boolean flag=false;
		for(int i=0; i<Contacts.length; i++)
		{
			if(Contacts[i]!=null && Contacts[i]==co)
			{
				Contacts[i]=null;
				flag=true;
				break;
			}
		}
			if(flag)
			{
				System.out.println("Contact Information Successfully Remove into Contact List");
			}
			else
			{
				System.out.println("Contact Information does not Remove into Contact List");
			}
	}
	public void DeleteContactByName(String cn)
	{
		boolean flag=false;
		for(int i=0; i<Contacts.length; i++)
		{
			if(Contacts[i]!=null && Contacts[i].get_personName().equals(cn))
			{
				Contacts[i]=null;
				flag=true;
				break;
			}
		}
			if(flag)
			{
				System.out.println(cn+" Person Contact Information Successfully Remove into Contact List");
			}
			else
			{
				System.out.println(cn+" Person Contact Information does not Remove into Contact List");
			}
	}
	public void ShowAllContactInfo()
	{
		System.out.println("Owner Name: "+getOwnerName());
		for(int i=0; i<Contacts.length; i++)
		{
			if(Contacts[i]!=null)
			{
				Contacts[i].ShowPersonInfo();
			}
		}
		if(count!=0)
		{
		  System.out.println("Emergency Contact Information : \n");
		  emergencyContact.ShowPersonInfo();
		}
}
}
	
	