package classpractice;
/*
* File: Task2.java
* Author: Jalen Brown
* Course: CISC230
* Lab: Lab4
* Date: 10/21/2026
* 
* Description:
* Program acts as a campus printing cost calculator. Uses
* method overloading to calculate the cost of a print job.
* The discounted version calls the black and white
* method instead of repeating its formula. Uses two overloaded
* displayReceipt() methods, a basic and a detailed version,
* along with the DecimalFormat class to show costs with two
* decimal places.
*/
import java.text.DecimalFormat;


public class Task2 {
	
	public static void main(String[] args) {
		
		//creating objects
		String n = "Jalen";
		int pages = 10;
		double discountRate = 20.00;
		
		System.out.println("============TOMMIE CAMPUS PRINTING============");
		System.out.println("\nStudent Name: " + n);
		
		//creating variables to store my called methods
		double a = calculateCost(pages);
		double b = calculateCost(pages, true);
		double c = calculateCost(pages, discountRate);
		
		//calling my different receipts
		displayReceipt(n, a);
		displayReceipt(n, pages, "Color", b);
		displayReceipt(n, pages, "Double-Sided", c);
		
	}
	//method that calculates the cost per page (black/white)
	public static double calculateCost(int pages) {
				
		return pages * 0.10;
	}
	//method that calculates the cost per page (in color)
	public static double calculateCost(int pages, boolean isColor) {
						
		return pages * 0.25;
		
	}
	//method that calculates cost with applied discount rate,
	//while also calling the previous method
	public static double calculateCost(int pages, double discountRate) {
		
		return calculateCost(pages) * (1 - discountRate / 100);
	}
	//method that displays the basic receipt using the decimal format class
	public static void displayReceipt(String studentName, double cost) {
		
		DecimalFormat fmt = new DecimalFormat("0.00");
		
		System.out.println("\n------------BASIC RECEIPT------------");
		System.out.println("Student Name: " + studentName);
		System.out.println("Printing Cost: $" + fmt.format(cost));
	}
	//method that displays the detailed receipt while using the decimal format class
	public static void displayReceipt(String studentName, int pages, String
			printingType, double cost) {
		
		DecimalFormat fmt = new DecimalFormat("0.00");
		
		System.out.println("\n------------DETAILED RECEIPT------------");
		System.out.println("Student Name: " + studentName);
		System.out.println("Pages: " + pages);
		System.out.println("Printing Type: " + printingType);
		System.out.println("Printing Cost: $" + fmt.format(cost));
	}		
}