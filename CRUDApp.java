import java.util.ArrayList;

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
	
	

}
