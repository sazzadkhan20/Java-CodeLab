import java.util.Scanner;

/*public class AnswerList
{
	Scanner sc=new Scanner(System.in);
	private Answer [] answerlist;
   public AnswerList(int size)
   {
    	answerlist=new Answer[size]; 
   }
   public void storeAnswerList(Answer obj)
   {
	   for(int i=0; i<answerlist.length; i++)
	   {
		   if(answerlist[i]==null)
		   {
		   answerlist[i]=obj;
		   answerlist[i].storeAnswer(sc.nextLine());
		   answerlist[i].storeAnswer(sc.nextLine());
		   answerlist[i].storeAnswer(sc.nextLine());
		   break;
		   }
	   }
   } 
    public void showAnswerList()
   {
	   static int i;
	   for(i=0; i<answerlist.length; i++)
	   {
		   if(answerlist[i]!=null)
		   {
		     answerlist[i].showAnswer();
		   }
		   
	   }
   }    
       
}*/
public class AnswerList
{
	Scanner sc=new Scanner(System.in);
	private Answer answerlist;
   public AnswerList(int size)
   {
    	answerlist=new Answer(size); 
   }
   public void storeAnswerList()
   {
		answerlist.storeAnswer(sc.nextLine());
		answerlist.storeAnswer(sc.nextLine());
	    answerlist.storeAnswer(sc.nextLine());
   } 
    public void showAnswerList()
   {
		  
     answerlist.showAnswer();
	 answerlist.deleteAnswer();
		   
   }    
       
}