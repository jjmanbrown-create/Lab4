package classpractice;
/*
* File: Task3.java
* Author: Jalen Brown
* Course: CISC230
* Lab: Lab4
* Date: 10/21/2026
* 
* Description:
* Program acts as a fitness challenge report generator. Creates
* four FitnessParticipant objects, each built with a different
* constructor: one with a full name, distance, and calories, one
* with only a name, and one with no arguments that uses default
* values. Each object then calls its own printFitnessReport()
* method.
*/
public class Task3 {

	public static void main(String[] args) {
		
		//creating objects that use constructors created in the fitness participant
		//class
		FitnessParticipant p1 = new FitnessParticipant("Maya", "Chen", 4.5, 472);
		FitnessParticipant p2 = new FitnessParticipant("Alex", "Johnson", 2.0, 315);
		FitnessParticipant p3 = new FitnessParticipant("Sara", "Williams");
		FitnessParticipant p4 = new FitnessParticipant();
		
		System.out.println("===========FITNESS CHALLENGE REPORT===========");
		
		//prints the fitness report based off of the different constructors
		p1.printFitnessReport();
		p2.printFitnessReport();
		p3.printFitnessReport();
		p4.printFitnessReport();
	}

}