public class PhoneManagementSystem
{
	public static void main(String [] args)
	{
		Contact C1=new Contact("Mr. Z","658459",15,"013xxxxxx",'M');
		AddressBook AB=new AddressBook("MD. Rahim Khan",1000);
		AB.AddContact(new Contact("Mr. X","154387",23,"017xxxxxx",'M'));
		AB.AddContact(new Contact("Mr. Y","987421",34,"019xxxxxx",'F'));
		AB.AddContact(new Contact("Mr. W","475845",40,"018xxxxxx",'F'));
		AB.AddContact(C1);
		AB.ShowAllContactInfo();
		AB.DeleteContact(C1);
		AB.ShowAllContactInfo();
		AB.DeleteContactByName("Mr. X");
		AB.ShowAllContactInfo();
		AB.setEmergencyContactByName("Mr. Y");
		AB.ShowAllContactInfo();
		AB.setEmergencyContact(new Contact("Mr. P","892941",28,"012xxxxxx",'M'));
		AB.ShowAllContactInfo();
		
		
	}
}