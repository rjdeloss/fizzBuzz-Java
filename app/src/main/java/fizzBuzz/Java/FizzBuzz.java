package fizzBuzz.Java;

import java.util.Scanner;

public class FizzBuzz {
    public void doFizzBuzz() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number < 1 || number > 100) {
            do {
                System.out.println("please enter a number between 1 and 100");
                number = scanner.nextInt();
            } while (number < 1 || number > 100);
        }

        for(int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
