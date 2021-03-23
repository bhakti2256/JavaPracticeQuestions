package com.practice;

import java.util.Scanner;

public class LoopsPracticeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Question 1:
        int n = 4;
        for (int i =n; i>0 ; i--)
        {
            for(int j = 0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //Question 2:
        System.out.print("How many number of sum you want: ");
        byte  num = sc.nextByte();
        int sum = 0;
        int temp = num;
        while (num>0)
        {
            sum = sum+2;
            num--;
        }
        System.out.println("Sum of " + temp + " even numbers is " + sum);

        //Question 3:
        System.out.print("\nEnter which number table you want: ");
        byte number = sc.nextByte();
        for (int i=1;i<=10;i++)
        {
            System.out.println(number + " X " + i + " = " + (number*i));
        }

        //Question 4:
        System.out.println("\nMultiplication table of 10 in reverse order:");
        for (int i=10;i>0;i--)
        {
            System.out.println(number + " X " + i + " = " + (number*i));
        }
    }
}
