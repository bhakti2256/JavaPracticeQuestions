package com.practice;

import java.util.Scanner;

public class Array_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Reading n from user
        System.out.print("Enter the number of elements you want in the array: ");
        byte n = sc.nextByte();

        //Creating array of size n
        int [] array = new int[n];

        //Taking array elements
        System.out.println("Enter array elements: ");
        for(int i = 0 ; i < n ; i++){
            array[i] = sc.nextInt();
        }

        int temp;
        for(int i=0;i<n/2;i++) {
            //Swap Elements
            temp = array[i];
            array[i] = array[n-(i+1)];
            array[n-(i+1)] = temp;
        }

        System.out.println("Reverse Array: ");
        for(int i = 0 ; i < n ; i++){
            System.out.print(array[i] + " ");
        }
    }
}
