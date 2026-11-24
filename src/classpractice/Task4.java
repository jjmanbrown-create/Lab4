package classpractice;
/*
* File: Task4.java
* Author: Jalen Brown
* Course: CISC230
* Lab: Lab4
* Date: 10/21/2026
* 
* Description:
* Program acts as a Tommie student ID system. Creates two
* StudentID objects, one with the parameterized constructor and
* one with the no-argument constructor, then updates the second
* object's information using setter methods. Uses various methods
* then changes student1's major and flips student2's active status 
* with toggleActive(), and uses the getMajor() and isActive() 
* getters to verify that each object keeps its own independent 
* information.
*/
public class Task4 {

	public static void main(String[] args) {
		
		//student1.studentName = "John Smith";
		
		//creates object that uses a constructor from the StudentID class
		StudentID student1 = new StudentID("Alex Kim", 10234, 
				"Computer Science", true);
		
		//student1.setStudentName("John Smith");
		
		//creates object that uses a constructor from the StudentID class
		StudentID student2 = new StudentID();
		
		//using the setter methods to set objects to different values rather than the default
		//ones 
		student2.setStudentName("Maya Chen");
		student2.setStudentNumber(10567);
		student2.setMajor("Data Science");
		student2.setActive(false);
		
		System.out.println("===========TOMMIE STUDENT ID SYSTEM===========");
		System.out.println("\n-----------STUDENT 1-----------");
		//calling the toString method to display the multi line summary
		System.out.println(student1.toString());
		//calling method that displays name in all upper case
		System.out.println("Display Name: " + student1.getDisplayName());
		
		System.out.println("\n-----------STUDENT 2-----------");
		//calling the toString method to display the multi line summary
		System.out.println(student2.toString());
		//calling method that displays name in all upper case
		System.out.println("Display Name: " +student2.getDisplayName());
		System.out.println("===========UPDATED INFORMATION===========");
		
		//calling set method that sets major to a different one
		student1.setMajor("Artificial Intelligence");
		//calling method that replaces whatever the original boolean value
		//is with the opposite one
		student2.toggleActive();
		
		System.out.println("\n-----------STUDENT 1-----------");
		//calling the toString method to display the multi line summary
		//with new values
		System.out.println(student1.toString());
		
		System.out.println("\n-----------STUDENT 2-----------");
		//calling the toString method to display the multi line summary
		//with new values
		System.out.println(student2.toString());
		
		System.out.println("\n-----------VERIFICATION-----------");
		//calling the getMajor method to display the major
		System.out.println("Student 1 Updated Major: " + student1.getMajor());
		//calling the isActive method to display the boolean value
		System.out.println("Student 2 Active Status: " + student2.isActive()); 
	}

}
