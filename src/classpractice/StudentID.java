package classpractice;

public class StudentID {
	
	//creating instance variables
	private String studentName;
	private int studentNumber;
	private String major;
	private boolean active;
	
	//creating constructor with default values
	StudentID(){
		studentName = "Unknown Student";
		studentNumber = 10000;
		major = "Undeclared";
		active = false;
	}
	//creating constructor that passes values in parameter
	StudentID(String n, int a, String m, boolean b){
		studentName = n;
		studentNumber = a;
		major = m;
		active = b;
	}
	//method that returns the student's name
	public String getStudentName() {
		return studentName;
	}
	//method that returns the students number
	public int getStudentNumber() {
		return studentNumber;
	}
	//method that returns the major
	public String getMajor() {
		return major;
	}
	//method that returns the boolean value
	public boolean isActive() {
		return active;
	}
	//method that takes a new parameter then stores it
	//in the variable
	public void setStudentName(String newName) {
		studentName = newName;
	}
	//method that takes a new parameter then stores it
	//in the variable
	public void setStudentNumber(int newNumber) {
		studentNumber = newNumber;
	}
	//method that takes a new parameter then stores it
	//in the variable
	public void setMajor(String newMajor) {
		major = newMajor;
	}
	//method that takes a new parameter then stores it
	//in the variable
	public void setActive(boolean newStatus) {
		active = newStatus;
	}
	//converts boolean to string then uses replace method to replace
	//the word, then converts the string back to a boolean
	public void toggleActive() {
		
		String a = String.valueOf(active);
		
		a = a.replace("true", "a").replace("false", "true").replace("x", "false");
		
		active = Boolean.parseBoolean(a);
	}
	//returns student's name to all upper case
	public String getDisplayName() {
		return studentName.toUpperCase();
	}
	//returns string representation of values
	public String toString() {
		return "Student Name: "+ studentName + "\nStudent Number: "+ studentNumber + "\nMajor: "+major
				+ "\nActive Status: "+ active;
	}
}