package com.practice;

import java.text.NumberFormat;
import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks:");
        System.out.print("Enter marks for Subject-1: ");
        byte sub1 = sc.nextByte();

        System.out.print("Enter marks for Subject-2: ");
        byte sub2 = sc.nextByte();

        System.out.print("Enter marks for Subject-3: ");
        byte sub3 = sc.nextByte();

        System.out.print("Enter marks for Subject-4: ");
        byte sub4 = sc.nextByte();

        System.out.print("Enter marks for Subject-5: ");
        byte sub5 = sc.nextByte();

        System.out.print("The marks you have entered are out of - ");
        byte basic = sc.nextByte();

        double percent = ((float)sub1+(float)sub2+(float)sub3+(float)sub4+(float)sub5)/(basic*5)*100;
        System.out.println("Percentage is " + percent + "%");
    }
}
