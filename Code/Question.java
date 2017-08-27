
public class Question implements Comparable<Question> {
	
	private int id;
	private String question;
	private static int counter = 1000;
	Question(String question){
		this.question = question;
		
		this.id = counter;
		counter++;
	
}
	
	@Override
	public int compareTo(Question question){
		//return this.question.compareToIgnoreCase(question.question);
		//return question.question.compareToIgnoreCase(this.question);
		return ((Integer)question.id).compareTo(this.id);
	}
	
	@Override
	public boolean equals(Object object){
		
		Question question = null;
		
		if(object instanceof Question){
			
			question = (Question) object; // downcasting
			if(question == this){
				return true;
			}
			if(this.id>0 && this.question==null){
				if(question.id== this.id){
					return true;
				}
				else{
					return false;
				}
			}
			if(this.question!=null && 
					this.question.trim().length()>0 && this.id==0){
				if(this.question.equals(question.question)){
					return true;
				}
				else
				{
					return false;
				}
			}
			if(this.id>=0 && 
					this.question!=null &&
					this.question.trim().length()>0){
			if(question.id==this.id &&
					question.question.equals(this.question)){
				return true;
			}
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
		return false;
	}
	
	public void setId(int id) {
		 this.id = id;
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
