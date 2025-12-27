import java.util.Scanner;

public class QuestionAnswerSeasion
{
	Question q;
	Scanner Str=new Scanner(System.in);
	public QuestionAnswerSeasion(String name)
	{
		q=new Question(name);
	}
	public void showQuestionAnswerSeasion()
	{
		for(int i=1; i<=2; i++)
		{
		q.storeQuestion(Str.nextLine());
		q.showQuestion();
		}
	}
		
	
	
}