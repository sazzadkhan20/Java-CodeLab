public class Contact
{
	private String personName;
    private  String personId; 
    private  int age ;
    private  String mobileNumber; 
    private char gender; // M or F
	Contact()
   {
	   System.out.println("E-cons");
   }
   Contact(String n,String i,int a,String Mn,char g)
   {
	   set_personName(n);
	   set_personId(i);
	   set_age(a);
	   set_mobileNumber(Mn);
	   set_gender(g);
	   
   }
   public void set_personName(String n)
   {
	   personName=n;
   }
    public void set_age(int a)
   {
	   age=a;
   }
    public void set_personId(String i)
   {
	   personId=i;
   }
    public void set_mobileNumber(String Mn)
   {
	   mobileNumber=Mn;
   }
    public void set_gender(char g)
   {
	   gender=g;
   }
    public String get_personName()
   {
	   return personName;
   }
   public String get_personId()
   {
	   return personId;
   }
   public int get_age()
   {
	   return age;
   }
   public String get_mobileNumber()
   {
	   return mobileNumber;
   }
   public char get_gender()
   {
	   return gender;
   }
   public void ShowPersonInfo()
   {
	   System.out.println("Person Name : "+get_personName());
	   System.out.println("Person ID : "+get_personId());
	   System.out.println("Person Age : "+get_age());
	   System.out.println("Person Mobile Number : "+get_mobileNumber());
	   System.out.println("Person Gender : "+get_gender());
	   System.out.println("-----------\n-----------");
   }
   public void DetectMobileOperator()
   {
	   if(mobileNumber.length()==11)
	   {
	   if(mobileNumber.charAt(2)=='7' || mobileNumber.charAt(2)=='3')
	   {
		   System.out.println("User Use GP Operator");
	   }
	   if(mobileNumber.charAt(2)=='9' || mobileNumber.charAt(2)=='4')
	   {
		   System.out.println("User Use BL Operator");
	   }
	   if(mobileNumber.charAt(2)=='5')
	   {
		   System.out.println("User Use Teletalk Operator");
	   }
	   if(mobileNumber.charAt(2)=='6')
	   {
		   System.out.println("User Use Artel Operator");
	   }
	   if(mobileNumber.charAt(2)=='8')
	   {
		   System.out.println("User Use Robi Operator");
	   }
	   }
	   else
	   {
		   System.out.println("Invalid Mobile Number,Please Enter Again 11 Digit Mobile Number ");
	   }
   }
	
}