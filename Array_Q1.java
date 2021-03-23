package com.practice;

import java.util.Scanner;

public class Array_Q1 {
    static public void main(String[] args){
        //Question 1:
        Scanner sc = new Scanner(System.in);
        float [] array = new float[5];
        System.out.println("Enter 5 elements:");
        //int i = 0;
        for (int i = 0 ; i< 5 ; i++){
            array[i] = sc.nextFloat();
        }
        float sum = 0f;
        System.out.println("Array you have entered:");
        for (int i = 0 ; i< 5 ; i++){
            System.out.print(array[i] + " ");
            sum += array[i];
        }
        System.out.print("\nSum of array elements: " + sum);
    }
}
