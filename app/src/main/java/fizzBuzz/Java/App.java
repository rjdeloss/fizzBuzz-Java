/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package fizzBuzz.Java;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner numberInput = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100");
        Integer number = numberInput.nextInt();

        if (number < 1 || number > 100) {
            do {
                System.out.println("insert a number between 1 and 100");
                number = numberInput.nextInt();
            } while(number < 1 || number > 100);
        }

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
