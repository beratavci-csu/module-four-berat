import java.util.Scanner;

public class GradeStatistics {

	public static void main (String [] args) {
		Scanner scnr = new Scanner(System.in);
	
		float gradeMax = 0.0f;
		float gradeMin = 0.0f;
		float gradeInput;
		float gradeSum = 0.0f;

		System.out.println("This program will calculate the average grade, maximum grade, and minimum grade of a class of 10 students\n");
		
		for (int i = 1; i <= 10; ++i) {
			System.out.print("Please enter the grade of student " + i + ": ");
			gradeInput = scnr.nextFloat();
			
			while ((gradeInput < 0.0f) || (gradeInput > 100.0f)) {
				System.out.println("\nERROR: the grade " +  gradeInput +  "% is not valid. Try again.\n");
				System.out.print("Please enter the grade of student " + i + ": ");
				gradeInput = scnr.nextFloat();
				}
				
			if ((gradeInput > gradeMax) || (i == 1)) {
				gradeMax = gradeInput;
			}
			if ((gradeInput < gradeMin) || (i == 1)) {
				gradeMin = gradeInput;
			}
			gradeSum += gradeInput;
		}
		
		System.out.println("");
		System.out.println(":RESULTS:");
		System.out.println("Grade Average: " + String.format("%.2f", (gradeSum / 10)));
		System.out.println("Highest Grade: " + String.format("%.2f", gradeMax));
		System.out.println("Lowest Grade: " +  String.format("%.2f", gradeMin));
	}
}



/*
Write a program that will provide important statistics for the grades in a class. 
The program will utilize a for-loop to read ten floating-point grades from user input. 
Include code to prevent an endless loop. Ask the user to enter the values, then print the following data:

Average
Maximum
Minimum

pseudocode, 
source code, and s
creenshots of the application executing the application, 
the results and 
GIT repository 
*/


