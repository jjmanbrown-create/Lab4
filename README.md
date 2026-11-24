# Lab 4 – Java Programming Projects

This repository contains four Java programming tasks completed as part of CISC 230 (Object-Oriented Design and Programming) at the University of St. Thomas. Each task focuses on applying Java programming concepts through practical applications involving calculations, method overloading, constructors, and object-oriented design.

## Task 1: Restaurant Bill Calculator
Developed a restaurant bill calculator that prompts users to enter a meal cost and gratuity rate to calculate the tip amount and final bill.

**Features:**
- Accept meal costs and gratuity rates as user input.
- Use a `processBill()` method to coordinate the billing process.
- Calculate gratuity using a dedicated `calculateGratuity()` method.
- Calculate the final bill using a `calculateTotal()` method that reuses the gratuity calculation.
- Generate a formatted receipt using the `printReceipt()` method.
- Use Java's `DecimalFormat` class to display monetary values with two decimal places.

## Task 2: Campus Printing Cost Calculator
Created a printing cost calculator that uses method overloading to calculate printing costs based on different printing options.

**Features:**
- Calculate printing costs for black and white print jobs.
- Use method overloading to support discounted printing costs.
- Reuse the black and white calculation method when calculating discounted costs.
- Implement two overloaded `displayReceipt()` methods for basic and detailed receipts.
- Use `DecimalFormat` to display costs with two decimal places.

## Task 3: Fitness Challenge Report Generator
Developed a fitness challenge report generator that creates four `FitnessParticipant` objects using different constructors and displays individual fitness reports.

**Features:**
- Create participant objects using different constructors.
- Initialize objects with a full name, distance, and calories.
- Support constructors with only a name or no arguments using default values.
- Call each object's `printFitnessReport()` method to display its information.
- Demonstrate constructor overloading and object initialization.

## Task 4: Tommie Student ID System
Created a student ID management program that demonstrates object creation, constructors, getters, setters, and independent object information.

**Features:**
- Create two `StudentID` objects using parameterized and no-argument constructors.
- Update student information using setter methods.
- Change a student's major using setter methods.
- Use `toggleActive()` to change a student's active status.
- Verify individual object information using `getMajor()` and `isActive()` getter methods.
- Demonstrate how separate objects maintain their own independent information.

## Technologies & Concepts
- Java
- Object-Oriented Programming
- Classes and Objects
- Constructors and Constructor Overloading
- Method Overloading
- Encapsulation
- Getters and Setters
- Methods and Parameters
- Return Values
- Code Reusability
- DecimalFormat

## About
Through these projects, I gained experience applying Java programming concepts to practical applications while developing my understanding of object-oriented programming, method overloading, constructors, and encapsulation.
