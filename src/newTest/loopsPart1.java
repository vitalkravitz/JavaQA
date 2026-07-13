package newTest;

import java.util.Scanner;

public class loopsPart1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int grade, sum = 0;
        double avg;
        for (int i = 1; i <= 10; i++) {
            System.out.println("enter the grade " + i + ":");
            grade = in.nextInt();
            System.out.println("grade entered successfully " + grade);
            sum += grade;
        }
        avg = sum / 10;
        System.out.println("the average is " + avg);

        in.close();
    }

}
