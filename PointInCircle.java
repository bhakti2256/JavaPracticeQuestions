package com.practice;

import java.util.Scanner;
import java.lang.Math;

public class PointInCircle {
    public static boolean pointCheck(int a, int b){
        // distance = 10; //distance from origin
        double temp = Math.pow(a,2) + Math.pow(b,2);
        //distance from point to origin should be less than or equal to 10 fo the point to be in circle
        return Math.sqrt(temp) <= 10;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter coordinates of x and y:");
        int a = input.nextInt();
        int b = input.nextInt();
        boolean check = pointCheck(a,b);
        if(check){
            System.out.println("Point (" + (double)a + "," + (double)b + ") is in the circle");
        }
        else
            System.out.println("Point (" + (double)a + "," + (double)b + ") is not in the circle");
    }
}
