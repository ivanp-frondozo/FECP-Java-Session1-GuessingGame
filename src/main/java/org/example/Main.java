package org.example;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = (int)(Math.random() * 5) + 1;
        boolean guessedCorrectly = false;

        System.out.println("I'm guessing a number between 1 to 5");

        for (int i = 1; i <= 3; i++) {
            System.out.print("Guess " + i + ": ");
            int guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("You guessed it!");
                System.out.println("You win!");
                guessedCorrectly = true;
                break;
            } else {
                System.out.println("Wrong Guess.");
            }
        }

        if (!guessedCorrectly) {
            System.out.println("You lose. The correct number was " + secretNumber + ".");
        }

        scanner.close();
    }
}