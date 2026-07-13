package newTest;

import java.util.Scanner;

public class loopsPart2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int grade, sum = 0, count = 0;
        double avg;

        System.out.println("enter the grade");
        grade = in.nextInt();

        while(grade != -1 ){
            count++;
            sum += grade;

            System.out.println("enter the grade" + (count + 1));
            grade = in.nextInt();
        }

        if(count != 0){
            avg = (double)sum / count;
            if (avg >= 95.0){
                System.out.println("great average");
            }else if (avg >= 75){
                System.out.println("good average");
            }else{
                System.out.println("you suck");
            }

            System.out.println("you're average is " + avg);

        }

        in.close();
    }

}
