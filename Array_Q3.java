package com.practice;

import java.util.Scanner;

public class Array_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Students in the class: ");
        byte n = sc.nextByte();
        int [] array = new int[n];
        int sum = 0;
        //double avg;
        System.out.println("Enter Physics marks of " + n + " students:");
        for(int i = 0 ; i < n ; i++){
            array[i] = sc.nextInt();
            sum += array[i];
        }
        System.out.println("Average Marks in Physics: " + ((double)sum/n));
    }
}
