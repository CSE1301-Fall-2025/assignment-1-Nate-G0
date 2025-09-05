

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.nextLine();
        System.out.println("How many studios have you attended?");
        int studiosAttended = in.nextInt();
        System.out.println("What is your average quiz grade?");
        double averageQuizGrade = in.nextDouble();
        System.out.println("What is your average exam grade?");
        double averageExamGrade = in.nextDouble();

        double studioGrade = (studiosAttended / 8.0) * .15;
        double quizGrade = (averageQuizGrade / 100) * .25;
        double examGrade = (averageExamGrade / 100) * .60;
        double finalGrade = (studioGrade + quizGrade + examGrade) * 100;

        System.out.println("CSE1301 Grade for: " + name);
        System.out.println("Number of studioes attended: " + studiosAttended);
        System.out.println("Weighted studio grade (out of 15): " + studioGrade);
        System.out.println("Average quiz grade: " + averageQuizGrade);
        System.out.println("Weighted quiz grade (out of 25): " + quizGrade);
        System.out.println("Average exam grade: " + averageExamGrade);
        System.out.println("Weighted exam grade (out of 60): " + examGrade);
        System.out.println("Total Grade: " + finalGrade);
        in.close();
    }
}   