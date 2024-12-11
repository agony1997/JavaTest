package org.example;

import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {

        int target = 8;
        int times = 4;

        GuessGame guessGame = new GuessGame();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Game start");
        guessGame.guessGame(target, times,scanner);
        guessGame.guessGame(target,scanner);

        scanner.close();
    }

    void guessGame(int target, int times,Scanner scanner) {
        int guess = 0;
        System.out.println("You have " + times + " times. Enter your guess: ");

        for (int i = 1; i <= times; i++) {
            guess = scanner.nextInt();
            if (guess > target) {
                System.out.println("Lower...(" + i + "/" + times + ")");
            } else if (guess < target) {
                System.out.println("Upper...(" + i + "/" + times + ")");
            } else {
                System.out.println("You got it! Target = " + target);
                break;
            }
        }
        if (guess != target) {
            System.out.println("\n" + "Game over,you are suck");
        }
    }

    void guessGame(int target,Scanner scanner) {
        int guess = 0;
        System.out.println("Enter your guess: ");

        while (guess != target) {
            guess = scanner.nextInt();
            if (guess > target) {
                System.out.println("Lower...");
            } else if (guess < target) {
                System.out.println("Upper...");
            } else {
                System.out.println("You got it! Target = " + target);
                break;
            }
        }
    }
}

