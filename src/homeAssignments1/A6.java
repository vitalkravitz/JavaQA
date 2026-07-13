package homeAssignments1;

import java.util.Scanner;

public class A6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }

        in.close();
    }
}
