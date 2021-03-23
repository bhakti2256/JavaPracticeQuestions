package com.practice;

import java.util.Scanner;

public class Array_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array 1:");
        int [][] array1 = new int[2][3];
        System.out.println("Enter array elements in row-wise manner: ");
        for (int i = 0; i<2 ; i++){
            for(int j = 0; j<3;j++){
                array1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array 2:");
        int [][] array2 = new int[2][3];
        System.out.println("Enter array elements in row-wise manner: ");
        for (int i = 0; i<2 ; i++){
            for(int j = 0; j<3;j++){
                array2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Sum of Array 1 and Array 2:");
        for (int i = 0; i<2 ; i++){
            for(int j = 0; j<3;j++){
                System.out.print(array1[i][j] + array2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
