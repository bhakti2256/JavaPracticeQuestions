package com.practice;

import java.util.Scanner;

public class N_odd_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many odd numbers you want: ");
        byte n = sc.nextByte();

        for(int i=0;i<n;i++)
        {
            System.out.println(2*i+1);
        }
    }
}
