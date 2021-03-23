package com.practice;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println("---Welcome to Rock Paper Scissors Game---");
        System.out.println("Notations:");
        System.out.println("(a) Rock = 0");
        System.out.println("(b) Paper = 1");
        System.out.println("(c) Scissor = 2");
        System.out.println("Lets start the game:-)");
        Scanner sc =  new Scanner(System.in);
        Random rand = new Random();

        int i = 1;
        int player = 0;
        int comp = 0;
        while (i<=5) {
            System.out.println("\nRound " +i+":");
            System.out.print("Enter your choice: ");
            byte choice = sc.nextByte();

            int c_choice = rand.nextInt(3);
            System.out.println("Computer chooses: " + c_choice);

            if (choice == c_choice)
                System.out.println("Match Draws");
            else {
                if (choice == 0) {
                    if (c_choice == 1) {
                        System.out.println("Computer Wins!");
                        comp++;
                    }
                    else if (c_choice == 2) {
                        System.out.println("You Win!!!");
                        player++;
                    }
                }
                if (choice == 1) {
                    if (c_choice == 2){
                        System.out.println("Computer Wins!");
                        comp++;
                    }
                    else if (c_choice == 0) {
                        System.out.println("You Win!!!");
                        player++;
                    }
                }
                if (choice == 2) {
                    if (c_choice == 0) {
                        System.out.println("Computer Wins!");
                        comp++;
                    }
                    else if (c_choice == 1) {
                        System.out.println("You Win!!!");
                        player++;
                    }
                }
            }
            i++;
        }
        if(player > comp)
            System.out.println("\nPlayer wins by " + player + "-" + comp);
        else
            System.out.println("\nComputer wins by " + comp + "-" + player);
    }
}
