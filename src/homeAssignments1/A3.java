package homeAssignments1;

import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number ");
        String num1 = input.nextLine();
        System.out.print("Enter another number ");
        String num2 = input.nextLine();
        System.out.println(Integer.parseInt(num1) + Integer.parseInt(num2));
        System.out.println(Integer.parseInt(num1) - Integer.parseInt(num2));
        System.out.println(Integer.parseInt(num1) * Integer.parseInt(num2));
        System.out.println(Integer.parseInt(num1) / Integer.parseInt(num2));

        input.close();
    }
}
