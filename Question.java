import java.util.Scanner;

public class Question
{
	private String name;
	public String [] questions;
	Answer anslist;
	Scanner Sc=new Scanner(System.in);
	
	public Question(String n)
	{
		System.out.println("Name: "+n);
		questions=new String[100000];
		anslist=new Answer(3);
		
	}
	
	public void storeQuestion(String s)
	{
		
	for(int i=0; i<questions.length; i++)
	{
		if(questions[i]==null)
        {
		  questions[i]=s;
		  for(int j=0; i<5; i++)
		  {
		    anslist.storeAnswer(Sc.nextLine());
		  }
		  break;
         		  
		}
	}
	}
	public void deleteQuestion()
	{
		
	for(int i=0; i<questions.length; i++)
	{
		if(questions[i]!=null)
        {
		  questions[i]=null;
         		  
		}
	}
	}
	public void showQuestion()
	{
		for(int i=0; i<questions.length; i++)
	{
		
		if(questions[i]!=null)
        {
		  System.out.println(questions[i]);
		  anslist.showAnswer();
		  deleteQuestion();
		  
		}
	}
	}
}
	