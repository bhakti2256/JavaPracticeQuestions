package com.practice;

import java.util.Scanner;

public class Array_Q8 {
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

        int flag = 0;
        for(int i=0;i<n-1;i++){
            if(array[i]>=array[i+1]){
                flag = 1;
            }
        }
        if(flag == 0)
            System.out.println("Array is Sorted :-)");
        else
            System.out.println("Array is not Sorted :-(");
    }
}
