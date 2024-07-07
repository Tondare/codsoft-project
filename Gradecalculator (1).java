/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Gradecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of subjects: ");
        int numSubjects = sc.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();
            while (marks < 0 || marks > 100) {
                System.out.println(" opps....Invalid marks. Please enter marks between 0 and 100.");
                System.out.println("Enter marks for subject " + i + "out of 100): ");
                marks = sc.nextInt();
            }
            totalMarks += marks;
        }
        System.out.println("Student  Final Result: ");
        System.out.println("Total marks obtained in all subjects: " + totalMarks);

        int AveragePercentage = totalMarks / numSubjects;

        System.out.println("Average Percentage: " + AveragePercentage);
              if (AveragePercentage >= 90) {
            System.out.println(" student grade: A+");
        }

        else if (AveragePercentage >= 80) {
            System.out.println("student grade: A");
        }

        else if (AveragePercentage >= 60) {
            System.out.println("student grade: B");
        }

        else if (AveragePercentage >= 50) {
            System.out.println("student grade: C");
        }

        else if (AveragePercentage >= 40) {
            System.out.println("student grade: D");
        }

        else if (AveragePercentage >= 35) {
            System.out.println("student grade: E");
        }

        else {
            System.out.println("student grade is:Fail ");
        }

        sc.close();
    }
}