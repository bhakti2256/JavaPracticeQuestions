package com.practice;

import java.util.Scanner;
import java.lang.Math;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Welcome to Guessing the number Game---");
        int number = (int)(Math.random()*101);

        System.out.println("Guess a Magic Number between 0 to 100");
        int guess = -1;

        while (guess != number){

                System.out.print("Enter your guess: ");
                guess = sc.nextInt();

                if(guess == number)
                    System.out.println("Yes the number is "+ guess);
                else if(guess<number)
                    System.out.println("Your guess is too low!");
                else
                    System.out.println("Your guess is too high!");

        }
    }
}
