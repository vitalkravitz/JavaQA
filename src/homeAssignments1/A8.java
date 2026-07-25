package homeAssignments1;

import java.util.Scanner;

public class A8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = in.nextLine();

        //print out the length of the word, the first and last letters, and does it equals: "java" (not case sensitive)
        System.out.println("Length: " + word.length());
        System.out.println("First letter: " + word.charAt(0));
        System.out.println("Last letter: " + word.charAt(word.length() - 1));
        System.out.println("Equals 'java': " + word.equalsIgnoreCase("java"));
    }
}
