package classpractice;

import java.text.DecimalFormat;

public class FitnessParticipant {

	//creating instance variables
	private String firstName;
	private String lastName;
	private Double distanceMiles;
	private int participantNumber;
	
	//creating constructor with default values
	FitnessParticipant(){
		firstName = "Unknown";
		lastName = "Participant";
		distanceMiles = 0.0;
		participantNumber = 100;
	}
	//creating constructor that passes values in parameter
	FitnessParticipant(String a, String b){
		firstName = a;
		lastName = b;
		distanceMiles = 0.0;
		participantNumber = 100;
	}
	//creating constructor that passes values in parameter
	FitnessParticipant(String a, String b, double c, int d){
		firstName = a;
		lastName = b;
		distanceMiles = c;
		participantNumber = d;
	}
	//method that combines the strings
	public String getFullName() {
		
		return firstName + " " +  lastName;
	}
	//method that obtains the first two characters of both strings
	//and converts them to all upper case
	public String createParticipantCode() {
		firstName = firstName.substring(0, 2);
		lastName = lastName.substring(0, 2);
		
		return firstName.toUpperCase() + lastName.toUpperCase()
			+ participantNumber;
	}
	//method that uses formula to convert miles to kilometers
	public double convertMilesToKilometers() {
		return distanceMiles * 1.60934;
	}
	//method that uses formula to estimate the amount of calories
	//burned
	public int estimateCalories() {
		double calories = Math.ceil(distanceMiles * 95.5);
		return (int) calories;
	}
	//method that prints all values by calling the methods and using decimal format
	//class to change the decimal format
	public void printFitnessReport() {
		
		DecimalFormat fmt = new DecimalFormat("0.00");
		
		System.out.println("\nParticipant Name: " + getFullName());
		System.out.println("Participant Code: " + createParticipantCode());
		System.out.println("Distance (Miles): " + fmt.format(distanceMiles));
		System.out.println("Distance (KM): " + fmt.format(convertMilesToKilometers()));
		System.out.println("Calories Burned: " + estimateCalories());
		
		System.out.println("----------------------------------------------");
	}
}