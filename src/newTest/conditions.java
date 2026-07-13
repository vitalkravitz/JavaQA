package newTest;

import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number;
        System.out.println("enter the number");
        number = in.nextInt();
        /*
        boolean checkZugi;

        System.out.println("Enter a number");
        number = in.nextInt();

        checkZugi = (number % 2 == 0);

        if(checkZugi){
            System.out.println("The number is even");
        }else {
            System.out.println("The number is not even");
        }*/
        if(number > 6){
            System.out.println(number + " is greater than 6");
        }else if(number == 6){
            System.out.println(number + " is equal to 6");
        }else{
            System.out.println(number + " is smaller than 6");
        }
        in.close();




    }
}
