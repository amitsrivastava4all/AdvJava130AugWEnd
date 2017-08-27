import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class SortById implements Comparator<Question>{
	public int compare(Question firstObject, Question secondObject){
		return ((Integer)firstObject.getId()).
				compareTo(secondObject.getId());
	}
}
class SortByName implements Comparator<Question>{
	public int compare(Question firstObject, Question secondObject){
		return firstObject.getQuestion().
				compareToIgnoreCase(secondObject.getQuestion());
	}
}
public class CRUDApp {
	private static ArrayList<Question> questionList = new ArrayList<>();
	
	public static boolean addQuestion(String question){
		Question quesObject = new Question(question);
		questionList.add(quesObject);
		return true;
	}
	
	public static ArrayList<Question> getQuestions(){
		return questionList;
	}
	
	public static boolean searchQuestion(Question question){
		boolean result  = questionList.contains(question);
		if(result){
			System.out.println("Found...");
		}
		else
		{
			System.out.println("Not Found...");
		}
		return result;
	}
	
	static void sortById(){
		
	}
	
	static void sortByQuestionName(){
		
	}
	
	static void  delete(Question question){
		int index = questionList.indexOf(question);
		//questionList.set(index, element);
		if(index>=0){
			questionList.remove(index);
			System.out.println("Record Removed...");
			System.out.println(questionList);
			//delete(question);
		}
		else
		{
			System.out.println("Not Found...");
		}
	}
	
	public static void main(String[] args) {
		CRUDApp.addQuestion("JVM");
		CRUDApp.addQuestion("JRE");
		CRUDApp.addQuestion("abc");
		System.out.println(CRUDApp.getQuestions());
		
		Question ques = new Question("JVM");
		ques.setId(1000);
		//CRUDApp.searchQuestion(ques);
		//CRUDApp.delete(ques);
		Collections.sort(CRUDApp.questionList, new SortById());
		System.out.println("After Sort "+CRUDApp.questionList);
		System.out.println("*****************************");
		Collections.sort(CRUDApp.questionList, new SortByName());
		System.out.println("After Sort "+CRUDApp.questionList);
		Collections.sort(CRUDApp.questionList,(first,second)->
		first.getQuestion().compareTo(second.getQuestion()));
		System.out.println("Lambda Result "+CRUDApp.questionList);
		Collections.sort(CRUDApp.questionList,new Comparator<Question>(){
			public int compare(Question first, Question second){
				return first.getQuestion().compareToIgnoreCase(second.getQuestion());
			}
		});
	}
	

}
