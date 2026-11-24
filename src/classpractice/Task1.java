package classpractice;
/*
* File: Task1.java
* Author: Jalen Brown
* Course: CISC230
* Lab: Lab4
* Date: 10/21/2026
* 
* Description:
* Program acts as a restaurant bill calculator. Prompts the
* user to enter the cost of a meal and a gratuity rate as a
* percentage. Inputs are passed from main() to the processBill()
* method, which coordinates the billing process by calling other
* methods. Uses a calculateGratuity() method to compute the tip
* amount, and a calculateTotal() method that calls
* calculateGratuity() to avoid repeating the formula and
* returns the final bill. Uses a printReceipt() method with the
* DecimalFormat class to display values with two decimal places.
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Task1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the cost of the meal:");
		double a = scan.nextDouble();
		
		System.out.println("Enter the gratuity rate (%):");
		double b = scan.nextDouble();
		
		//calling processBill method
		processBill(a,b);
		
		scan.close();
		
	}	
	
	//creating a method that calls the receipt
	public static void processBill(double a, double b){
			
			double total = calculateTotal(a,b);
			
			double gratuity = calculateGratuity(a,b);
						
			printReceipt(a,b, gratuity, total);
			
		}
		
	//creating method that calculates my gratuity	
	public static double calculateGratuity(double a, double b) {
			
			return a * (b / 100);
		}
	//creating method that calls my gratuity method to calculate the total	
	public static double calculateTotal(double a, double b){
			
			return a + calculateGratuity(a,b);
		}
	//creating a method that displays all my values in a clean format	
	public static void printReceipt(double a, double b, double gratuity, double total) {
			
			//creating object from DecimalFormat class that changes my number format
			DecimalFormat format = new DecimalFormat("0.00");
			
			System.out.println("=================================");
			System.out.println("	  BILL SUMMARY			 	 ");
			System.out.println("=================================");

			//printing our user entered values
			System.out.println("Meal Cost		:$" + format.format(a));

			System.out.println("Gratuity Rate		:"+ format.format(b) + "%");
			
			//calculating gratuity amount
			System.out.println("Gratuity Amount		:$" + format.format(gratuity));
			System.out.println("=================================");
			
			//calculating total amount
			System.out.println("Total Amount		:$" + format.format(total));
			System.out.println("=================================");
		}
}