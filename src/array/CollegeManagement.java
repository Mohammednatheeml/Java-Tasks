package array;


import java.util.Scanner;

public class CollegeManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][][] marks = new int[2][2][3];

        // Get marks
        for (int i = 0; i < marks.length; i++) {

            System.out.println("\nDepartment " + (i + 1));

            for (int j = 0; j < marks[i].length; j++) {

                System.out.println("Class " + (j + 1));

                for (int k = 0; k < marks[i][j].length; k++) {

                    System.out.print("Student " + (k + 1) + ": ");
                    marks[i][j][k] = sc.nextInt();
                }
            }
        }

        int overallHighest = 0;

        // Display and calculate
        for (int i = 0; i < marks.length; i++) {

            int departmentHighest = 0;

            System.out.println("\nDepartment " + (i + 1));

            for (int j = 0; j < marks[i].length; j++) {

                int total = 0;

                System.out.println("\nClass " + (j + 1));

                for (int k = 0; k < marks[i][j].length; k++) {

                    System.out.println("Student " + (k + 1)
                            + ": " + marks[i][j][k]);

                    total += marks[i][j][k];

                    if (marks[i][j][k] > departmentHighest) {
                        departmentHighest = marks[i][j][k];
                    }

                    if (marks[i][j][k] > overallHighest) {
                        overallHighest = marks[i][j][k];
                    }
                }

                double average = (double) total / marks[i][j].length;

                System.out.println("Class Total: " + total);
                System.out.println("Class Average: " + average);
            }

            System.out.println("\nDepartment Highest Mark: "
                    + departmentHighest);
        }

        System.out.println("\nOverall Highest Mark: " + overallHighest);

        sc.close();
    }
}
