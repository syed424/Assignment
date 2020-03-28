package School;

public class Subject {

	private String subjectMaths;
	private String subjectScience;
	
	
	
	public Subject() {
		super();
	
	}
	public Subject(String subjectMaths, String subjectScience) {
		super();
		this.subjectMaths = subjectMaths;
		this.subjectScience = subjectScience;
	}
	@Override
	public String toString() {
		return "Subject [subjectMaths=" + subjectMaths + ", subjectScience=" + subjectScience + "]";
	}
	public String getSubjectMaths() {
		return subjectMaths;
	}
	public void setSubjectMaths(String subjectMaths) {
		this.subjectMaths = subjectMaths;
	}
	public String getSubjectScience() {
		return subjectScience;
	}
	public void setSubjectScience(String subjectScience) {
		this.subjectScience = subjectScience;
	}
	
	
}
