package newTest;

import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args) {

        Scanner in =  new Scanner(System.in);

        int number1, number2, sum, dif;
        System.out.println("enter 1st number");
        number1 = in.nextInt();
        System.out.println("enter 2nd number");
        number2 = in.nextInt();
        in.close();
        sum = number1 + number2;
        dif = number1 - number2;
        System.out.println("the sum is "+ sum + " !");
        System.out.println("the dif is "+ dif + " !");

    }
}
