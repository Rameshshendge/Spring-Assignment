package second_assignment;


import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
	private int questionId;
	private List<String> questions ;
	
	private List<String> answers;
	private Set<String> answers1;
	private Map<Integer,String> answers2;
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", questions=" + questions + ", answers=" + answers
				+ ", answers1=" + answers1 + ", answers2=" + answers2 + "]";
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int questionId, List<String> questions, List<String> answers, Set<String> answers1,
			Map<Integer, String> answers2) {
		super();
		this.questionId = questionId;
		this.questions = questions;
		this.answers = answers;
		this.answers1 = answers1;
		this.answers2 = answers2;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public List<String> getQuestions() {
		return questions;
	}
	public void setQuestions(List<String> questions) {
		this.questions = questions;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	public Set<String> getAnswers1() {
		return answers1;
	}
	public void setAnswers1(Set<String> answers1) {
		this.answers1 = answers1;
	}
	public Map<Integer, String> getAnswers2() {
		return answers2;
	}
	public void setAnswers2(Map<Integer, String> answers2) {
		this.answers2 = answers2;
	}


}