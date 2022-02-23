package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner numberInput = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100");
        Integer number = numberInput.nextInt();

        do {
            System.out.println("insert a number between 1 and 100");
            number = numberInput.nextInt();
        } while(number < 0 || number > 100);

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

