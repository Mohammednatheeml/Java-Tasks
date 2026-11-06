package array;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[10];

        int highest = 0;
        int lowest = 100;
        int pass = 0;
        int fail = 0;
        int total = 0;

        // Get marks
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter mark of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            total += marks[i];

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }

            if (marks[i] >= 35) {
                pass++;
            } else {
                fail++;
            }
        }

        // Display marks
        System.out.println("\nStudent Marks:");

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }

        double average = (double) total / marks.length;

        System.out.println("\nHighest Mark: " + highest);
        System.out.println("Lowest Mark: " + lowest);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Passed Students: " + pass);
        System.out.println("Failed Students: " + fail);

      
    }
}
