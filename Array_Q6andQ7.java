package com.practice;

import java.util.Scanner;

public class Array_Q6andQ7 {
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

        int max = array[0];
          int min = array[0];
        for(int i = 0 ; i < n ; i++){
            if(array[i] > max){
                max = array[i];
                 if(array[i] < min){
                min = array[i];
            }
        }
        System.out.print("Maximum number in the array: " + max);

      
        
        System.out.print("\nMinimum number in the array: " + min);
    }
}
