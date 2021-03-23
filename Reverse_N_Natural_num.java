package com.practice;

import java.util.Scanner;

public class Reverse_N_Natural_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many natural numbers you want: ");
        byte n = sc.nextByte();

        for (int i = n; i > 0; i--)
        {
            System.out.println(i);
        }
    }
}
