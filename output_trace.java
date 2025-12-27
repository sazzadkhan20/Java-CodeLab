/*class output_trace {
static{System.out.println("static block 2 called ");}
	
output_trace() { System.out.println("Constructor called"); }
	
static{System.out.println("static block 1 called ");}
	
output_trace(int b) { 
object_creation();
System.out.println("Constructor called"); }
	
{System.out.println("Block is called");}
		public void object_creation()
{
output_trace t1 = new output_trace();}
	
public static void main(String args[])
{
System.out.println("Welcome to Java Class");
output_trace t1 = new output_trace();
t1.object_creation();
output_trace t2 = new output_trace(6);
System.out.println("Thank you for learning");		}
}*/




class output_trace {
static{System.out.println("static block 1 called ");}

static{output_trace t1 = new output_trace();}

	
output_trace(int b) { 
object_creation();
System.out.println("Constructor called"); }
	
output_trace() { 
System.out.println("Empty Constructor called"); }
	
{
System.out.println("Block called");
}
	
	public static void object_creation()
{
output_trace t1 = new output_trace();}

	
public static void main(String args[])
{
System.out.println("Welcome to Java Class");
output_trace t1 = new output_trace(3);
t1.object_creation();
output_trace t2 = new output_trace(6);
new output_trace(5);
System.out.println("Thank you for learning");
		
	}
}

