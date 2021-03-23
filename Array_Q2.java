package com.practice;

import java.util.Scanner;

public class Array_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want in the array: ");
        byte n = sc.nextByte();
        int [] array = new int[n];
        System.out.println("Enter array elements: ");
        for(int i = 0 ; i < n ; i++){
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the number which you want to find: ");
        byte value = sc.nextByte();
        byte flag = 0;
        for(int i=0;i<n;i++){
            if(array[i] == value){
                flag = 1;
                System.out.println(value + " found at position " + (i+1));
                break;
            }
        }
        if(flag == 0){
            System.out.println(value + " not found :-(");
        }
    }
}
