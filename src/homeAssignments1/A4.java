package homeAssignments1;

import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();


        if(age < 18){
                System.out.println("Minor");
            }else if (age < 65){
                System.out.println("Adult");
            }else{
                System.out.println("Old");
            }
        input.close();
    }
}
