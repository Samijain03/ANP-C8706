package june20;
import java.util.Scanner;


public class Grade {
	 public static void main(String[] args) {
		 char grade;
		 Scanner s = new Scanner(System.in);
		 
		 System.out.print("Enter the student's score: ");
		 int marks = s.nextInt();
		 
	        if (marks >= 90 && marks <= 100) {
	            grade = 'A';
	            System.out.print("A");
	        }
	        else if (marks >= 80 && marks <= 89) {
	            grade = 'B';
	            System.out.print("B");
	        }
	        else if (marks >= 70 && marks <= 79) {
	            grade = 'C';
	            System.out.print("C");
	        }
	        else if (marks >= 60 && marks<= 69) {
	            grade = 'D';
	            System.out.print("D");
	        }
	        else if (marks < 60) {
	            grade = 'F';
	            System.out.print("F");
	        } 
	        else {
	            System.out.println("Invalid score. Please enter a score between 0 and 100.");
	        }
	 }
}
