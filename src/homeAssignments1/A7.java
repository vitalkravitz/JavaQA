package homeAssignments1;

import java.util.Scanner;

public class A7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        int count = 0;
        int sum = 0;
        int num;
         
        while (true) {
            System.out.print("Enter a number: ");
            num = input.nextInt();
             
            if (num == 0) {
                break;
            }
             
            count++;
            sum += num;
        }
         
        System.out.println("Numbers entered: " + count);
        System.out.println("Total sum: " + sum);

        input.close();
    }
}
