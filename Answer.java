public class Answer
{
	private String [] answers;
	public Answer(int size)
	{
		answers=new String[size];
	}
	public void storeAnswer(String s)
	{
		
	for(int i=0; i<answers.length; i++)
	{
		if(answers[i]==null)
        {
		  answers[i]=s;	
		  break;
		}
	}
	}
	public void deleteAnswer()
	{
		
	for(int i=0; i<answers.length; i++)
	{
		if(answers[i]!=null)
        {
		  answers[i]=null;	
		  
		}
	}
	}
	public void showAnswer()
	{
		
	for(int i=0; i<answers.length; i++)
	{
		if(answers[i]!=null)
        {
		  System.out.println(answers[i]);
		}
	}
	this.deleteAnswer();
	}
	
	
}