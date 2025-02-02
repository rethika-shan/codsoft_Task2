// This code displays Total Marks according to each Subjects...
import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	
	//Display...
	System.out.println("---------- Grading Criteria ----------");
        System.out.println("O: 90% and above");
	System.out.println("A: 80% to less than 90%");
	System.out.println("B: 75% to less than 80%");
	System.out.println("C: 65% to less than 75%");
	System.out.println("D: 40% to less than 65%");
	System.out.println("F: Less than 40%\n");
	System.out.println("----------------------------------------\n");


        // Input the number of subs...
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int[] marks = new int[numSubjects];
        int totalMarks = 0;
	int Total=0;
        double averagePercentage;
        char grade;
        
        // Input the each subs marks...
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
	    Total+=100;
        }

        averagePercentage = (double) totalMarks / numSubjects;

        if (averagePercentage >= 90) {
            grade = 'O';
        } else if (averagePercentage >= 80) {
            grade = 'A';
        } else if (averagePercentage >= 75) {
            grade = 'B';
        } else if (averagePercentage >= 65) {
            grade = 'C';
        } else if (averagePercentage >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }
	
	//Output...
        System.out.println("\n---------- Results ----------");
	System.out.println("Total Marks: " + totalMarks + " / " + Total);
	System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
	System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}
