package homeAssignments1;

import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("hello " + name + ", you're " + age + " years old!");

        input.close();
    }

}
