public class AddressBook
{
	private String ownerName;
	private Contact [] emergencyContact;
	private Contact [] Contacts;
	private int count=0;
	public AddressBook()
	{
		System.out.println("Address Book ");
		ownerName="No Name";
		emergencyContact=new Contact[0];
		Contacts=new Contact[0];
	}
	public AddressBook(String ownerName,int size)
	{
		this.ownerName=ownerName;
		Contacts=new Contact[size];
		emergencyContact=new Contact[size];
	}
	public String getOwnerName()
	{
		return ownerName;
	}
	public void setEmergencyContact(Contact co)
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
		        boolean F1=false;
		       for(int i=0; i<emergencyContact.length; i++)
			   { 
	
				   if(emergencyContact[i]==null)
				   {
				      emergencyContact[i]=co;
					  count++;
					  F1=true;
					  break;
				   }
			   }
			   if(F1)
			   {
				System.out.println("Contact Information Successfully Store into Emergency Contact List");
			   }
			   else
			{
				System.out.println("Contact Information does not Store into Emergency Contact List");
			}
			   
			}
			else
			{
				System.out.println("Contact Information does not Store into Contact List");
			}
	}
	public void setEmergencyContactByName(String na)
	{
		boolean flag=false;
		for(int i=0; i<Contacts.length; i++)
		{
			if(Contacts[i]!=null && Contacts[i].get_personName().equals(na))
			{
				boolean F2=false;
				for(int j=0; j<emergencyContact.length; j++)
			   {
				   if(emergencyContact[j]==null)
				   {
				      emergencyContact[j]=Contacts[i];
					  count++;
					  F2=true;
					  break;
				   }
			   }
			   if(F2)
			{
				System.out.println(na+" Person Contact Information Successfully Store into Emergency Contact List");
			}
			else
			{
				System.out.println(na+" Person Contact Information does not Store into Emergency Contact List");
			} 
				flag=true;
				break;
			}
		}
			if(!flag)
			{
				System.out.println(na+" Person Contact Information does not Match any Contact From Contact List");
			}
	}
	public void DeleteEmergencyContactByName(String na)
	{
		boolean flag=false;
		for(int i=0; i<emergencyContact.length; i++)
		{
			if(emergencyContact[i]!=null && emergencyContact[i].get_personName().equals(na))
			{
				emergencyContact[i]=null;
				count=count-1;
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println(na+" Person Contact Information Successfully Remove From Emergency Contact List");
		}
		else
		{
			System.out.println(na+" Person Contact Information do not Remove From Emergency Contact List");
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
		for(int i=0; i<emergencyContact.length; i++)
		{
			if(emergencyContact[i]!=null)
			{
		      emergencyContact[i].ShowPersonInfo();
			}
		}
		}
}
}
	
	