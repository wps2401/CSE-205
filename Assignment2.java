// Assignment #2
// Arizona State University - CSE205
//         Name: William Schuhmann
//    StudentID: 1215016803
//      Lecture: T/Th 10:30 am 
//  Description: Reads in an unspecified number of integers from standard input, 
//performs some calculations on the inputted numbers, and outputs the results of 
//those calculations to standard output. Program will continue to read in numbers 
//until the number 0 is entered. 

import java.util.Scanner;  // use the Scanner class located in the "java.util" directory

public class Assignment2 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int minInt = 0;
		int number = 1;
		int minEven = 0;
		int negCount = 0;
		int oddSum = 0;
		while (number != 0) { // loops as long as input is not 0.
			number = input.nextInt();
			// Determines if input is even and less than minimum even number.
			if (((number % 2) == 0) && (number < minEven)){
				minEven = number;
			} // Determines if input is odd and sums odd numbers. 
			if ((number % 2) != 0) {
				oddSum = oddSum + number;
			} // Determines minimum input.
			if (number < minInt) {
				minInt = number;
			} // Increments counters by 1 if input is a negative input
			if (number < 0) {
				negCount++;
			}
		} // Output
		System.out.print("The minimum integer is " + minInt + "\n");
		System.out.print("The smallest even integer in the sequence is " + minEven + "\n");
		System.out.print("The count of negative integers in the sequence is " + negCount + "\n");
		System.out.print("The sum of odd integers is " + oddSum + "\n");
		}
	}

		


