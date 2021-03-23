package com.practice;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        //Question 2:
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks:");

        System.out.print("Subject 1: ");
        byte sub1 = sc.nextByte();

        System.out.print("Subject 2: ");
        byte sub2 = sc.nextByte();

        System.out.print("Subject 3: ");
        byte sub3 = sc.nextByte();

        double percentage = (sub1+sub2+sub3)/3.0;
        if(percentage == 40 || (sub1 >= 33 && sub2 >= 3 && sub3 >= 33))
        {
            System.out.println("Student passes the exam :-)");
        }
        else
        {
            System.out.println("Student fails in the exam :-(");
        }

        //Question 4:
        System.out.print("Enter any number between 1 - 7: ");
        short num = sc.nextShort();

        switch (num)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Please select a valid number ");
        }
    }
}
