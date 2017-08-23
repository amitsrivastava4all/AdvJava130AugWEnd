
public class Question {
	
	private int id;
	private String question;
	private static int counter = 1000;
	Question(String question){
		this.question = question;
		
		this.id = counter;
		counter++;
	}
	public int getId() {
		return id;
	}
	
	public static int getCounter(){
		return counter;
	}
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	@Override
	public String toString(){
		return "Id "+id+" Name "+question;
	}

}
